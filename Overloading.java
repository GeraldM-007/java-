class Added {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

class OverLoading {

    public static void main(String args[]) {
        System.out.println(Added.add(12, 12));
        System.out.println(Added.add(12, 12, 12));
    }
}