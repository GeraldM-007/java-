import javax.swing.JOptionPane;

public class Month {
    public static void main(String[] args) {

        int month;
        month = Integer.parseInt(JOptionPane.showInputDialog("Enter The number of Month: "));
        String monthString = "";
        switch (month) {

        case 1:
            monthString = "The Month of January";
            break;
        case 2:
            monthString = "The Month of February";
            break;
        case 3:
            monthString = "The Month of March";
            break;
        case 4:
            monthString = "The Month of April";
            break;
        case 5:
            monthString = "The Month of May";
            break;
        case 6:
            monthString = "The Month of  June";
            break;
        case 7:
            monthString = "The Month of July";
            break;
        case 8:
            monthString = "The Month of August";
            break;
        case 9:
            monthString = "The Month of  September";
            break;
        case 10:
            monthString = "The Month of  October";
            break;
        case 11:
            monthString = "The Month of  November";
            break;
        case 12:
            monthString = "The Month of December";
            break;
        default:
            System.out.println("Invalid Month!");
        }
        JOptionPane.showMessageDialog(null, monthString);
    }
}
