package com.example.rabbidribbet;

public class Explosion {
    bitmap explosion[] = new bitmap[4];
    int explosionFrame =0;
    intexposionX, explosionY;

    public explosion(context context){
        Explosion[1] = bitmapfactory.decodeResource (context.getResource(), R.drawable.explosion1);
        Explosion[2] = bitmapfactory.decodeResource (context.getResource(), R.drawable.explosion2);
        Explosion[3] = bitmapfactory.decodeResource (context.getResource(), R.drawable.explosion3);
        Explosion[4] = bitmapfactory.decodeResource (context.getResource(), R.drawable.explosion4);
        Explosion[5] = bitmapfactory.decodeResource (context.getResource(), R.drawable.explosion5);
    }

    Public bitmap

    public com.example.rabbidribbet.bitmap[] getExplosion(int explosionFrame) {
        return explosion[explosionFrame];
    }
}
