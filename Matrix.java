import java.util.Arrays;
import java.util.List;

/**
 * Matrix
 */
public class Matrix {
    int[][] array2d = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };

    public static void main(String[] args) {
        Matrix m1 = new Matrix(new int[][] { { 1, 2, 3 }, { 4, 5, 6 } });
        Matrix m2 = new Matrix(new int[][] { { 7, 8 }, { 9, 10 }, { 11, 12 } });
        System.out.println(m1.multiply(m2));
    }

    public Matrix(int[][] array2d) {
        this.array2d = array2d;
    }

    public Matrix() {

    }

    public Matrix add(Matrix other) {
        if (this.array2d.length != other.array2d.length) {
            return this;
        }
        if (this.array2d[0].length != other.array2d[0].length) {
            return this;
        }

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                array2d[i][j] += other.array2d[i][j];
            }
        }
        return this;

    }

    public Matrix multiply(Matrix other) {
        if (this.array2d[0].length != other.array2d.length) {
            return this;
        }
        int[][] array = new int[array2d.length][other.array2d[0].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                int element = 0;
                for (int k = 0; k < array2d[0].length; k++) {
                    element += array2d[i][k] * other.array2d[k][j];
                    // System.out.printf("%d %d %d\n", array2d[i][k], other.array2d[k][j], element);
                }

                array[i][j] = element;
            }
        }
        return new Matrix(array);

    }

    @Override
    public String toString() {
        StringBuffer stb = new StringBuffer();
        for (int[] row : array2d) {
            stb.append("[ ");
            for (int number : row) {
                stb.append(number + " | ");
            }
            stb.append("\b\b]");
        }
        return stb.toString();
    }
}