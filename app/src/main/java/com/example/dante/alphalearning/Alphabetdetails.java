package com.example.dante.alphalearning;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class Alphabetdetails extends MainActivity {
    private String name;
    private String speech;
    private String description;
    private String examples;
    private int sounds;
    private int photo;
    private int gif;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetdisplay);
        Intent intent = getIntent();
        Bundle k = intent.getExtras();
        String flagreceive;
        Alphainfo all=new Alphainfo(name,sounds,description,examples,gif,speech);
        WebView gif= (WebView) findViewById(R.id.gifdisplay) ;



        RelativeLayout relativeLayout=(RelativeLayout) findViewById(R.id.alphabetdisplaylayout);
        TextView textViewName = (TextView) relativeLayout.findViewById(R.id.textViewName);
        TextView textViewSpeech = (TextView) relativeLayout.findViewById(R.id.textViewSpeech);
        final TextView textViewDescription = (TextView) relativeLayout.findViewById(R.id.textViewDescription);
        final TextView textViewExamples = (TextView) relativeLayout.findViewById(R.id.textViewExamples);
        ImageView imageViewphoto = (ImageView) relativeLayout.findViewById(R.id.picture) ;
        final Button buttonmakesound = (Button) findViewById(R.id.makesound);
        final Button buttonunfold = (Button) findViewById(R.id.button_foldfunction);




        if (k != null) ;
        {
            flagreceive= k.getString("flag");
        }

        if (flagreceive != null) {
            switch (flag) {
                case "1st":
                    System.out.println("You pressed the first letter yay");
                    all.setName("Aa");
                    all.setDescription(getString(R.string.descriptionfora));
                    all.setExamples("apple");
                    all.setPhoto(R.drawable.aa);
                    all.setSpeech(getString(R.string.aspeech));

                    ////
                    gif.loadUrl("file:///android_asset/a_cursiva.gif");

                    final MediaPlayer mpa = MediaPlayer.create(this,R.raw.a_gb_4);
                    buttonmakesound.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mpa.start();
                        }
                    });
                    buttonunfold.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            textViewDescription.setVisibility(View.VISIBLE);
                            textViewExamples.setVisibility(View.VISIBLE);
                        }
                    });

                    textViewDescription.setText(all.getDescription());
                    textViewName.setText(all.getName());
                    textViewExamples.setText(all.getDescription());
                    textViewSpeech.setText(all.getSpeech());
                    imageViewphoto.setImageResource(R.drawable.aa);







                    break;
                case "2nd":

                    break;


            }

            ;




            }

        }
    }


