import javax.swing.JOptionPane;

public class Grading {
    public static void main(String args[]) {

        Results studentOne = new Results(40);
        studentOne.showMarks();

    }
}

class Results {
    int marks;

    public Results(int _mark) {
        marks = _mark;
    }

    void showMarks() {
        int marks = Integer.parseInt(JOptionPane.showInputDialog("ENTER MARKS"));
        if (marks >= 80) {
            JOptionPane.showMessageDialog(null, "your grade is  A", "GRADE", JOptionPane.INFORMATION_MESSAGE);
        } else if (marks <= 80 && marks >= 60) {
            JOptionPane.showMessageDialog(null, "your grade is  B", "GRADE", JOptionPane.INFORMATION_MESSAGE);
        } else if (marks <= 60 && marks >= 50) {
            JOptionPane.showMessageDialog(null, "your grade is  C", "GRADE", JOptionPane.INFORMATION_MESSAGE);
        } else if (marks >= 40 && marks <= 50) {
            JOptionPane.showMessageDialog(null, "your grade is  D", "GRADE", JOptionPane.INFORMATION_MESSAGE);
        } else if (marks < 40) {
            JOptionPane.showMessageDialog(null, "Fail", "GRADE", JOptionPane.INFORMATION_MESSAGE);
        } else if (marks < 0) {
            JOptionPane.showMessageDialog(null, "Invalid marks", "GRADE", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}