
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.concurrent.locks.Lock;

    public class Firefly extends JComponent {
        private JComponent component;
        private static final int delay = 10;
        private Lock lock;
        private int steps;
        private static Random r = new Random();
        private Firefly[] array;
        private List fly = new List();
        private double NaturalFlashFreq = 0.785;
        private int a = 10, b = 10;
        private int x;
        private int y;
        private static double currentPhase = r.nextInt((int) (2 * Math.PI));
        private double currentFlashFreq;

        public Firefly() {
            this.x = x;
            this.y = y;
            this.a = a;
            this.b = b;
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (int i = 1; i <= 10; i++) {
                x = r.nextInt(400);
                y = r.nextInt(400);
                if (currentPhase == 2 * Math.PI) {
                    g.setColor(Color.MAGENTA);
                    g.fillRect(x, y, a, b);
                } else if (currentPhase != 2 * Math.PI) {
                    g.setColor(Color.BLUE);
                    g.drawRect(x, y, a, b);
                }
                currentPhase = currentPhase + 1;
            }
        }

        public void pause ( int steps) throws InterruptedException {
            steps = 8;
            component.repaint();
            Thread.sleep(steps * delay);
        }
    }


