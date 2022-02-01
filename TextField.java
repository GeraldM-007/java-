import javax.swing.*;
//import java.awt.ActionEvent;
//import java.awt.ActionListener;

public class TextField {

    public static void main(String Args[]) {
        JFrame frame1 = new JFrame("Application programing II");

        JTextField t1 = new JTextField("Java GUI  Elements");
        t1.setBounds(50, 100, 200, 30);
        frame1.add(t1);

        JTextField t2 = new JTextField("AWT Components");
        t2.setBounds(50, 150, 200, 30);
        frame1.add(t2);

        frame1.setSize(400, 400);
        frame1.setLayout(null);
        frame1.setVisible(true);

    }

}
