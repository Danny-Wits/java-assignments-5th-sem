public class a11 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int[] row : matrix) {
            System.out.print("[ ");
            for (int number : row) {
                System.out.print(number + " | ");
            }
            System.out.println("\b\b]");
        }

    }

}
