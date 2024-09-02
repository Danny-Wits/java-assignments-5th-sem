import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your two numbers : ");
        System.out.print("1 : ");
        int a = scanner.nextInt();
        System.out.print("2 : ");
        int b = scanner.nextInt();

        // Arithmetic operations
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("SUM : " + sum);
        System.out.println("DIFFERENCE : " + difference);
        System.out.println("PRODUCT : " + product);
        System.out.println("QUOTIENT : " + quotient);
        System.out.println("REMAINDER : " + remainder);
        scanner.close();
    }
}
