package com.example.cop4331;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Edit extends AppCompatActivity
{
    private static final String TAG = "GalleryActivity";
    private static String URL_STATS ="http://www.cop4331.org/LAMPAPI/getStatsApp.php";
    private static String URL_UPDATE ="http://www.cop4331.org/LAMPAPI/updateCharacterApp.php";
    String nameEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        getIncomingIntent();
        getStats();


        hideNavigationBar();

        // Creating instance of a button to cancel the creation of a new card.
        ImageView goBackBtnEdit = (ImageView)findViewById(R.id.goBackBtnEdit);
        goBackBtnEdit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                Intent startIntent = new Intent(getApplicationContext(), Menu.class);
                startActivity(startIntent);

            }
        });


        Button save = (Button) findViewById(R.id.saveBtn);

        goBackBtnEdit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                JsonArrayRequest getInfo = new JsonArrayRequest(Request.Method.POST, URL_UPDATE, new Response.Listener<JSONArray >()
                {
                    @Override
                    public void onResponse(JSONArray  response)
                    {
                        try
                        {
                            JSONArray jsonArray = new JSONArray(response);

//                            for (int i = 0; i < jsonArray.length(); i++)
//                            {
//                                JSONObject jsonObject = jsonArray.getJSONObject(i);
//                                names.add(jsonObject.getString("name"));
//                                classes.add(jsonObject.getString("career"));
//                                races.add(jsonObject.getString("race"));
//                                cHp.add(jsonObject.getString("hpCurrent"));
//                                mHp.add(jsonObject.getString("hpMax"));
//                                imgIndex.add(i);
//
//                            }
                        }catch(JSONException e)
                        {
                            Toast.makeText(Edit.this, "Error Updating: " + e.toString(), Toast.LENGTH_SHORT).show();
                            e.printStackTrace();

                        }

                    }
                }, new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error)
                    {
                        Toast.makeText(Menu.this, "Error Updating!: " + error.toString(), Toast.LENGTH_SHORT).show();
                        error.printStackTrace();

                    }
                })
                {
                    protected Map<String, String> getParams() throws AuthFailureError
                    {
                        HashMap<String, String> params = new HashMap<>();
                        params.put("userId", MainActivity.success);

                        return params;
                    }

                };

                RequestQueue requestQueue = Volley.newRequestQueue(this);
                requestQueue.add(getInfo);

            }
        });


    }

    // Reciving and the info that is going to be display on the edit activity
    private void getIncomingIntent()
    {
        Log.d(TAG, "getIncomingIntent: checking for incoming intent");

        if (getIntent().hasExtra("nameEdit") && getIntent().hasExtra("classEdit") && getIntent().hasExtra("raceEdit") && getIntent().hasExtra("maxEdit") && getIntent().hasExtra("currentEdit"))
        {
            Log.d(TAG, "getIncomingIntent: found intent extras");

            nameEdit = getIntent().getStringExtra("nameEdit");
            String classEdit = getIntent().getStringExtra("classEdit");
            String raceEdit = getIntent().getStringExtra("raceEdit");
            String maxEdit = getIntent().getStringExtra("maxEdit");
            String currentEdit = getIntent().getStringExtra("currentEdit");

            setInfo(nameEdit, classEdit, raceEdit, maxEdit, currentEdit);
        }
    }

    // Sets the info in the corresponding text box.
    private void setInfo(String nameEdit, String classEdit, String raceEdit, String maxEdit, String currentEdit)
    {
        Log.d(TAG, "setImage: setting the info to the widgets");

        EditText name = (EditText)findViewById(R.id.nameEditText);
        name.setText(nameEdit);

        EditText classE = (EditText)findViewById(R.id.classEditText);
        classE.setText(classEdit);

        EditText race = (EditText)findViewById(R.id.raceEditText);
        race.setText(raceEdit);

        EditText max = (EditText)findViewById(R.id.maxEditText);
        max.setText(maxEdit);

        EditText current = (EditText)findViewById(R.id.currentEditText);
        current.setText(currentEdit);
    }

    public void getStats()
    {
        final String [] statsDisplay = new String [16];

        StringRequest stringRequest = new StringRequest(Request.Method.POST,
                URL_STATS, new Response.Listener<String>()
        {
            @Override
            public void onResponse(String response)
            {
                try
                {
                    JSONArray jsonArray = new JSONArray(response);

                    JSONObject jsonObject = jsonArray.getJSONObject(0);
                    statsDisplay[0] = jsonObject.getString("WS");
                    statsDisplay[1] =jsonObject.getString("BS");
                    statsDisplay[2] =jsonObject.getString("S");
                    statsDisplay[3] =jsonObject.getString("T");
                    statsDisplay[4] =jsonObject.getString("AG");
                    statsDisplay[5] =jsonObject.getString("INTE");
                    statsDisplay[6] =jsonObject.getString("WP");
                    statsDisplay[7] =jsonObject.getString("FEL");
                    statsDisplay[8] =jsonObject.getString("A");
                    statsDisplay[9] =jsonObject.getString("W");
                    statsDisplay[10] =jsonObject.getString("SB");
                    statsDisplay[11] =jsonObject.getString("TB");
                    statsDisplay[12] =jsonObject.getString("M");
                    statsDisplay[13] =jsonObject.getString("MAG");
                    statsDisplay[14] =jsonObject.getString("IP");
                    statsDisplay[15] =jsonObject.getString("FPP");

                    setStats(statsDisplay);



                }catch(JSONException e)
                {
                    Toast.makeText(Edit.this, "Error getting stats info: " + e.toString(), Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                Toast.makeText(Edit.this, "Error getting stats info!: " + error.toString(), Toast.LENGTH_LONG).show();
                error.printStackTrace();
            }
        })
        {
            protected Map<String, String> getParams() throws AuthFailureError
            {
                HashMap<String, String> params = new HashMap<>();
                params.put("userId", MainActivity.success);
                params.put("name", nameEdit);

                return params;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    public void setStats(String [] statsDisplay)
    {
        int count  = 0;

        for (int i = 0; i < statsDisplay.length; i++)
            if (statsDisplay[i] == null)
                count++;

            if (count != 0)
                Toast.makeText(Edit.this, "Error not all information received. " + count, Toast.LENGTH_LONG).show();

            else
            {

                EditText ws = (EditText) findViewById(R.id.wsText);
                ws.setText(statsDisplay[0]);

                EditText bs = (EditText) findViewById(R.id.bsText);
                bs.setText(statsDisplay[1]);

                EditText s = (EditText) findViewById(R.id.sText);
                s.setText(statsDisplay[2]);

                EditText t = (EditText) findViewById(R.id.tText);
                t.setText(statsDisplay[3]);

                EditText ag = (EditText) findViewById(R.id.agText);
                ag.setText(statsDisplay[4]);

                EditText inte = (EditText) findViewById(R.id.inteText);
                inte.setText(statsDisplay[5]);

                EditText wp = (EditText) findViewById(R.id.wpText);
                wp.setText(statsDisplay[6]);

                EditText fel = (EditText) findViewById(R.id.felText);
                fel.setText(statsDisplay[7]);

                EditText a = (EditText) findViewById(R.id.aText);
                a.setText(statsDisplay[8]);

                EditText w = (EditText) findViewById(R.id.wText);
                w.setText(statsDisplay[9]);

                EditText sb = (EditText) findViewById(R.id.sbText);
                sb.setText(statsDisplay[10]);

                EditText tb = (EditText) findViewById(R.id.tbTecxt);
                tb.setText(statsDisplay[11]);

                EditText m = (EditText) findViewById(R.id.mText);
                m.setText(statsDisplay[12]);

                EditText mag = (EditText) findViewById(R.id.magText);
                mag.setText(statsDisplay[13]);

                EditText ip = (EditText) findViewById(R.id.ipText);
                ip.setText(statsDisplay[14]);

                EditText fpp = (EditText) findViewById(R.id.fppText);
                fpp.setText(statsDisplay[15]);
            }
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
