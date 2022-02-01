public class Sorting {

    public static void main(String args[]) {

        int m[] = new int[] { 30, 40, 60, 50, 70, 100, 80 };
        int temp = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (m[i] < m[j]) {
                    temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }
        }

        System.out.println();

        System.out.println("Elements of may sorted in descending order: ");
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
    }

}
