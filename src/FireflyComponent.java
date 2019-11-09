import javax.swing.*;
import java.awt.*;

public class FireflyComponent extends JComponent  {
    public Firefly f;
    public FireflyComponent()
    {
        f= new Firefly();
    }

    public void paintComponent (Graphics g )
    {
        f.paintComponent(g);
    }
    public void animate(){
        class Animation implements Runnable{

            @Override
            public void run() {

            }
        }
        Runnable r = new Animation();
        Thread t = new Thread (r);
        t.start();
    }

}

