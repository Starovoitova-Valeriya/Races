import javax.swing.*;

public class Program {
    public static void main(String[] args) {

        JFrame f = new JFrame("F1");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1100,600);
        f.add(new Road());
        f.setVisible(true);


    }
}
