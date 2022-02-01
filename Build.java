import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Build extends JFrame implements ActionListener {

    JButton button1;
    JTextField textField1, TextField2;
    JLabel label1, label2;
    JFrame frame1;

    Build() {

        label1 = new JLabel("CALCULATOR");
        label1.setBounds(80, 10, 200, 40);
        add(label1);

        textField1 = new JTextField();
        textField1.setBounds(100, 50, 150, 30);
        add(textField1);

        TextField2 = new JTextField();
        TextField2.setBounds(100, 80, 150, 30);
        add(TextField2);

        label2 = new JLabel("Result :");
        label2.setBounds(90, 140, 50, 30);
        add(label2);

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
            label2.setText(String.valueOf(c));
        }
    }

    public static void main(String args[]) {
        Build t = new Build();
    }
}