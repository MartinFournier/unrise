package com.mfournier.unrise;

/**
 * Created by fourn_000 on 01/03/14.
 */

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

public class Dude extends FatPixel {
    View container = null;
    int containerWidth = 0;
    int containerHeight = 0;

    FatRelativePixel hat;

    public Dude(View view) {
        container = view;
        paint.setColor(Color.WHITE);

        hat = new FatRelativePixel(this);
        hat.paint.setColor(Color.MAGENTA);
        hat.posX = 10;
        hat.posY = -10;
        hat.height = 10;
        hat.width= 280;
    }

    public void setSize() {
        containerWidth = container.getWidth();
        containerHeight = container.getHeight();
        width = (containerWidth / 15f);
        height = (width * 1.2f);
    }
    public void Draw(Canvas canvas) {
        super.Draw(canvas);

        hat.Draw(canvas);
    }
}
