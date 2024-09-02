import java.util.Arrays;

public class arraysum {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = Arrays.stream(array).sum();
        System.out.println("The sum of all the elements is : " + sum);
    }
}
