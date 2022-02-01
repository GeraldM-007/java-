import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Create extends JFrame implements ActionListener {
    JButton button;
    JTextField textField1, textField2;
    JLabel label1, label2, label3;

    Create() {
        label1 = new JLabel("Enter Your Name:");
        label1.setBounds(90, 10, 200, 20);
        add(label1);

        textField1 = new JTextField();
        textField1.setBounds(120, 30, 400, 20);
        add(textField1);

        label2 = new JLabel("Enter your Reg No:");
        label2.setBounds(90, 50, 200, 20);
        add(label2);

        textField2 = new JTextField();
        textField2.setBounds(120, 80, 400, 20);
        add(textField2);

        label3 = new JLabel();
        label3.setBounds(90, 120, 200, 40);
        add(label3);

        button = new JButton("Submit");
        button.setBounds(150, 200, 100, 20);
        add(button);

        button.addActionListener(this);
        this.setLayout(null);
        this.setSize(600, 600);
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String name = (textField1.getText());
        String RegNo = (textField2.getText());
        String Details = "";

        if (e.getSource().equals(button)) {
            Details = name + " " + RegNo;
            label3.setText(String.valueOf(Details));
        }

    }

    public static void main(String args[]) {
        Create obj = new Create();

    }
}
