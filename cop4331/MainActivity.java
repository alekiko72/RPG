package com.example.cop4331;

import android.content.Intent;
import android.media.*;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    // Variables for the login.
    EditText userNameTag;
    EditText passwordTag;
    static protected String success;

    //private EditText username, password;
    private ProgressBar loading;
    private static String URL_LOGIN ="http://www.cop4331.org/LAMPAPI/LoginApp.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // video for the background login
        VideoView logInBackground = findViewById(R.id.loginBackground);
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.space_login;
        Uri uri1 = Uri.parse(videoPath1);
        logInBackground.setVideoURI(uri1);
        logInBackground.start();

        // Loops the video infinite amount of times.
        logInBackground.setOnPreparedListener(new MediaPlayer.OnPreparedListener(){
            @Override
            public void onPrepared(MediaPlayer mediaPlayer)
            {
                mediaPlayer.setLooping(true);
            }

        });


        // Creating instance of a button to access the menu page.
        Button login_btn = (Button)findViewById(R.id.loginBtn);
        loading = new ProgressBar(this);

        login_btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                // The conditionals check that the boxes are not empty.
                 userNameTag = (EditText)findViewById(R.id.usernameTag);
                 passwordTag = (EditText)findViewById(R.id.passwordTag);
                String strUsername = userNameTag.getText().toString();
                String strPassword = passwordTag.getText().toString();

                if (strUsername.length() == 0 && strPassword.length() == 0)
                {
                    Toast.makeText(MainActivity.this,"Please, Insert login info", Toast.LENGTH_SHORT).show();
                }

                else if (strUsername.length() == 0 || strPassword.length() == 0)
                {
                    if (strUsername.length() == 0)
                        Toast.makeText(MainActivity.this,"Please, Insert username", Toast.LENGTH_SHORT).show();

                    else
                        Toast.makeText(MainActivity.this,"Please, Insert password", Toast.LENGTH_SHORT).show();

                }

                else {

                    login();

                }

            }
        });


        // Creating instance of a button to access the registration page.
        TextView registerTag = (TextView)findViewById(R.id.registrationBtn);
        registerTag.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {


                Intent startIntent = new Intent(getApplicationContext(), Registration.class);
                startActivity(startIntent);

            }
        });

        hideNavigationBar();
    }

    // Method that sends requwst to the server to do login.
    private void login()
    {
        // Variables that contain the info inserted by the user.
        final String username = userNameTag.getText().toString().trim();
        final String password = hashPsswd(passwordTag.getText().toString().trim());

        StringRequest stringRequest = new StringRequest(Request.Method.POST,
                URL_LOGIN, new Response.Listener<String>()
        {
            @Override
            public void onResponse(String response)
            {
                try
                {
                    // Variable success stores the id for the user.///////////////////////////////////////////////////////////////////////////////
                    JSONObject jsonObject = new JSONObject(response);
                    success = jsonObject.getString("success");

                    if (!success.equals("0"))
                    {
                        Toast.makeText(MainActivity.this, "Success: ", Toast.LENGTH_SHORT).show();

                        Intent startIntent = new Intent(getApplicationContext(), Menu.class);
                        startActivity(startIntent);


                    }

                    else
                    {
                        Toast.makeText(MainActivity.this, "Wrong login info: ", Toast.LENGTH_SHORT).show();

                    }

                }catch(JSONException e)
                {
                    Toast.makeText(MainActivity.this, "Error: " + e.toString(), Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }


            }
        }, new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                Toast.makeText(MainActivity.this, "Error!: " + error.toString(), Toast.LENGTH_SHORT).show();
                error.printStackTrace();
            }
        })
        {
            protected Map<String, String> getParams() throws AuthFailureError
            {
                Map<String, String> params = new HashMap<>();

                params.put("username", username);
                params.put("password", password);

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


    // Makes sure the navigation bar remains hidden even if we close the app and comeback later.
    @Override
    protected void onResume()
    {
        super.onResume();
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
