package com.zhang.customview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.zhang.customview.R;

public class DrawColor extends View {
    private Paint paint = new Paint();

    public DrawColor(Context context) {
        super(context);

    }

    public DrawColor(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawColor(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(R.color.hotpink));
        canvas.drawColor(getResources().getColor(R.color.yellow));
        paint.setStrokeWidth(5);
        canvas.drawLine(0, 100, 500, 100, paint);
        paint.setColor(getResources().getColor(R.color.deeppink));
        paint.setStrokeWidth(5);
        canvas.drawLine(500,100,700,400,paint);


    }
}
