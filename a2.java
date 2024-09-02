import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your two numbers : ");
        System.out.print("a : ");
        int a = scanner.nextInt();
        System.out.print("b : ");
        int b = scanner.nextInt();

        // Arithmetic operations
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("SUM (a+b): " + sum);
        System.out.println("DIFFERENCE (a-b): " + difference);
        System.out.println("PRODUCT (a*b): " + product);
        System.out.println("QUOTIENT (a/b): " + quotient);
        System.out.println("REMAINDER (a%b): " + remainder);
        scanner.close();
    }
}
