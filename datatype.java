
import java.util.function. ;

public class datatype {
    public static void main(String[] args) {
        // Numeric

        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1l;

        Function<Integer, Integer> sum = (x) -> {
            return x + x;
        };
        System.out.println(sum.apply(10));

    }
}
