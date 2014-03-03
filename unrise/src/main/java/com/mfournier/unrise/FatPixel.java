package com.mfournier.unrise;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by fourn_000 on 01/03/14.
 */
public class FatPixel extends Drawable {
    Paint paint = new Paint();

    public void Draw(Canvas canvas) {
        canvas.drawRect(rect(), paint);
    }

}
