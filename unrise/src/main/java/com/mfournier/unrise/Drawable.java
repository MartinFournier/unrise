package com.mfournier.unrise;

import android.graphics.RectF;

/**
 * Created by fourn_000 on 01/03/14.
 */
public class Drawable {
    float posX = 0f;
    float posY = 0f;

    public void SetPosition(float x, float y) {
        this.posX = x;
        this.posY = y;
    }

    public RectF rect() {
        return new RectF(posX, posY, (posX+width), (posY+height));
    }

    float width = 0f;
    float height = 0f;
}
