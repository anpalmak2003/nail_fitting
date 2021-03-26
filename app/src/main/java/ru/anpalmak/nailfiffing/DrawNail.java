package ru.anpalmak.nailfiffing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class DrawNail extends View {
float bottom; float right; float left; float top;
    public DrawNail(Context context, float bottom, float right, float left, float top) {
        super(context);
        this.bottom=bottom;
        this.right=right;
        this.left=left;
        this.top=top;
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        // Выбираем кисть
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        canvas.drawRect(left, top, right, bottom, paint);


    }

}
