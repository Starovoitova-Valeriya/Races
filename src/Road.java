import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Road extends JPanel implements ActionListener {
    Timer timer = new Timer(20,this);
    Image img = new ImageIcon("Road.png").getImage();
    Player p = new Player();

    public Road() {
      timer.start();
      addKeyListener(new MyKeyAdapter());
      setFocusable(true);
    }

    private class MyKeyAdapter extends KeyAdapter{
        public void KeyPressed (KeyEvent e){
            p.KeyPressed(e);
        }
        public void KeyRealised (KeyEvent e){
            p.KeyRealised(e);
        }
    }

    public void paint(Graphics g){
        g = (Graphics2D) g;
        g.drawImage(img, p.layer1, 0, null);
        g.drawImage(img, p.layer2, 0, null);
        g.drawImage(p.img, p.x, p.y, null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        p.move();
        repaint();
    }
}
