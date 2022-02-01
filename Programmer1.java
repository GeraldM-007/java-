import javax.swing.JOptionPane;

class Employee {
    float salary = 40000;
}

class Programmer1 extends Employee {
    int Overtime = 1000;

    public static void main(String args[]) {
        Programmer1 p = new Programmer1();
        JOptionPane.showMessageDialog(null,
                "The Attedant pay is:" + p.salary + "\n" + "The Attedant pay is:" + p.Overtime);

    }
}
