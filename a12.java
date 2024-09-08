import java.util.Scanner;

public class a12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Array : [ ");
        for (int i : array) {
            System.out.print(i + " , ");
        }
        System.out.print("\b\b] ");
        scanner.close();
    }
}
