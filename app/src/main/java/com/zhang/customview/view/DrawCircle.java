package com.zhang.customview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import com.zhang.customview.R;

public class DrawCircle extends View {
    private Paint paint = new Paint();

    public DrawCircle(Context context) {
        super(context);
    }

    public DrawCircle(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawCircle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //圆
        canvas.drawColor(getResources().getColor(R.color.hotpink));
        paint.setAntiAlias(true);
        canvas.drawCircle(200, 200, 200, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(getResources().getColor(R.color.saddlebrown));
        paint.setStrokeWidth(5);
        canvas.drawCircle(600, 200, 200, paint);
        paint.setStrokeWidth(20);
        paint.setColor(getResources().getColor(R.color.chartreuse));
        canvas.drawCircle(1050, 200, 200, paint);
        //矩形
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(0, 400, 400, 800, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(getResources().getColor(R.color.yellow));
        paint.setStrokeWidth(5);
        canvas.drawRect(400, 405, 800, 800, paint);
        //圆点
        //点的形状可以通过  paint.setStrokeCap(cap) 来设置：ROUND 画出来是圆形的点，SQUARE 或 BUTT 画出来是方形的点
        paint.setStrokeWidth(50);
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(1000, 600, paint);
        paint.setStrokeCap(Paint.Cap.BUTT);
        canvas.drawPoint(1050, 600, paint);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(1150, 600, paint);
        //椭圆
        paint.setColor(getResources().getColor(R.color.orchid));
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(5);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            canvas.drawOval(0, 800, 300, 1000, paint);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawOval(500, 800, 200, 1000, paint);
        }
        //y圆角矩形
        paint.setStrokeWidth(5);
        paint.setColor(getResources().getColor(R.color.firebrick));
        paint.setStyle(Paint.Style.FILL);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            canvas.drawRoundRect(0,1050,300,1150,20,20,paint);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(5);
            canvas.drawRoundRect(350,1050,650,1150,20,20,paint);
        }
    }
}
