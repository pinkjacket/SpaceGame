package pinkjacket.spacegame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Player {

    //get sprites
    private Bitmap bitmap;

    //coordinates
    private int x;
    private int y;

    //movement speed
    private int speed = 0;

    public Player(Context context){
        x = 75;
        y = 50;
        speed = 1;

        bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.player);
    }

    //update coordinates
    public void update(){
        x++;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSpeed() {
        return speed;
    }
}
