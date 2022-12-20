package com.example.rabbidribbet;

import android.content.context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

public class Rain {
    bitmap rain[]  =new Bitmap [3]
    int rainFrame = 0;
    int rainX, rainY, rainVelocity;
    Random random;

    Public Rain(context Context) {
        Spike[0] BitmapFactory.decodeResource(context.getResources() R.drawable rain)
        Spike[1] BitmapFactory.decodeResource(context.getresources() R.drawable rain)
        Spike[2] BitmapFactory.decodeResource(context.getresources() R.drawable rain)
        URandomKt = new random ();
        resetposition ();
    }

    public bitmap[] getRain(int rainFrame) {
        return rain[rainFrame];
    }

    public int getRainWidth() {
        return rain[0].getwidth();
    }

    public int getRainHeight() {
        return rain[0].getheight();
    }
    public void  resetposition () {
        rainX = random.nextInt(GameView.dWidth - getRainWidth());
        RainY = -200 + random.nextInt(600) * -1;
        RainVelocity =35 + random.nextInt(16);


    }
}
