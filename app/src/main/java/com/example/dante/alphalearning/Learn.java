package com.example.dante.alphalearning;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.lukedeighton.wheelview.WheelView;
import com.lukedeighton.wheelview.adapter.WheelArrayAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Learn extends Navigate_page {
    private static final int ITEM_COUNT = 5;
    static String[] alphabet={"a","b","c","d","e"};
    int[] photolist={R.drawable.apple,R.drawable.bananas,R.drawable.candy,R.drawable.doll,R.drawable.evening};
    private WheelView wheelView;
    private ImageView wimage;
    private TextView wdescription;
    private WebView wbackground;
    private String[] wdesc;
    private int[] wcolorlist={R.color.red_500, R.color.yellow_500,R.color.orange_500,R.color.cyan_a100,R.color.blue_grey_200};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_study);

        wheelView = (WheelView) findViewById(R.id.wheelview);
        wimage = (ImageView) findViewById(R.id.wimage);
        wdescription = (TextView) findViewById(R.id.wdescription);
        wbackground = (WebView) findViewById(R.id.wbackground);
        wdesc = getResources().getStringArray(R.array.abcde);



        //create data for the adapter
        List<Map.Entry<String, Integer>> entries = new ArrayList<Map.Entry<String, Integer>>(ITEM_COUNT);
        for (int i = 0; i < ITEM_COUNT; i++) {
            Map.Entry<String, Integer> entry = MaterialColor.random(this, "\\D*_500$");
            entries.add(entry);
        }

        //populate the adapter, that knows how to draw each item (as you would do with a ListAdapter)
        wheelView.setAdapter(new MaterialColorAdapter(entries));
        wbackground.loadUrl("file:///android_asset/backgroundgif.gif");

        //a listener for receiving a callback for when the item closest to the selection angle changes
        wheelView.setOnWheelItemSelectedListener(new WheelView.OnWheelItemSelectListener() {
            @Override
            public void onWheelItemSelected(WheelView parent, Drawable itemDrawable, int position) {
                //get the item at this position
                Map.Entry<String, Integer> selectedEntry = ((MaterialColorAdapter) parent.getAdapter()).getItem(position);
                parent.setSelectionColor(getContrastColor(selectedEntry));
                wdescription.setText(wdesc[position]);
                wimage.setImageResource(photolist[position]);
                wdescription.setTextColor(wcolorlist[position]);
            }
        });
        //listener
        wheelView.setOnWheelItemClickListener(new WheelView.OnWheelItemClickListener() {
            @Override
            public void onWheelItemClick(WheelView parent, int position, boolean isSelected) {

                if (position >= 2 && position<=19) {
                    String msg = alphabet[position] + " is the" + (position + 1) + " th in alphabet";
                    Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
                } else if (position == 0) {
                    String msg = alphabet[position] + " is the 1st in alphabet";
                    Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
                } else if (position == 1) {
                    String msg = alphabet[position] + " is the 2nd in alphabet";
                    Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
                } else if (position == 2) {
                    String msg = alphabet[position] + " is the 3rd in alphabet";
                    Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
                }
            }
        });


        //initialise the selection drawable with the first contrast color
        wheelView.setSelectionColor(getContrastColor(entries.get(0)));

        /*
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //wheelView.setSelectionAngle(-wheelView.getAngleForPosition(5));
                wheelView.setMidSelected();
            }
        }, 3000); */
    }

    //get the materials darker contrast
    private int getContrastColor(Map.Entry<String, Integer> entry) {
        String colorName = MaterialColor.getColorName(entry);
        return MaterialColor.getContrastColor(colorName);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
//adapter
    static class MaterialColorAdapter extends WheelArrayAdapter<Map.Entry<String, Integer>> {
        MaterialColorAdapter(List<Map.Entry<String, Integer>> entries) {
            super(entries);
        }

        @Override
        public Drawable getDrawable(int position) {
            Drawable[] drawable = new Drawable[] {
                    createOvalDrawable(getItem(position).getValue()),
                    new TextDrawable(alphabet[position])
            };
            return new LayerDrawable(drawable);
        }

        private Drawable createOvalDrawable(int color) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(color);
            return shapeDrawable;
        }
    }


}
