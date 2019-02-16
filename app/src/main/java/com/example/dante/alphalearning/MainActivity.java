package com.example.dante.alphalearning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;;
    private String[] alphanames;
    private String[] alphaposition={"1st","2nd","3rd","4th","5th"};
    public static int[] alphaphotos = {R.drawable.aa,
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
        setContentView(R.layout.activity_main);

        alphanames = getResources().getStringArray(R.array.alphabets);

        generatealphainfo();

        listView=(ListView) findViewById(R.id.alphabetlist);
        listView.setAdapter(new Alphaadapter(this, R.layout.alphabetconstructer, alphalistviewconstructors));
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
