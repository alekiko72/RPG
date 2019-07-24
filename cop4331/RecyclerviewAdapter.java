package com.example.cop4331;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
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
import java.util.List;
import java.util.Map;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder>
{
    private static String URL_DELETE_CARD = "http://www.cop4331.org/LAMPAPI/deleteCardApp.php";
    private static String URL_DELETE_SKILLS = "http://www.cop4331.org/LAMPAPI/deleteSkillsApp.php";
    private static String URL_DELETE_TALENTS = "http://www.cop4331.org/LAMPAPI/deleteTalentsApp.php";
    private static String URL_DELETE_ITEMS = "http://www.cop4331.org/LAMPAPI/deleteItemsApp.php";

    String [] deleteProperties = {URL_DELETE_SKILLS, URL_DELETE_TALENTS, URL_DELETE_ITEMS};


    // Array lists that are going to store the main info from the character.
    private  static final String TAG = "ReclyclerviewAdapter";
    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<String> classes = new ArrayList<>();
    private ArrayList<String> races =  new ArrayList<>();;
    private ArrayList<String> cHp = new ArrayList<>();
    private ArrayList<String> mHp = new ArrayList<>();
    private ArrayList<Integer> imageArray = new ArrayList<>();
    private Context mContext;
    private ArrayList<ImageView> avatars = new ArrayList<>();


    // Constructor that initializes the array lists for the adapter.
    public RecyclerviewAdapter(Context context, ArrayList<Integer> imageArray, ArrayList<String> names, ArrayList<String> classes, ArrayList<String> races, ArrayList<String> cHp, ArrayList<String> mHp) {
        this.names = names;
        this.classes = classes;
        this.races = races;
        this.cHp = cHp;
        this.mHp = mHp;
        mContext = context;
        this.imageArray = imageArray;
    }


    @NonNull
    @Override
    // It finds the created layout file to produce each element in the menu.
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    // Sets the information of the array lists into each field.
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG,  "onBindViewHolder: called.");

        holder.img.setImageResource(R.drawable.person);
        holder.nameText.setText(this.names.get(position));
        holder.classText.setText(this.classes.get(position));
        holder.raceText.setText(this.races.get(position));
        holder.currentHpText.setText(this.cHp.get(position));
        holder.maxHpText.setText(this.mHp.get(position));

        holder.deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                String deletedCardId = names.get(position);

                deleteCard(deletedCardId);
                names.remove(position);
                races.remove(position);
                classes.remove(position);
                mHp.remove(position);
                cHp.remove(position);
                notifyItemRemoved(position);
            }
        });

        // It moves use to the edit activity after a element of the list is clicked.
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                Intent startIntent = new Intent(mContext, Edit.class);
                startIntent.putExtra("nameEdit", names.get(position));
                startIntent.putExtra("classEdit", classes.get(position));
                startIntent.putExtra("raceEdit", races.get(position));
                startIntent.putExtra("maxEdit", mHp.get(position));
                startIntent.putExtra("currentEdit", cHp.get(position));

                mContext.startActivity(startIntent);
            }
        });
    }

    @Override
    // Contains the size of the arrayLists.
    public int getItemCount() {
        return names.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView nameText;
        TextView classText;
        TextView raceText;
        TextView currentHpText;
        TextView maxHpText;
        RelativeLayout parentLayout;
        TextView deleteButton;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            nameText = itemView.findViewById(R.id.nameText);
            classText = itemView.findViewById(R.id.classText);
            raceText = itemView.findViewById(R.id.raceText);
            currentHpText = itemView.findViewById(R.id.currentHpText);
            maxHpText = itemView.findViewById(R.id.maxHpText);
            parentLayout = itemView.findViewById(R.id.layout);
            deleteButton =  itemView.findViewById(R.id.deleteTag);

        }
    }


    public void deleteCard(final String name)
    {

        RequestQueue requestQueue = Volley.newRequestQueue(mContext);

            StringRequest getInfoCard = new StringRequest(Request.Method.POST, URL_DELETE_CARD, new Response.Listener<String>()
            {
                @Override
                public void onResponse(String response)
                {

                }
            }, new Response.ErrorListener()
            {
                @Override
                public void onErrorResponse(VolleyError error)
                {
                    error.printStackTrace();

                }
            })
            {
                protected Map<String, String> getParams() throws AuthFailureError
                {
                    HashMap<String, String> params = new HashMap<>();
                    params.put("userId", MainActivity.success);
                    params.put("name", name);

                    return params;
                }

            };


            requestQueue.add(getInfoCard);

            for (int i  = 0; i < 3; i++)
            {
                StringRequest getInfoSkills = new StringRequest(Request.Method.POST, deleteProperties[i], new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String response)
                    {
                    }
                }, new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error)
                    {
                        error.printStackTrace();

                    }
                })
                {
                    protected Map<String, String> getParams() throws AuthFailureError
                    {
                        HashMap<String, String> params = new HashMap<>();
                        params.put("characterId", newCharacter.characterId);

                        return params;
                    }

                };


                requestQueue.add(getInfoSkills);
            }


    }


}
