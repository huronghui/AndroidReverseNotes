package com.tencent.mm.plugin.appbrand.game.d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatButton;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a extends AppCompatButton {
    private RectF hrv;
    private boolean hrw;
    private float hrx;
    private float hry;

    class a extends Drawable {
        Paint aFY;
        RectF rect;

        private a() {
            AppMethodBeat.i(130150);
            this.aFY = new Paint(1);
            this.rect = new RectF();
            this.aFY.setColor(-12748166);
            this.aFY.setStyle(Style.FILL);
            AppMethodBeat.o(130150);
        }

        /* synthetic */ a(a aVar, byte b) {
            this();
        }

        public final void draw(Canvas canvas) {
            AppMethodBeat.i(130151);
            float height = ((float) canvas.getHeight()) / 2.0f;
            RectF rectF = this.rect;
            this.rect.top = 0.0f;
            rectF.left = 0.0f;
            rectF = this.rect;
            float f = height * 2.0f;
            this.rect.bottom = f;
            rectF.right = f;
            canvas.drawArc(this.rect, 90.0f, 180.0f, false, this.aFY);
            this.rect.left = ((float) canvas.getWidth()) - (height * 2.0f);
            this.rect.top = 0.0f;
            this.rect.right = (float) canvas.getWidth();
            this.rect.bottom = (float) canvas.getHeight();
            canvas.drawArc(this.rect, -90.0f, 180.0f, false, this.aFY);
            canvas.drawRect(height - 1.0f, 0.0f, (((float) a.this.getWidth()) - height) + 1.0f, (float) a.this.getHeight(), this.aFY);
            AppMethodBeat.o(130151);
        }

        public final void setAlpha(int i) {
        }

        public final void setColorFilter(ColorFilter colorFilter) {
        }

        public final int getOpacity() {
            return -1;
        }
    }

    public a(Context context) {
        super(context);
        AppMethodBeat.i(130152);
        setGravity(17);
        setText("vConsole");
        setTextColor(-1);
        float f = getContext().getResources().getDisplayMetrics().density;
        setPadding((int) (13.0f * f), (int) (4.0f * f), (int) (13.0f * f), (int) (f * 6.0f));
        setBackgroundDrawable(new a(this, (byte) 0));
        AppMethodBeat.o(130152);
    }

    private boolean H(float f, float f2) {
        AppMethodBeat.i(130153);
        if (this.hrv == null) {
            AppMethodBeat.o(130153);
            return false;
        }
        boolean contains = this.hrv.contains(f, f2);
        AppMethodBeat.o(130153);
        return contains;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AppMethodBeat.i(130154);
        switch (motionEvent.getAction()) {
            case 0:
                this.hrv = new RectF(getX(), getY(), getX() + ((float) getWidth()), getY() + ((float) getHeight()));
                this.hrw = false;
                break;
            case 1:
                if (!this.hrw && H(motionEvent.getRawX(), motionEvent.getRawY())) {
                    performClick();
                    break;
                }
            case 2:
                if (this.hrw || !H(motionEvent.getRawX(), motionEvent.getRawY())) {
                    setX(getX() + (motionEvent.getRawX() - this.hrx));
                    setY(getY() + (motionEvent.getRawY() - this.hry));
                    requestLayout();
                    this.hrw = true;
                    break;
                }
        }
        this.hrx = motionEvent.getRawX();
        this.hry = motionEvent.getRawY();
        AppMethodBeat.o(130154);
        return true;
    }
}
