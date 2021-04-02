package ru.anpalmak.nailfiffing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class DrawNail extends View {
float bottom; float right; float left; float top; float height; float widht;
    public DrawNail(Context context, AttributeSet attrs) {
        super(context, attrs);
        invalidate();

    }
    public void SetNail(float bottom, float right, float left, float top, float height, float wight) {
        this.bottom=bottom;
        this.right=right;
        this.left=left;
        this.top=top;
        this.height=height;
        this.widht=wight;
    }
    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

       Bitmap nail= BitmapFactory.decodeResource(getResources(), R.drawable.background);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
      /*  canvas.drawBitmap(nail, widht/2-nail.getWidth()/2, height-nail.getHeight(), paint);
      canvas.drawColor(0x00AAAAAA);
left =100; right=200; top=100; bottom=200;
        */
         canvas.drawRect(100, 100, 200, 200, paint);
        RectF rect = new RectF(left, top, right, bottom);
      //  canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.balelerina), null, rect, null);
     //  drawing(canvas);*/

    }


}
