import java.util.Arrays;

public class charArray {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabets[i] = (char) (i + 97);
        }
        System.out.println(Arrays.toString(alphabets));
        int vowelCount = 0;
        for (char c : alphabets) {
            if (isVowel(c))
                vowelCount++;
        }
        System.out.println("Total vowels in the array are : " + vowelCount);
    }

    public static boolean isVowel(char c) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        for (char d : vowels) {
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
