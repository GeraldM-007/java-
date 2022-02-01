//import javax.swing.JOptionPane;

public class javac {
  public static void main(String args[]) {
    int r;
    int i;
    System.out.println("\nDisplay the odd numbers between 20 and 30 are :\n");
    i = 20;
    do {
      r = i % 2;
      if (r == 1)
        System.out.println(i);
      // JOptionPane.showMessageDialog(null, "Display the odd numbers between 20 and
      // 30 are: " + i);
      i++;

    } while (i <= 30);
  }
}