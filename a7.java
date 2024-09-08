import java.util.Scanner;

public class a7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month number : ");
        int a = scanner.nextInt();
        String month = switch (a) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "not a valid month .\nPlease enter 1-12 only.";
        };
        System.out.println("It is " + month);

        scanner.close();
    }

}
