package pinkjacket.spacegame;

import android.content.Context;
import android.view.SurfaceView;

public class GameView extends SurfaceView implements Runnable {

    volatile boolean playing;

    private Thread gameThread = null;

    public GameView(Context context) {
        super(context);

    }

    @Override
    public void run() {
        while (playing) {

            update();

            draw();

            control();
        }
    }


    private void update() {

    }

    private void draw() {

    }

    private void control() {
        try {
            gameThread.sleep(17);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void pause() {
        //pause
        playing = false;
        try {
            //stopping the thread
            gameThread.join();
        } catch (InterruptedException e) {
        }
    }

    public void resume() {
        //unpause
        playing = true;
        gameThread = new Thread(this);
        gameThread.start();
    }
}