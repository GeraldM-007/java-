public class Gerald {
    public static void Firstname() {
        System.out.println("My fisrtname is Gerald");
    }

    public static void Lastname() {
        System.out.println("My lastname is Muchuku");
    }

    public static void fullname() {
        String firstname = "Gerald";
        String lastname = "Muchuku";
        String fullname;
        fullname = firstname + " " + lastname;
        System.out.println("My fullname is: " + fullname);
    }

    public static void main(String[] args) {

        Firstname();
        Lastname();
        fullname();
    }
}