import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two truth values (true/false): ");
        System.out.print("a : ");
        boolean a = scanner.nextBoolean();
        System.out.print("b : ");
        boolean b = scanner.nextBoolean();

        // Logical Operators
        boolean AND = a && b;
        boolean OR = a || b;
        boolean NOT = !a;
        boolean XOR = a ^ b;
        System.out.println("AND (a && b): " + AND);
        System.out.println("OR (a || b): " + OR);
        System.out.println("NOT  (!a): " + NOT);
        System.out.println("XOR  (a^b): " + XOR);

        scanner.close();
    }
}
