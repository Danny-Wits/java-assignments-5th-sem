import java.util.Scanner;

public class a9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ----------  Please enter the inputs ---------- ");
        try {
            System.out.print("Operand a : ");
            int operandA = scanner.nextInt();
            System.out.print("Operator (+ | - | * | / | %) : ");
            char operator = scanner.next().trim().charAt(0);
            System.out.print("Operand b : ");
            int operandB = scanner.nextInt();

            int result = switch (operator) {
                case '+' -> addition(operandA, operandB);
                case '-' -> subtraction(operandA, operandB);
                case '*' -> multiplication(operandA, operandB);
                case '/' -> division(operandA, operandB);
                case '%' -> modulation(operandA, operandB);
                default -> 0;
            };
            System.out.println("Result : " + result);

        } catch (Exception e) {
            System.out.println("There was an Exception : " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println(" ---------- Thank You ----------");
        }
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int modulation(int a, int b) {
        return a % b;
    }
}
