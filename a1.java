import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = Math.PI;
        System.out.print("Enter the radius : ");
        double radius = scanner.nextDouble();
        double area = radius * radius * PI;
        System.out.printf("The area is : %.2f", area);
        scanner.close();
    }
}
