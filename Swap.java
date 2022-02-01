import javax.swing.JOptionPane;

public class Swap {

	public static void main(String[] args) {
		int num1, num2;

		num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the digit in the Tens Place"));
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter digit in the Ones Place"));

		JOptionPane.showMessageDialog(null, "The Number Before Swapping is " + num2 + num1);

		int swap = num2;
		num2 = num1;
		num1 = swap;

		JOptionPane.showMessageDialog(null, "The Number After Swapping is " + num2 + num1);

	}
}
