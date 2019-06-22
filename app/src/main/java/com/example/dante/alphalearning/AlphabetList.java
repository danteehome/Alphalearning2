package com.example.dante.alphalearning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;

public class AlphabetList extends Navigate_page {

    private ListView listView;
    private String[] alphanames;
    private String[] alphaposition={"1","2","3","4","5"};
    public int[] alphaphotos = {R.drawable.aa,
            R.drawable.bb,
            R.drawable.cc,
            R.drawable.dd,
            R.drawable.ee,
    };
    public String flag;
    private ArrayList<Alphalistviewconstructor> alphalistviewconstructors = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alphalist);

        alphanames = getResources().getStringArray(R.array.alphabets);

        generatealphainfo();
        //map view
        listView=(ListView) findViewById(R.id.alphabetlist);
        //set adapter
        listView.setAdapter(new Alphaadapter(this, R.layout.alphabetconstructer, alphalistviewconstructors));
        //set listener
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                        Intent intent=new Intent(getApplicationContext(),Alphabetdetails.class);
                        intent.putExtra("flag",alphaposition[position]);
                        startActivity(intent);
                    }
                }
        );
    }

    public void generatealphainfo(){
        for (int i=0;i<alphanames.length;i++){
            alphalistviewconstructors.add(new Alphalistviewconstructor(alphanames[i],alphaposition[i],alphaphotos[i]));
        }
    }
}
