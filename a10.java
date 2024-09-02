import java.util.Scanner;

public class a10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("[ ");
        for (int i : array) {
            System.out.print(i + " , ");
        }
        System.out.print("\b\b] ");
        scanner.close();
    }

}
