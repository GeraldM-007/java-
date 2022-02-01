import javax.swing.JOptionPane;

//Java Program to demonstrate the use of Java Switch  
//statement with String  

public class SwitchString {

    public static void main(String[] args) {
        // Declaring String variable
        String levelString;
        levelString = JOptionPane.showInputDialog("Enter who you are between Beginner,Intermediate and Expert: ");
        int level = 0;
        // Using String in Switch expression
        switch (levelString) {
        // Using String Literal in Switch case
        case "Beginner":
            level = 1;
            break;
        case "Intermediate":
            level = 2;
            break;
        case "Expert":
            level = 3;
            break;
        default:
            level = 0;
            break;
        }
        JOptionPane.showMessageDialog(null, "Your Level is : " + level);
    }
}
