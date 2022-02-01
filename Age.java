import javax.swing.JOptionPane;

public class Age {

    String name;
    int age;

    public Age() {
        name = JOptionPane.showInputDialog("Enter your Name: ");
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age: "));

    }

    void checkAge() {

        if (age > 18) {
            System.out.println("Access Granted!!");
            // JOptionPane.showMessageDialog("Access Granted!!",
            // JOptionPane.INFORMATION_MESSAGE);

        } else {
            System.out.println("Access Denied!! Your are not old enough!!");
            // JOptionPane.showMessageDialog("Access Denied!! You are not old enough",
            // JOptionPane.INFORMATION_MESSAGE);
        }
    }

    void displayData() {
        JOptionPane.showMessageDialog(null, "Name: " + name + "\n Age: " + age);

    }

    public static void main(String[] args) {

        Age Obj1 = new Age();
        Obj1.checkAge();
        Obj1.displayData();
    }
}
