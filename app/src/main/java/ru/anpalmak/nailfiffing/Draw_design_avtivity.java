package ru.anpalmak.nailfiffing;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;

import static android.graphics.Color.RED;

public class Draw_design_avtivity extends AppCompatActivity {
    private float bottom, left, right, top;
    public ImageView nail; View n;

public int height, width;
   /* Display display = getWindowManager().getDefaultDisplay();
    int width = display.getWidth();  // deprecated
    int height = display.getHeight();  // deprecated*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_design_avtivity);
        nail=findViewById(R.id.imageView5);
        DisplayMetrics displaymetrics = getResources(). getDisplayMetrics();
        height =displaymetrics.heightPixels;
        width =displaymetrics.widthPixels;
        n=findViewById(R.id.view2);


    }
    public void onWindowFocusChanged(boolean hasFocus) {
        // TODO Auto-generated method stub
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {

            int fingerHeight = nail.getHeight();
            int fingerWidth = nail.getWidth();

            bottom = height - fingerHeight / 3 * 2;
            top = bottom - fingerHeight / 2;
            left = width / 2 - fingerWidth / 3 ;
            right = width / 2 + fingerWidth / 3 ;


            // rgbFrameBitmap.setPixels(getRgbBytes(), 0, width, 0, 0, width, height);
          //  setContentView(new DrawNail(this, bottom, right, left, top, height, width));

            //   canvas.drawBitmap(rgbFrameBitmap, frameToCropTransform, null)
            // DrawNail.invalidate(bottom, right, left, top);


        }


    }
}