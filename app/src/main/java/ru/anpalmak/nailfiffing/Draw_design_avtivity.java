package ru.anpalmak.nailfiffing;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.widget.ImageView;

import static android.graphics.Color.RED;

public class Draw_design_avtivity extends AppCompatActivity {
    private float bottom, left, right, top;
public Canvas canvas;
   /* Display display = getWindowManager().getDefaultDisplay();
    int width = display.getWidth();  // deprecated
    int height = display.getHeight();  // deprecated*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_design_avtivity);
        ImageView nail=findViewById(R.id.imageView5);
        DisplayMetrics displaymetrics = getResources(). getDisplayMetrics();
        int height =displaymetrics.heightPixels;
        int width =displaymetrics.widthPixels;

        bottom=height-nail.getMaxHeight()/3*2;
        top=bottom+nail.getMaxHeight()/2;
        left=width/2+nail.getMaxWidth()/3*2;
        right=width/2-nail.getMaxWidth()/3*2;
        new DrawNail(getApplicationContext(), bottom, right, left, top);
        //DrawNail.onDraw(canvas);

    }

}