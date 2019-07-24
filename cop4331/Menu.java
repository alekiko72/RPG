package com.example.cop4331;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Menu extends AppCompatActivity {

    private static String URL_INFO = "http://www.cop4331.org/LAMPAPI/tableApp.php";
    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<String> classes = new ArrayList<>();
    private ArrayList<String> races = new ArrayList<>();
    private ArrayList<String> cHp = new ArrayList<>();
    private ArrayList<String> mHp = new ArrayList<>();
    private ArrayList<Integer> imgIndex = new ArrayList<>();


    private ImageView test = null;


    // Creates instance of the recycle view.
    private void initRecyclerView()
    {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.recycleViewMenu);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerviewAdapter adapter = new RecyclerviewAdapter(this, imgIndex, names, classes, races, cHp, mHp);
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        createTable();
        initRecyclerView();

        // Creates instance of texview. This helps us to go back to the login menu if the logout tag gets clicked.
        TextView logoutTxt = (TextView)findViewById(R.id.logoutTag);
        logoutTxt.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {

                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(startIntent);
            }


        });

        // Creates instance of image. This helps us to create a new character if the tag gets clicked.
        ImageView createCharacterImg = (ImageView) findViewById(R.id.insertCharacterTag);
        createCharacterImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                Intent startIntent = new Intent(getApplicationContext(), newCharacter.class);
                startActivity(startIntent);
            }
        });

        hideNavigationBar();

        // Plays the video.
        VideoView videoBackground1 = findViewById(R.id.videoBackground1);
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.space;
        Uri uri1 = Uri.parse(videoPath1);
        videoBackground1.setVideoURI(uri1);
        videoBackground1.start();

        // Loops the video infinite amount of times.
        videoBackground1.setOnPreparedListener(new MediaPlayer.OnPreparedListener(){
            @Override
            public void onPrepared(MediaPlayer mediaPlayer)
            {
                mediaPlayer.setLooping(true);
            }
        });
    }

    // Will recive the json from the database to populate the tables in the menu.
    public void createTable()
    {
        StringRequest getInfo = new StringRequest(Request.Method.POST, URL_INFO, new Response.Listener<String>()
        {
            @Override
            public void onResponse(String response)
            {
                try
                {
                    JSONArray jsonArray = new JSONArray(response);

                    for (int i = 0; i < jsonArray.length(); i++)
                    {
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        names.add(jsonObject.getString("name"));
                        classes.add(jsonObject.getString("career"));
                        races.add(jsonObject.getString("race"));
                        cHp.add(jsonObject.getString("hpCurrent"));
                        mHp.add(jsonObject.getString("hpMax"));
                        imgIndex.add(i);

                    }
                }catch(JSONException e)
                {
                    Toast.makeText(Menu.this, "Error display cards: " + e.toString(), Toast.LENGTH_SHORT).show();
                    e.printStackTrace();

                }

            }
        }, new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                Toast.makeText(Menu.this, "Error display cards!: " + error.toString(), Toast.LENGTH_SHORT).show();
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
                .setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                        View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                );


    }

}