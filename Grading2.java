import javax.swing.*;

public class Grading2 {
    private int marks;
    private String name;
    private String Grade;

    public void readData() {
        name = JOptionPane.showInputDialog("Please Enter Student name: ");
        do {
            marks = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Marks:"));
        } while (marks >= 0 || marks <= 100);
    }

    public void computeGrade() {
        if (marks > 69) {
            Grade = "A";
        } else if (marks > 59) {
            Grade = "B";
        } else if (marks > 49) {
            Grade = "C";
        } else if (marks > 39) {
            Grade = "D";
        } else if (marks <= 39) {
            Grade = "E";
        } else {
            Grade = "You enter invalid marks";
        }
    }

    public void printData() {
        String output;
        output = "student name: \n" + name + "\n Grade: " + Grade;
        JOptionPane.showMessageDialog(null, output, "Grading", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        Grading2 myGrade = new Grading2();
        myGrade.computeGrade();
        myGrade.readData();
        myGrade.printData();
    }
}
