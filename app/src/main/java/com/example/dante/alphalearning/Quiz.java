package com.example.dante.alphalearning;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

import java.util.Collections;
import java.util.Random;

public class Quiz extends Navigate_page {
    private String questions[]=null;
    private int rand;
    private int rand2;
    private int[] questionpic={R.drawable.apple,R.drawable.bananas,R.drawable.candy,R.drawable.doll,R.drawable.evening};
    private ImageView timage;
    private TextView tmissing;
    private Button option1;
    private Button option2;
    private Button option3;
    private Button option4;
    private Button option5;
    private String[] correctanswerlist;
    private String rightanswer;
    private String[] all_possible_ans;
    private String[] correctansfull;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        //bind views to objects
        timage=(ImageView)findViewById(R.id.timage);
        tmissing = (TextView) findViewById(R.id.tmissing);
        option1=(Button) findViewById(R.id.option1);
        option2=(Button) findViewById(R.id.option2);
        option3=(Button) findViewById(R.id.option3);
        option4=(Button) findViewById(R.id.option4);
        option5=(Button) findViewById(R.id.option5);


        //get array resources
        questions=getResources().getStringArray(R.array.questions);
        correctanswerlist =getResources().getStringArray(R.array.correctanswer);
        all_possible_ans=getResources().getStringArray(R.array.allanswer);
        correctansfull=getResources().getStringArray(R.array.questionans);

        //initial populate
        Populate();

            option1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position=0;
                    if(all_possible_ans[position].equals(rightanswer)){
                        Reward();
                    }
                    else {
                        option1.setVisibility(View.INVISIBLE);
                        Toast.makeText(getApplicationContext(), "Try again!", Toast.LENGTH_SHORT).show();
                    }
                }

            });
            option2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position=1;
                    if(all_possible_ans[position].equals(rightanswer)){
                        Reward();
                        System.out.println(all_possible_ans[position]);
                        System.out.println(rightanswer);
                    }
                    else {
                        option2.setVisibility(View.INVISIBLE);
                        Toast.makeText(getApplicationContext(), "Try again!", Toast.LENGTH_SHORT).show();

                    }
                }

            });
            option3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position=2;
                    if(all_possible_ans[position].equals(rightanswer)){
                        Reward();

                    }
                    else {
                        option3.setVisibility(View.INVISIBLE);
                        Toast.makeText(getApplicationContext(), "Try again!", Toast.LENGTH_SHORT).show();

                    }
                }
            });

            option4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int position=3;
                    if(all_possible_ans[position].equals(rightanswer)){
                        Reward();

                    }
                    else {
                        option4.setVisibility(View.INVISIBLE);
                        Toast.makeText(getApplicationContext(), "Try again!", Toast.LENGTH_SHORT).show();

                    }
                }
            });

            option5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position=4;
                    if(all_possible_ans[position].equals(rightanswer)){
                        Reward();

                    }
                    else {
                        option5.setVisibility(View.INVISIBLE);
                        Toast.makeText(getApplicationContext(), "Try again!", Toast.LENGTH_SHORT).show();

                    }
                }
            });
    }
    //if correct, display reward
    public void Reward(){
        final MediaPlayer mpa = MediaPlayer.create(this,R.raw.congrats);
        mpa.start();
        AlertDialog.Builder builder= new AlertDialog.Builder(Quiz.this);
        builder.setCancelable(false);
        builder.setTitle("Congratulations!");
        builder.setMessage("You got the correct answer");
        //populate the tonext button
        builder.setPositiveButton("Next one", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Reset();
            }
        });
        builder.show();
    }
    public void Reset(){
        option1.setVisibility(View.VISIBLE);
        option2.setVisibility(View.VISIBLE);
        option3.setVisibility(View.VISIBLE);
        option4.setVisibility(View.VISIBLE);
        option5.setVisibility(View.VISIBLE);
        Populate();
    }
    public void Populate(){
        Random random= new Random();
        rand = random.nextInt(questions.length-1);
        //populate the random array of button combinations
        timage.setImageResource(questionpic[rand]);
        tmissing.setText(questions[rand]);
        //randomize button options
        Collections.shuffle(Arrays.asList(all_possible_ans));
        rightanswer=correctanswerlist[rand];


        //default info
        option1.setText(all_possible_ans[0]);//e
        option2.setText(all_possible_ans[1]);//d
        option3.setText(all_possible_ans[2]);//b
        option4.setText(all_possible_ans[3]);//c
        option5.setText(all_possible_ans[4]);//a

    }
    //display correct answer after all tries

    //decide whether it's correct or wrong
    public void Correctdetermine(int position){
        if(all_possible_ans[position].equals(rightanswer)){
            Reward();

        }
        else {
            Toast.makeText(getApplicationContext(), "Try again!", Toast.LENGTH_SHORT).show();

        }

    }



}



