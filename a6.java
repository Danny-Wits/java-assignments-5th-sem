import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day number : ");
        int a = scanner.nextInt();
        String day = switch (a) {
            case 1 -> "MONDAY";
            case 2 -> "TUESDAY";
            case 3 -> "WEDNESDAY";
            case 4 -> "THURSDAY";
            case 5 -> "FRIDAY";
            case 6 -> "SATURDAY";
            case 7 -> "SUNDAY";
            default -> "not a valid day .\nPlease enter 1-7 only.";
        };
        System.out.println("It is " + day);

        scanner.close();
    }

}
