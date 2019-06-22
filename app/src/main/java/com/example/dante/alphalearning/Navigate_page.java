package com.example.dante.alphalearning;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Navigate_page extends AppCompatActivity {

    RelativeLayout navigation;
    AnimationDrawable animationDrawable;
    MediaPlayer mediaPlayer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigate_page);

        final ImageView toList = (ImageView) findViewById(R.id.toListbtn);
        final ImageView toStudy = (ImageView) findViewById(R.id.toStudybtn);
        final ImageView toDraw = (ImageView) findViewById(R.id.toDrawbtn);
        final ImageView toContact = (ImageView) findViewById(R.id.toContactbtn);
        final ImageView music_control = (ImageView) findViewById(R.id.music_control);
        navigation = (RelativeLayout) findViewById(R.id.navigation);





        //background handler
        animationDrawable = (AnimationDrawable) navigation.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();


        mediaPlayer =  MediaPlayer.create(getApplicationContext(),R.raw.bgm);
        music_control.setImageResource(R.drawable.smallmelody);




        //onclick
        toList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AlphabetList.class);
                mediaPlayer.release();
                startActivity(intent);
            }
        });
        toDraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Draw.class);
                mediaPlayer.release();
                startActivity(intent);
            }
        });
        toStudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Learn.class);
                mediaPlayer.release();
                startActivity(intent);
            }
        });

            music_control.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();
                        music_control.setImageResource(R.drawable.smallmute);

                    } else {
                        mediaPlayer.start();
                        music_control.setImageResource(R.drawable.smallmelody);
                    }
                }
            });

        }
    }



