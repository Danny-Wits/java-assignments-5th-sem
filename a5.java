import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number here : ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even.");

        } else {
            System.out.println(number + " is odd.");
        }
        scanner.close();
    }

}
