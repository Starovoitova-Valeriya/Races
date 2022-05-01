import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Player {
    Image img = new ImageIcon("Player.png").getImage();
    private int v = 6;
    private int dv = 0;
    private int s = 0;
    int layer1 = 0;
    int layer2 = 1400;
    int x = 100;
    int y = 500;


    public void move() {
        s += v;
        if (layer2 - v <= 0) {
            layer1 = 0;
            layer2 = 900;
        } else {
            layer1 -= v;
            layer2 -= v;
        }
    }
    public void KeyPressed(KeyEvent e){
        JOptionPane.showMessageDialog(null, "KeyPressed");
    }
    public void KeyRealised(KeyEvent e){
        JOptionPane.showMessageDialog(null, "KeyRealised");
    }

}
