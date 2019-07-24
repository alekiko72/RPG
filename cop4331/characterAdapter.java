package com.example.cop4331;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;

public class characterAdapter extends BaseAdapter {

    LayoutInflater mInflator;
    String[] attributes;
    String[] descriptions;

    public characterAdapter(Context c, String[] attributes, String[] descriptions)
    {
        this.attributes = attributes;
        this.descriptions = descriptions;
        mInflator = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return attributes.length;
    }

    @Override
    public Object getItem(int i) {
        return attributes[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        View v = mInflator.inflate(R.layout.new_character_card, null);
        TextView cardFieldTag = (TextView) v.findViewById(R.id.cardFieldTag);
        TextView cardDescription = (TextView) v.findViewById(R.id.cardDescription);
        EditText cardFieldText = (EditText) v.findViewById(R.id.cardFieldText);

        String name = attributes[i];
        String desc = descriptions[i];

        cardFieldTag.setText(name);
        cardDescription.setText(desc);



        return v;
    }


}
