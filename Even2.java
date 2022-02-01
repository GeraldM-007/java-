import javax.swing.JOptionPane;

public class Even2 {
    int num;
    int sum = 0;

    public void Even2() {
        // num = Integer.parseInt(JOptionPane.showInputDialog("Enter number: "));

        for (num = 1; num <= 100; num++) {

            if (num % 2 == 0) {

                sum += num;
            }
        }
        JOptionPane.showMessageDialog(null, "The sum is: " + sum, " ", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String args[]) {
        Even2 obj = new Even2();
        obj.Even2();

    }

}
