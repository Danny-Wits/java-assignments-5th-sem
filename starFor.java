import java.util.Scanner;

/**
 * starFor
 */
public class starFor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        final String STAR = "*";
        for (int i = 0; i < limit; i++) {
            System.out.println(STAR.repeat(i));
        }
        scanner.close();
    }
}