
//Java Program to demonstrate the use of Java Nested Switch
import javax.swing.JOptionPane;

public class NestedSwitch {

    public static void main(String args[]) {
        // C - CSE, E - ECE, M - Mechanical
        char branch = 'M';
        int collegeYear;
        collegeYear = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Year"));
        switch (collegeYear) {
        case 1:
            System.out.println("English, Maths, Science");
            break;
        case 2:
            switch (branch) {
            case 'C':
                System.out.println("Operating System, Java, Data Structure");
                break;
            case 'E':
                System.out.println("Micro processors, Logic switching theory");
                break;
            case 'M':
                System.out.println("Drawing, Manufacturing Machines");
                break;
            }
            break;
        case 3:
            switch (branch) {
            case 'C':
                System.out.println("Computer Organization, MultiMedia");
                break;
            case 'E':
                System.out.println("Fundamentals of Logic Design, Microelectronics");
                break;
            case 'M':
                System.out.println("Internal Combustion Engines, Mechanical Vibration");
                break;
            }
            break;
        case 4:
            switch (branch) {
            case 'C':
                JOptionPane.showMessageDialog(null, "Data Communication and Networks, MultiMedia");
                break;
            case 'E':
                JOptionPane.showMessageDialog(null, "Embedded System, Image Processing");
                break;
            case 'M':
                JOptionPane.showMessageDialog(null, "Production Technology, Thermal Engineering");
                break;
            }
            break;
        }
    }
}
