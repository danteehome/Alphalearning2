package com.example.dante.alphalearning;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Alphabetdetails extends AlphabetList {
    private String name;
    private String speech;
    private String description;
    private String examples;
    private int sounds;
    private int photo;


    private String flagreceive;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetdisplay);
        Intent intent = getIntent();
        Alphainfo all=new Alphainfo(name,sounds,description,examples,speech,photo);




        RelativeLayout relativeLayout=(RelativeLayout) findViewById(R.id.alphabetdisplaylayout);
        TextView textViewName = (TextView) relativeLayout.findViewById(R.id.textViewName);
        TextView textViewSpeech = (TextView) relativeLayout.findViewById(R.id.textViewSpeech);
        final TextView textViewDescription = (TextView) relativeLayout.findViewById(R.id.textViewDescription);
        final TextView textViewExamples = (TextView) relativeLayout.findViewById(R.id.textViewExamples);
        ImageView imageViewphoto = (ImageView) relativeLayout.findViewById(R.id.picture) ;
        final ImageView imageViewexample = (ImageView) relativeLayout.findViewById(R.id.examplealpha);
        final Button buttonmakesound = (Button) findViewById(R.id.makesound);
        final Button buttonunfold = (Button) findViewById(R.id.button_foldfunction);
        final ImageView toDraw = (ImageView) findViewById(R.id.toDraw);

        buttonunfold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewDescription.getVisibility() == View.INVISIBLE) {
                    textViewDescription.setVisibility(View.VISIBLE);
                    textViewExamples.setVisibility(View.VISIBLE);
                    imageViewexample.setVisibility(View.VISIBLE);
                } else {
                    textViewDescription.setVisibility(View.INVISIBLE);
                    textViewExamples.setVisibility(View.INVISIBLE);
                    imageViewexample.setVisibility(View.INVISIBLE);
                }
            }
        });

        if (intent != null) ;
        {
            flagreceive = getIntent().getStringExtra("flag");
        }

        if (flagreceive != null) {
            switch (flagreceive) {
                case "a":
                    System.out.println("You pressed the first letter yay");
                    all.setName("Aa");
                    all.setDescription(getString(R.string.descriptionfora));
                    all.setExamples(getString(R.string.aexample));
                    all.setPhoto(R.drawable.aa);
                    all.setSpeech(getString(R.string.aspeech));


                    final MediaPlayer mpa = MediaPlayer.create(this,R.raw.a_gb_4);
                    buttonmakesound.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mpa.start();
                        }
                    });

                    textViewDescription.setText(all.getDescription());
                    textViewName.setText(all.getName());
                    textViewExamples.setText(all.getExamples());
                    textViewSpeech.setText(all.getSpeech());
                    imageViewphoto.setImageResource(R.drawable.aa);
                    imageViewexample.setImageResource(R.drawable.apple);

                    break;
                case "b":
                    all.setName("Bb");
                    all.setDescription(getString(R.string.descriptionforb));
                    all.setExamples(getString(R.string.bexample));
                    all.setPhoto(R.drawable.bb);
                    all.setSpeech(getString(R.string.bspeech));

                    ////


                    final MediaPlayer mpb = MediaPlayer.create(this,R.raw.b);
                    buttonmakesound.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mpb.start();
                        }
                    });

                    textViewDescription.setText(all.getDescription());
                    textViewName.setText(all.getName());
                    textViewExamples.setText(all.getExamples());
                    textViewSpeech.setText(all.getSpeech());
                    imageViewphoto.setImageResource(R.drawable.bb);
                    imageViewexample.setImageResource(R.drawable.bananas);

                    break;
                case "c":
                    all.setName("Cc");
                    all.setDescription(getString(R.string.descriptionforc));
                    all.setExamples(getString(R.string.cexample));
                    all.setPhoto(R.drawable.cc);
                    all.setSpeech(getString(R.string.cspeech));

                    ////


                    final MediaPlayer mpc = MediaPlayer.create(this,R.raw.c);
                    buttonmakesound.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mpc.start();
                        }
                    });


                    textViewDescription.setText(all.getDescription());
                    textViewName.setText(all.getName());
                    textViewExamples.setText(all.getExamples());
                    textViewSpeech.setText(all.getSpeech());
                    imageViewphoto.setImageResource(R.drawable.cc);
                    imageViewexample.setImageResource(R.drawable.candy);

                    break;
                case "d":
                    all.setName("Dd");
                    all.setDescription(getString(R.string.descriptionford));
                    all.setExamples(getString(R.string.dexample));
                    all.setPhoto(R.drawable.dd);
                    all.setSpeech(getString(R.string.dspeech));

                    ////


                    final MediaPlayer mpd = MediaPlayer.create(this,R.raw.d);
                    buttonmakesound.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mpd.start();
                        }
                    });


                    textViewDescription.setText(all.getDescription());
                    textViewName.setText(all.getName());
                    textViewExamples.setText(all.getExamples());
                    textViewSpeech.setText(all.getSpeech());
                    imageViewphoto.setImageResource(R.drawable.dd);
                    imageViewexample.setImageResource(R.drawable.doll);
                    break;
                case "e":
                    all.setName("Ee");
                    all.setDescription(getString(R.string.descriptionfore));
                    all.setExamples(getString(R.string.eexample));
                    all.setPhoto(R.drawable.ee);
                    all.setSpeech(getString(R.string.espeech));

                    ////


                    final MediaPlayer mpe = MediaPlayer.create(this,R.raw.e);
                    buttonmakesound.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mpe.start();
                        }
                    });


                    textViewDescription.setText(all.getDescription());
                    textViewName.setText(all.getName());
                    textViewExamples.setText(all.getExamples());
                    textViewSpeech.setText(all.getSpeech());
                    imageViewphoto.setImageResource(R.drawable.ee);
                    imageViewexample.setImageResource(R.drawable.evening);
                    break;

            };
            toDraw.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent= new Intent(getApplicationContext(),Draw.class);
                    intent.putExtra("flag",flagreceive);
                    startActivity(intent);

                }
            });



            }

        }
    }


