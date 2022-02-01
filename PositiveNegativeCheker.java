import javax.swing.JOptionPane;

public class PositiveNegativeCheker {

    public static void main(String[] args) {
        int number;
        number = Integer.parseInt(JOptionPane.showInputDialog("Enter Number:"));
        if (number > 0) {
            JOptionPane.showMessageDialog(null, "This is number is Positive");
        } else if (number < 0) {
            JOptionPane.showMessageDialog(null, "This is number is Negative");
        } else {
            JOptionPane.showMessageDialog(null, "ZERO");
        }
    }
}
