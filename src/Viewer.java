import javax.swing.*;

public class Viewer {
    public static void main(String[] args) {
       JPanel panel = new JPanel();
       JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("FireFlies Synchronization");
        frame.add(panel);
        frame.setVisible(true);
        JComponent comp = new Firefly();
        frame.add(comp);

    }

}
