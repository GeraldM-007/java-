package Student30;

public class Student30 {
    private String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Test {
    public static void main(String[] args) {
        Student30 s = new Student30();
        s.setName("Gerald");
        System.out.println(s.getName());
    }
}