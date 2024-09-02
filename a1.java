import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = Math.PI;
        System.out.print("Enter the radius of the circle : ");
        double radius = scanner.nextFloat();
        double area = radius * radius * PI;
        System.out.printf("The area of the circle is : %.2f", area);
        scanner.close();
    }
}
