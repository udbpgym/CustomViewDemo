package com.zhang.customview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import com.zhang.customview.R;

public class DrawCustomView extends View {
    private Paint paint = new Paint();
    private Path path = new Path();

    {
        // 使用 path 对图形进行描述（这段描述代码不必看懂）
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            path.addArc(200, 200, 400, 400, -225, 225);
            path.arcTo(400, 200, 600, 400, -180, 225, false);
        }
        path.lineTo(400, 542);
    }


    public DrawCustomView(Context context) {
        super(context);
    }

    public DrawCustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawCustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // paint.setStyle(Paint.Style.FILL);
        paint.setColor(getResources().getColor(R.color.hotpink));
        // canvas.drawPath(path, paint); // 绘制出 path 描述的图形（心形），大功告成
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setAntiAlias(true);
//        paint.setStrokeWidth(10);
//        path.moveTo(200,500);
//       path.rLineTo(0,100);
//        canvas.drawLine(200, 200, 350, 180, paint);
//        path.
        canvas.drawPath(path, paint);
    }
}
