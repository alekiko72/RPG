package com.example.cop4331;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class newCharacter extends AppCompatActivity
{

    // Arrays that store the info of a new character.
    static protected String characterId;
    String[] talents;
    String[] skills;
    String[] traps;

    List<Properties> dataArrayTalents;
    List<Properties> dataArraySkills;
    List<Properties> dataArrayTraps;

    // Variables that work with the view display in the new character page.
    ListView myListView;
    String[] attributes;
    String[] descriptions;

    // URL
    private static String URL_NEW_CHAR = "http://www.cop4331.org/LAMPAPI/newCardApp.php";
    private static String URL_SKILLS = "http://www.cop4331.org/LAMPAPI/skillsTestAddApp.php";
    private static String URL_TALENTS = "http://www.cop4331.org/LAMPAPI/talentsTestAddApp.php";
    private static String URL_TRAPS = "http://www.cop4331.org/LAMPAPI/trapsTestAddApp.php";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_character);

        // Collects the data that is going to be display in the list.
        Resources res = getResources();
        myListView = (ListView) findViewById(R.id.myListView);
        attributes = res.getStringArray(R.array.attributes);
        descriptions = res.getStringArray(R.array.descriptions);

        // Creates the list on the create-character page.
        final characterAdapter characterAdapter = new characterAdapter(this, attributes, descriptions);
        myListView.setAdapter(characterAdapter);

        // Creating instance of a button to go back to the menu from the edit page.
        ImageView goBackBtnR = (ImageView) findViewById(R.id.goBackBtnR);
        goBackBtnR.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                Intent startIntent = new Intent(getApplicationContext(), Menu.class);
                startActivity(startIntent);

            }
        });


        // Creates instance of Button. This helps us to go back to the Menu after we have created an new character card.
        Button createCharacterBtn = (Button) findViewById(R.id.createCharacterBtn);
        createCharacterBtn.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                // Collecting information to create new card.
                View field0 = myListView.getChildAt(0);
                View field1 = myListView.getChildAt(1);

                EditText nameTag = field0.findViewById(R.id.cardFieldText);
                EditText raceTag = field1.findViewById(R.id.cardFieldText);

                String name = nameTag.getText().toString();
                String race = raceTag.getText().toString();

                // Conditionals that check for correct input from the user.
                if (name.length() == 0 && race.length() == 0)
                {
                    Toast toast1 = Toast.makeText(newCharacter.this, "Please, fill all the fields", Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                    toast1.show();
                } else if (name.length() == 0 || race.length() == 0)
                {
                    if (name.length() == 0)
                    {
                        Toast toast1 = Toast.makeText(newCharacter.this, "Insert Name", Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                        toast1.show();
                    } else
                    {
                        Toast toast1 = Toast.makeText(newCharacter.this, "Insert Race", Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                        toast1.show();
                    }

                } else if (!race.equalsIgnoreCase("Human") && !race.equalsIgnoreCase("Elf") && !race.equalsIgnoreCase("Dwarf") && !race.equalsIgnoreCase("Half"))
                {
                    Toast toast1 = Toast.makeText(newCharacter.this, "Valid races: Human, Elf, Dwarf, and Half", Toast.LENGTH_LONG);
                    toast1.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                    toast1.show();
                } else
                {
                    randomizeCharacter(name, race);
                }
            }


        });

        hideNavigationBar();
    }

    // Method that ensures that all the information is random depending on their career and race.
    private void randomizeCharacter(final String name, final String race)
    {
        String[] stats = Randomize.getStats(race);
        String definedCareer = Randomize.selectCareer(race);
        talents = Talents.getTalents(race, definedCareer);
        skills = Skills.getSkills(race, definedCareer);
        traps = Traps.getTraps(race, definedCareer);

        System.out.println("the career isssssssss  " + definedCareer);
        System.out.println("the stats " + Arrays.toString(stats));
        System.out.println("this is talents " + Arrays.toString(talents));
        System.out.println("the len of talents is  " + talents.length);
        System.out.println("this is the skills " + Arrays.toString(skills));
        System.out.println("the len of skills is  " + skills.length);
        System.out.println("this is traps " + Arrays.toString(traps));
        System.out.println("the len of traps is  " + traps.length);


        final String id = "0";
        final String career = definedCareer;
        final String userId = MainActivity.success;
        final String sessionId = "0";
        final String hpMax = "50";
        final String hpCurrent = "50";
        final String WS = stats[0];
        final String BS = stats[1];
        final String S = stats[2];
        final String T = stats[3];
        final String AG = stats[4];
        final String INTE = stats[5];
        final String WP = stats[6];
        final String FEL = stats[7];
        final String A = stats[8];
        final String W = stats[9];
        final String SB = stats[10];
        final String TB = stats[11];
        final String MAG = stats[12];
        final String M = stats[13];
        final String IP = stats[14];
        final String FPP = stats[15];

        // Request to send stats and basic info.
        final StringRequest stringRequest = new StringRequest(Request.Method.POST, URL_NEW_CHAR, new Response.Listener<String>()
        {
            @Override
            public void onResponse(String response)
            {
                try
                {
                    JSONObject jsonObject = new JSONObject(response);
                    String success = jsonObject.getString("success");

                    if (success.equals("-1"))
                    {
                        Toast toast1 = Toast.makeText(newCharacter.this, "Name belongs to another character", Toast.LENGTH_LONG);
                        toast1.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                        toast1.show();
                    } else
                    {
                        Toast toast1 = Toast.makeText(newCharacter.this, "Card created successfully!", Toast.LENGTH_LONG);
                        toast1.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                        toast1.show();

                        characterId = success;
                        insertCharacterInfo(characterId);

                        Intent startIntent = new Intent(getApplicationContext(), Menu.class);
                        startActivity(startIntent);
                    }

                } catch (JSONException e)
                {
                    Toast toast1 = Toast.makeText(newCharacter.this, "Error: " + e.toString(), Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                    toast1.show();

                    e.printStackTrace();
                }


            }
        }, new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                Toast toast1 = Toast.makeText(newCharacter.this, "Error: " + error.toString(), Toast.LENGTH_SHORT);
                toast1.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                toast1.show();

                error.printStackTrace();
            }
        })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError
            {
                Map<String, String> params = new HashMap<>();
                params.put("id", id);
                params.put("name", name);
                params.put("race", race);
                params.put("career", career);
                params.put("userId", userId);
                params.put("sessionId", sessionId);
                params.put("hpMax", hpMax);
                params.put("hpCurrent", hpCurrent);
                params.put("WS", WS);
                params.put("BS", BS);
                params.put("S", S);
                params.put("T", T);
                params.put("AG", AG);
                params.put("INTE", INTE);
                params.put("WP", WP);
                params.put("FEL", FEL);
                params.put("A", A);
                params.put("W", W);
                params.put("SB", SB);
                params.put("TB", TB);
                params.put("M", M);
                params.put("MAG", MAG);
                params.put("IP", IP);
                params.put("FPP", FPP);

                return params;
            }

        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

    }

    // Method that sends requests for skills, talents, and traps.
    public void insertCharacterInfo(final String characterId)
    {
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        dataArraySkills = new ArrayList<Properties>();
        dataArrayTalents = new ArrayList<Properties>();
        dataArrayTraps = new ArrayList<Properties>();

        for (int i = 0; i < skills.length; i++)
            dataArraySkills.add(new Properties(characterId, skills[i]));

        for (int i = 0; i < talents.length; i++)
            dataArrayTalents.add(new Properties(characterId, talents[i]));

        for (int i = 0; i < traps.length; i++)
            dataArrayTraps.add(new Properties(characterId, traps[i]));

        Gson gson = new Gson();

        final String newDataArraySkills = gson.toJson(dataArraySkills);
        final String newDataArrayTalents = gson.toJson(dataArrayTalents);
        final String newDataArrayTraps = gson.toJson(dataArrayTraps);

        StringRequest stringRequestSkills = new StringRequest(Request.Method.POST, URL_SKILLS, new Response.Listener<String>()
        {
            @Override
            public void onResponse(String response)
            {
                try
                {
                    JSONObject jsonObject = new JSONObject(response);
                    String success = jsonObject.getString("success");

                    if (success.equals("-1"))
                    {
                        Toast toast1 = Toast.makeText(newCharacter.this, "Error inserting skills: ", Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                        toast1.show();
                    }


                } catch (JSONException e)
                {
                    Toast toast1 = Toast.makeText(newCharacter.this, "Skills Error: " + e.toString(), Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                    toast1.show();

                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                Toast toast1 = Toast.makeText(newCharacter.this, "Skills Error!: " + error.toString(), Toast.LENGTH_SHORT);
                toast1.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                toast1.show();

                error.printStackTrace();
            }
        })
        {
            protected Map<String, String> getParams() throws AuthFailureError
            {
                HashMap<String, String> params = new HashMap<>();
                params.put("array", newDataArraySkills);

                return params;
            }

        };

        requestQueue.add(stringRequestSkills);

        StringRequest stringRequestTalents = new StringRequest(Request.Method.POST, URL_TALENTS, new Response.Listener<String>()
        {
            @Override
            public void onResponse(String response)
            {
                try
                {
                    JSONObject jsonObject = new JSONObject(response);
                    String success = jsonObject.getString("success");

                    if (success.equals("-1"))
                    {
                        Toast toast1 = Toast.makeText(newCharacter.this, "Error inserting talents: ", Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                        toast1.show();
                    }


                } catch (JSONException e)
                {
                    Toast toast1 = Toast.makeText(newCharacter.this, "Talents Error!: " + e.toString(), Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                    toast1.show();

                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                Toast toast1 = Toast.makeText(newCharacter.this, "Talents Error!: " + error.toString(), Toast.LENGTH_SHORT);
                toast1.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                toast1.show();

                error.printStackTrace();
            }
        })
        {
            protected Map<String, String> getParams() throws AuthFailureError
            {
                HashMap<String, String> params = new HashMap<>();
                params.put("array", newDataArrayTalents);

                return params;
            }

        };

        requestQueue.add(stringRequestTalents);



            StringRequest stringRequestTraps = new StringRequest(Request.Method.POST, URL_TRAPS, new Response.Listener<String>()
            {
                @Override
                public void onResponse(String response)
                {
                    try
                    {
                        JSONObject jsonObject = new JSONObject(response);
                        String success = jsonObject.getString("success");

                        if (success.equals("-1"))
                        {
                            Toast toast1 = Toast.makeText(newCharacter.this, "Error inserting Items: " , Toast.LENGTH_SHORT);
                            toast1.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                            toast1.show();


                        }


                    } catch (JSONException e)
                    {
                        Toast toast1 = Toast.makeText(newCharacter.this, "Items Error: " + e.toString(), Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                        toast1.show();

                        e.printStackTrace();

                    }

                }
            }, new Response.ErrorListener()
            {
                @Override
                public void onErrorResponse(VolleyError error)
                {
                    Toast toast1 = Toast.makeText(newCharacter.this, "Items Error!: " + error.toString(), Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                    toast1.show();

                    error.printStackTrace();
                }
            })
            {
                protected Map<String, String> getParams() throws AuthFailureError
                {
                    HashMap<String, String> params = new HashMap<>();
                    params.put("array", newDataArrayTraps);

                    return params;
                }

            };

            requestQueue.add(stringRequestTraps);
    }

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

