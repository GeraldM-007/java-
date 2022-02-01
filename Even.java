import javax.swing.JOptionPane;

public class Even {
    public void Even() {
        int sum = 0, num;
        String input;

        input = JOptionPane.showInputDialog("Initialize Number as 1! ");
        num = Integer.parseInt(input);

        do {
            num++;
            if (num % 2 == 0) {
                sum += num;
            }
        } while (num < 100);

        JOptionPane.showMessageDialog(null, "The Sum of Even Numbers Between 1 and 100 is: " + sum, "Sum Even",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        Even obj = new Even();
        obj.Even();
    }
}