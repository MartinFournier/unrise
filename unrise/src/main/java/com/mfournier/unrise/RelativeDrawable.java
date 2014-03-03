package com.mfournier.unrise;

import android.graphics.RectF;

/**
 * Created by fourn_000 on 01/03/14.
 */
public class RelativeDrawable extends Drawable {
    public Drawable related;

    @Override
    public RectF rect() {
        RectF r = related.rect();
        return new RectF(r.left + posX, r.top + posY, r.right - related.width + width - posX,  r.bottom - related.height + height - posY);
    }
}
