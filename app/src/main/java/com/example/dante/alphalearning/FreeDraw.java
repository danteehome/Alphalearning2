package com.example.dante.alphalearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

import com.android.graphics.CanvasView;

public class FreeDraw extends Navigate_page{

    private CanvasView customCanvas;
    private Button buttonpurple;
    private Button buttonred;
    private Button buttonyellow;
    private Button buttonlime;
    private Button buttondraw;
    private Button buttonerase;
    private Button buttonclear;
    private WebView gif;
    private ImageView drawImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_draw);


        this.customCanvas = (CanvasView)this.findViewById(R.id.canvas_drawing2);
        this.drawImage= (ImageView) this.findViewById(R.id.drawImage2);
        this.buttonpurple = (Button)this.findViewById(R.id.buttonpurple2);
        this.buttonred = (Button)this.findViewById(R.id.buttonred2);
        this.buttonyellow = (Button)this.findViewById(R.id.buttonyellow2);
        this.buttonlime = (Button)this.findViewById(R.id.buttonlime2);
        this.buttondraw = (Button)this.findViewById(R.id.buttondraw2);
        this.buttonerase = (Button)this.findViewById(R.id.buttonerase2);
        this.buttonclear = (Button)this.findViewById(R.id.buttonclear2);


        this.customCanvas.setPaintStrokeColor(getResources().getColor(R.color.red_500));
        this.customCanvas.setPaintStrokeWidth(20);



        buttonpurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customCanvas.setPaintStrokeColor(getResources().getColor(R.color.purple_300));

            }
        });

        buttonred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customCanvas.setPaintStrokeColor(getResources().getColor(R.color.red_500));

            }
        });

        buttonyellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customCanvas.setPaintStrokeColor(getResources().getColor(R.color.yellow_a400));

            }
        });
        buttonlime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customCanvas.setPaintStrokeColor(getResources().getColor(R.color.lime_a400));

            }
        });
        buttondraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customCanvas.setPaintStrokeColor(getResources().getColor(R.color.black));

            }
        });
        buttonerase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customCanvas.setPaintStrokeColor(getResources().getColor(R.color.white));
                buttonclear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customCanvas.clear();

                    }
                });

            }
        });
    }
}
