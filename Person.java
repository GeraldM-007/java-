import javax.sound.sampled.SourceDataLine;

import java.util.*;

public class Person {
    Scanner scanner = new Scanner(System.in);
    String firstName;
    String lastName;

    public Person() {
        System.out.println("Enter Firstname: ");
        firstName = scanner.nextLine();
        System.out.println("Enter lastname:");
        lastName = scanner.nextLine();
    }

    public void displayName() {
        System.out.println("your fullname: " + firstName + " " + lastName);
    }

    public static void main(String[] args) {
        Person name = new Person();
        Person name2 = new Person();
        name.displayName();
        name2.displayName();
    }
}
