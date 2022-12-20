package com.example.rabbidribbet;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;

import java.util.ArrayList;

public class GameView extends view {
    bitmap background, ground, frogtech;
    rect rectbackground, rectGround;
    context context;
    handler handler;
    final long UPDATE_MILLIS = 30;
    Runnable_runnable;
    paint textpaint = new paint();
    paint healthPaint = new Paint();
    float text_size = 120;
    int points = 0;
    int life = 3;
    static int dWidth, dHeight;
    random random;
    float techfrogX,techfrogY;
    float oldX;
    float oldtechfrogX,
    arraylist <Rain> rain;
    arraylist <explosion> explosions;

    public GameView(context context) {
        super (context);
        this.context = context;
        background = bitmapfactory.decodeResource (getResources(), R.drawable.background)
        ground = bitmapfactory.decodeResource (getResources(), R.drawable.ground)
        TechFrog = bitmapfactory.decodeResource (getResources(), R.drawable.TechFrog)
                display display = ((Activity) getcontext()).getWindowManager().getDefaultDisplay();
        point size = new point();
        display.getsize (size);
        dWidth = size.x;
        dHeight = size.y;
        rectbackground = new rect(left0, top 0,dWidth,dHeight);
        rectGround = new rect(left:0, top:dHeight - ground.getheight(),dWidth,dHeight);
        handler = new handler();
        runnable = new runnable() {
            @override
            public void run(){
                invalidate();
            }
        };
        textpaint.setColor(color.rgb(red:255, green:165, Blue:0));
        textpaint.settextsize(TEXT_Size);
        textpaint.setTextAlign(paint.align.LEFT);
        textpaint.settypeface(resourcesCompat.getFont(context, R.font.gutcruncher-9vLL.ttf));
        healthPaint.setColor(Color.green);
        random = new ();
        techfrogX = dWidth / 2 - frogtech.getwidth() / 2;
        techfrogY = dHeight - ground.getHeight() frogtech.getheight();
        rain = new arraylist<>();
        for (int i=0; i<3; i++){
            rain rain =new raint(context);
            rain.add(rain);
        }
    }
@override
    protected void onDraw(canvas canvas) {
        super . ondraw(canvas);
        canvas.drawbitmap(background,src:null, rectbackground, paint:null);
        canvas.drawBitmap(ground, src:null, rectGround, paint:null);
        canvas.drawBitmap(frogtech,techfrogX,techfrogY, paint:null);
        for (int i=0; i<rain.size(); i++) {
            Canvas.drawBitmap(rain.get(i).getRain(rain.get(i).rainframe), rain.get(i).RainX, Rain.get(i).rainY, paint:
            null)
            rain.get(i).rainframe++;
            if (rain.get(i).rainframe > 2) {
                rain.get(i).rainframe = 0;
            }
         rain.get(i).rainY += rain.get (i).rainVelocity;if (rain.get(i).rainY +rain.get(i).getrainheight() >=dHeight - ground.getheight())
             if ()
                points += 10;
    explosions explosion = new Explosion(context);
    explosion.explosionX = rain.get(i).RainX;
    explosion.explosionY = rain.get(i).RainY;
    explosions.add(explosion);
    rain.get(i).resetPosition();
}
}
}
        }
}

}
