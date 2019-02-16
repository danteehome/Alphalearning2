package com.example.dante.alphalearning;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Alphaadapter extends ArrayAdapter<Alphalistviewconstructor> {
    private int resource;
    private ArrayList<Alphalistviewconstructor> alphalistviewconstructors;
    private Context context;
    public Alphaadapter(Context context,int resource,ArrayList<Alphalistviewconstructor> alphalistviewconstructors){
        super(context,resource, alphalistviewconstructors);
        this.resource=resource;
        this.alphalistviewconstructors = alphalistviewconstructors;
        this.context=context;

    }
    @NonNull
    @Override
    public View getView(int position, View convertView,ViewGroup parent){
        View v=convertView;
        try {
            if(v == null){
                LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                v= layoutInflater.inflate(resource, parent, false);


            }
            ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
            TextView textViewName = (TextView) v.findViewById(R.id.textViewName);
            TextView textViewDetail = (TextView) v.findViewById(R.id.textViewDetail);
            imageView.setImageResource(alphalistviewconstructors.get(position).getPhoto());
            textViewName.setText(alphalistviewconstructors.get(position).getName());
            textViewDetail.setText(alphalistviewconstructors.get(position).getDetails());
        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return v;
    }


}
