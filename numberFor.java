import java.util.Scanner;

public class numberFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int number = 1;
        for (int i = 0; i < limit; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        scanner.close();
    }
}
