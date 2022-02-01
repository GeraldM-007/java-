public class TestArray3 {

    public static void main(String args[]) {
        int a[][] = { { 8, 4, 3, 2 }, { 2, 5, 6, 1 }, { 1, 0, 9, 4 } };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
    }
}
