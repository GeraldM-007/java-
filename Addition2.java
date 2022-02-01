import javax.swing.JOptionPane;
public class Addition {
    public static void main(String args[]) {
        float num1, num2, sum;
        String input1, input2;
        input1 = JOptionPane.showInputDialog("your CAT MARKS IS: ");
        input2 = JOptionPane.showInputDialog("your EXAM MARKS IS: ");

        num1 = Float.parseFloat(input1);
        num2 = Float.parseFloat(input2);

        sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "MMU EXAM OFFICE \n-----------------------------\n EXAM TOTAL IS: " + sum,
                "additionExample", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }
}
