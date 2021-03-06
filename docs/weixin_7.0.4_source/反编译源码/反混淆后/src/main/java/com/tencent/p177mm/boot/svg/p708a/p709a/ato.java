package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.ato */
public final class ato extends C5163c {
    private final int height = 144;
    private final int width = 144;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 144;
            case 1:
                return 144;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = C5163c.m7881h(looper);
                float[] g = C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                C5163c.m7876a(k2, looper).setStrokeWidth(1.0f);
                k2 = C5163c.m7876a(k, looper);
                k2.setColor(-2565928);
                canvas.save();
                Paint a = C5163c.m7876a(k2, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(18.6f, 55.014008f);
                l.cubicTo(18.53468f, 55.004772f, 18.467905f, 55.0f, 18.4f, 55.0f);
                l.cubicTo(17.62141f, 55.0f, 17.0f, 55.6296f, 17.0f, 56.40625f);
                l.lineTo(17.0f, 62.59375f);
                l.cubicTo(17.0f, 63.381393f, 17.6268f, 64.0f, 18.4f, 64.0f);
                l.cubicTo(18.467968f, 64.0f, 18.534737f, 63.9952f, 18.6f, 63.985928f);
                l.lineTo(18.6f, 64.0f);
                l.lineTo(21.0f, 64.0f);
                l.lineTo(21.0f, 55.0f);
                l.lineTo(18.6f, 55.0f);
                l.lineTo(18.6f, 55.014008f);
                l.close();
                l.moveTo(97.0f, 63.123047f);
                l.lineTo(120.11719f, 49.0f);
                l.lineTo(120.11719f, 95.0f);
                l.lineTo(97.0f, 81.11865f);
                l.lineTo(97.0f, 63.123047f);
                l.close();
                l.moveTo(23.0f, 48.994312f);
                l.cubicTo(23.0f, 44.579174f, 26.581768f, 41.0f, 31.006588f, 41.0f);
                l.lineTo(85.993416f, 41.0f);
                l.cubicTo(90.41533f, 41.0f, 94.0f, 44.57869f, 94.0f, 48.994312f);
                l.lineTo(94.0f, 95.005684f);
                l.cubicTo(94.0f, 99.42082f, 90.41823f, 103.0f, 85.993416f, 103.0f);
                l.lineTo(31.006588f, 103.0f);
                l.cubicTo(26.584671f, 103.0f, 23.0f, 99.42131f, 23.0f, 95.005684f);
                l.lineTo(23.0f, 48.994312f);
                l.close();
                l.moveTo(122.0f, 48.0f);
                l.lineTo(126.0f, 48.0f);
                l.lineTo(126.0f, 96.0f);
                l.lineTo(122.0f, 96.0f);
                l.lineTo(122.0f, 48.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(k, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(18.6f, 55.014008f);
                l.cubicTo(18.53468f, 55.004772f, 18.467905f, 55.0f, 18.4f, 55.0f);
                l.cubicTo(17.62141f, 55.0f, 17.0f, 55.6296f, 17.0f, 56.40625f);
                l.lineTo(17.0f, 62.59375f);
                l.cubicTo(17.0f, 63.381393f, 17.6268f, 64.0f, 18.4f, 64.0f);
                l.cubicTo(18.467968f, 64.0f, 18.534737f, 63.9952f, 18.6f, 63.985928f);
                l.lineTo(18.6f, 64.0f);
                l.lineTo(21.0f, 64.0f);
                l.lineTo(21.0f, 55.0f);
                l.lineTo(18.6f, 55.0f);
                l.lineTo(18.6f, 55.014008f);
                l.close();
                l.moveTo(97.0f, 63.123047f);
                l.lineTo(120.11719f, 49.0f);
                l.lineTo(120.11719f, 95.0f);
                l.lineTo(97.0f, 81.11865f);
                l.lineTo(97.0f, 63.123047f);
                l.close();
                l.moveTo(23.0f, 48.994312f);
                l.cubicTo(23.0f, 44.579174f, 26.581768f, 41.0f, 31.006588f, 41.0f);
                l.lineTo(85.993416f, 41.0f);
                l.cubicTo(90.41533f, 41.0f, 94.0f, 44.57869f, 94.0f, 48.994312f);
                l.lineTo(94.0f, 95.005684f);
                l.cubicTo(94.0f, 99.42082f, 90.41823f, 103.0f, 85.993416f, 103.0f);
                l.lineTo(31.006588f, 103.0f);
                l.cubicTo(26.584671f, 103.0f, 23.0f, 99.42131f, 23.0f, 95.005684f);
                l.lineTo(23.0f, 48.994312f);
                l.close();
                l.moveTo(122.0f, 48.0f);
                l.lineTo(126.0f, 48.0f);
                l.lineTo(126.0f, 96.0f);
                l.lineTo(122.0f, 96.0f);
                l.lineTo(122.0f, 48.0f);
                l.close();
                Paint k3 = C5163c.m7883k(looper);
                k3.setFlags(385);
                k3.setStyle(Style.FILL);
                Paint k4 = C5163c.m7883k(looper);
                k4.setFlags(385);
                k4.setStyle(Style.STROKE);
                k3.setColor(WebView.NIGHT_MODE_COLOR);
                k4.setStrokeWidth(1.0f);
                k4.setStrokeCap(Cap.BUTT);
                k4.setStrokeJoin(Join.MITER);
                k4.setStrokeMiter(4.0f);
                k4.setPathEffect(null);
                float[] a2 = C5163c.m7878a(g, 126.0f, 0.0f, 17.0f, 0.0f, 103.0f, 41.0f);
                h.reset();
                h.setValues(a2);
                WeChatSVGRenderC2Java.setLinearGradient(a, 0.5f, 0.0f, 0.5f, 1.0f, new int[]{-9772465, -6687207}, new float[]{0.0f, 1.0f}, h, 0);
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
