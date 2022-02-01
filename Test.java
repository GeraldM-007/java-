import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Test extends JFrame implements ActionListener {

    JButton button1;
    JTextField textField1, TextField2;
    JLabel lbl;

    Test() {

        textField1 = new JTextField();
        textField1.setBounds(90, 50, 150, 30);
        add(textField1);

        TextField2 = new JTextField();
        TextField2.setBounds(90, 80, 150, 30);
        add(TextField2);

        lbl = new JLabel("Result :");
        lbl.setBounds(90, 140, 150, 30);
        add(lbl);

        button1 = new JButton("Sum");
        button1.setBounds(90, 200, 100, 30);
        add(button1);

        button1.addActionListener(this);

        this.setLayout(null);
        this.setSize(600, 400);
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(textField1.getText());
        int b = Integer.parseInt(TextField2.getText());
        int c = 0;

        if (e.getSource().equals(button1)) {
            c = a + b;
            lbl.setText(String.valueOf(c));
        }
    }

    public static void main(String args[]) {
        Test t = new Test();
    }
}