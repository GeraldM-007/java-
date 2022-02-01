import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getPerimeter() {
        return 2 * (length + breadth);
    }

    double getArea(){
        return ( length * breadth)
    }

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Lenghth: ");
        double leng = scanner.nextDouble();
        System.out.println("Enter the Breadth");
        double brea = scanner.nextDouble();
        Rectangle r = new Rectangle(leng, brea);

        System.out.println("The Length is = " + leng);
        System.out.println("The Breadth is = " + bre);
        System.out.println("The Perimeter is = " + r.getPerimeter());

    }

}