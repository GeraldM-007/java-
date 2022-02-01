import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner Alph = new Scanner(System.in);
        System.out.println("Enter an Alphabet: ");
        char ch;
        ch = Alph.next().toLowerCase().charAt(0);
        switch (ch) {
        case 'a':
            System.out.println("Vowel");
            break;
        case 'e':
            System.out.println("Vowel");
            break;
        case 'i':
            System.out.println("Vowel");
            break;
        case 'o':
            System.out.println("Vowel");
            break;
        case 'u':
            System.out.println("Vowel");
            break;
        default:
            System.out.println("Consonant");
        }
    }
}
