package com.example.cop4331;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class Registration extends AppCompatActivity {

    private EditText insertUsername, insertPassword;
    private Button registerBtn;
    private ProgressBar loading;
    private static String URL_REGIST = "http://www.cop4331.org/LAMPAPI/registerApp.php";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        insertUsername = (EditText)findViewById(R.id.insertUsername);
        insertPassword = (EditText)findViewById(R.id.insertPassword);

        registerBtn = (Button)findViewById(R.id.registerBtn);

        loading = new ProgressBar(this);

        hideNavigationBar();

        // Creating an event when we click the register button.
        registerBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {


                String strUsername = insertUsername.getText().toString();
                String strPassword = insertPassword.getText().toString();

                if (strUsername.length() == 0 && strPassword.length() == 0)
                {
                    Toast.makeText(Registration.this,"Please, fill the boxes", Toast.LENGTH_SHORT).show();
                }

                else if (strUsername.length() == 0 || strPassword.length() == 0)
                {
                    if (strUsername.length() == 0)
                        Toast.makeText(Registration.this,"Please, Insert username", Toast.LENGTH_SHORT).show();

                    else
                        Toast.makeText(Registration.this,"Please, Insert password", Toast.LENGTH_SHORT).show();

                }

                else {

                    registerUser();

                }
            }
        });

        // Creating instance of a button to cancel the registration process.
        ImageView goBackBtn = (ImageView)findViewById(R.id.goBackBtn);
        goBackBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(startIntent);

            }
        });


    }


    private void registerUser()
    {
        final String newUser = insertUsername.getText().toString().trim();
        final String newPassword = hashPsswd(insertPassword.getText().toString().trim());
        final String userId = "0";

        StringRequest stringRequest = new StringRequest(Request.Method.POST,
                URL_REGIST, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject jsonObject = new JSONObject(response);
                    String success = jsonObject.getString("success");

                    if (success.equals("-1"))
                        Toast.makeText(Registration.this, "Username already taken", Toast.LENGTH_SHORT).show();

                    else {
                        Toast.makeText(Registration.this, "Register Success!", Toast.LENGTH_SHORT).show();

                        Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(startIntent);
                    }

                }catch (JSONException e)
                {
                    e.printStackTrace();
                    Toast.makeText(Registration.this, "Register Error! " + e.toString(), Toast.LENGTH_SHORT).show();
                    loading.setVisibility(View.GONE); //check
                    registerBtn.setVisibility(View.VISIBLE); // check
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Registration.this, "Register Error!" + error.toString(), Toast.LENGTH_SHORT).show();
                loading.setVisibility(View.GONE); //check
                registerBtn.setVisibility(View.VISIBLE); // check

            }
        })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("userId", userId);
                params.put("newUser", newUser);
                params.put("newPassword", newPassword);



                return params;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

    }

    // Algorithm that hash the password before they interact with the database.
    public static String hashPsswd(String passwordToHash)
    {
        String generatedPassword = null;
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            //Add password bytes to digest
            md.update(passwordToHash.getBytes());
            //Get the hash's bytes
            byte[] bytes = md.digest();
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            generatedPassword = sb.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }

        return generatedPassword;
    }


    // It hides the navegation bar.
    private void hideNavigationBar()
    {
        this.getWindow().getDecorView()
                .setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                );


    }
}
