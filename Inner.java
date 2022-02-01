
//Java Program to illustrate the use of continue statement  
//inside an inner loop 
import javax.swing.JOptionPane;

public class Inner {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    continue;
                }
                JOptionPane.showMessageDialog(null, i + " " + j);
            }
        }
    }
}
