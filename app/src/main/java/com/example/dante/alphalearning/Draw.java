package com.example.dante.alphalearning;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.support.v7.widget.Toolbar;

import com.android.graphics.CanvasView;


public class Draw extends Navigate_page {

    private CanvasView customCanvas;
    private Button buttonpurple;
    private Button buttonred;
    private Button buttonyellow;
    private Button buttonlime;
    private Button buttondraw;
    private Button buttonerase;
    private Button buttonclear;
    private String flagreceive;
    private WebView gif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);
        Intent intent = getIntent();
        if (intent != null) ;
        {
            flagreceive = getIntent().getStringExtra("flag");
        }

        this.customCanvas = (CanvasView)this.findViewById(R.id.canvas_drawing);
        this.buttonpurple = (Button)this.findViewById(R.id.buttonpurple);
        this.buttonred = (Button)this.findViewById(R.id.buttonred);
        this.buttonyellow = (Button)this.findViewById(R.id.buttonyellow);
        this.buttonlime = (Button)this.findViewById(R.id.buttonlime);
        this.buttondraw = (Button)this.findViewById(R.id.buttondraw);
        this.buttonerase = (Button)this.findViewById(R.id.buttonerase);
        this.buttonclear = (Button)this.findViewById(R.id.buttonclear);
        this.gif=(WebView)this.findViewById(R.id.gif);

        switch (flagreceive) {
            case "1":
                gif.loadUrl("file:///android_asset/a_cursiva.gif");
                break;
            case "2":
                gif.loadUrl("file:///android_asset/b_cursiva.gif");
                break;
            case "3":
                gif.loadUrl("file:///android_asset/c_cursiva.gif");
                break;
            case "4":
                gif.loadUrl("file:///android_asset/d_cursiva.gif");
                break;
            case "5":
                gif.loadUrl("file:///android_asset/e_cursiva.gif");
                break;

        }

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
                customCanvas.setMode(CanvasView.Mode.DRAW);

            }
        });
        buttonerase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customCanvas.setMode(CanvasView.Mode.ERASER);

            }
        });
        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customCanvas.clear();

            }
        });





    }
}

