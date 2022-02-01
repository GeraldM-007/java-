import javax.swing.JOptionPane;

public class GCD {

    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the Second number: "));

        while (num1 != num2) {
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        JOptionPane.showMessageDialog(null, "Gcd of the given number is: " + num2);
    }

}