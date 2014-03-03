package com.mfournier.unrise;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class DrawView extends View {
    Paint paintBlack = new Paint();
    Paint paintPurple = new Paint();
    Paint paintWhite = new Paint();
    Paint paintGreen = new Paint();
    Paint paintPurple2 = new Paint();
    Dude dude = null;

    //4A0C7A
    int colorPurple = Color.argb(255, 74, 12, 122);
    int colorGreenish = Color.argb(255, 9, 178, 76);
    int colorPurpleLighter = Color.argb(255, 144, 0, 255);

    public DrawView(Context context) {
        super(context);

        dude = new Dude(this);

        paintBlack.setColor(Color.BLACK);
        paintPurple.setColor(colorPurple);
        paintWhite.setColor(Color.WHITE);
        paintGreen.setColor(colorGreenish);
        paintPurple2.setColor(colorPurpleLighter);
        setBackgroundColor(colorPurple);

        dude.SetPosition(80, 200);
    }

    public void onSizeChanged (int w, int h, int oldw, int oldh) {
        dude.setSize();
        super.onSizeChanged(w, h, oldw, oldh);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int h = getHeight();
        int w = getWidth();

        int sideW = (int)(w / 8);
        canvas.drawRect(0, 0, sideW, h, paintPurple2);
        canvas.drawRect(w - sideW, 0, w, h, paintPurple2);


        dude.Draw(canvas);
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        // MotionEvent reports input details from the touch screen
        // and other input controls. In this case, you are only
        // interested in events where the touch position changed.

        float x = e.getX();
        float y = e.getY();
        if (e.getAction() == MotionEvent.ACTION_MOVE) {
            dude.SetPosition(x, y);
        }
//        switch (e.getAction()) {
//            case MotionEvent.ACTION_MOVE:
//
//                float dx = x - mPreviousX;
//                float dy = y - mPreviousY;
//
//                // reverse direction of rotation above the mid-line
//                if (y > getHeight() / 2) {
//                    dx = dx * -1 ;
//                }
//
//                // reverse direction of rotation to left of the mid-line
//                if (x < getWidth() / 2) {
//                    dy = dy * -1 ;
//                }
//
//                mRenderer.setAngle(
//                        mRenderer.getAngle() +
//                                ((dx + dy) * TOUCH_SCALE_FACTOR);  // = 180.0f / 320
//                requestRender();
//        }
//
//        mPreviousX = x;
//        mPreviousY = y;
        return true;
    }
}