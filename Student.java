import javax.swing.JOptionPane;

public class Student {
    String name;
    String regnumber;
    int feebalance, fees;
    int paidfees;

    public Student() {
        name = JOptionPane.showInputDialog("Enter Student name: ");
        regnumber = JOptionPane.showInputDialog("Enter Student Registration number: ");
        fees = Integer.parseInt(JOptionPane.showInputDialog("Enter Fee required to pay: "));
    }

    void payableFee() {
        paidfees = Integer.parseInt(JOptionPane.showInputDialog("Enter Fee you want to pay: "));
        feebalance = fees;
        feebalance = fees - paidfees;

    }

    void checkFeeBalance() {
        feebalance = fees - paidfees;

    }

    void displayData() {
        JOptionPane.showMessageDialog(null, "Student name: " + name + "\nRegistration number: " + regnumber
                + "\nFee required to pay is: " + fees + "\nFee Balance: " + feebalance);

    }

    public static void main(String[] args) {
        Student S1 = new Student();
        S1.payableFee();
        S1.checkFeeBalance();
        S1.displayData();
    }
}
