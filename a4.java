
import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your two numbers : ");
        System.out.print("a : ");
        int a = scanner.nextInt();
        System.out.print("b : ");
        int b = scanner.nextInt();

        // bitwise operators ;
        int AND = a & b;
        int OR = a | b;
        int NOT = ~a;
        int rightShift1 = a >> 1;
        int leftShift1 = a << 1;

        System.out.println("Bitwise AND (a & b): " + AND);
        System.out.println("Bitwise OR (a | b): " + OR);
        System.out.println("Bitwise NOT (~a): " + NOT);
        System.out.println("Bitwise RIGHT SHIFT BY 1 (a >> 1): " + rightShift1);
        System.out.println("Bitwise LEFT SHIFT BY 1 (a << 1): " + leftShift1);

        scanner.close();
    }
}
