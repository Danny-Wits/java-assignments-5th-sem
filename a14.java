public class a14 {
    public static void main(String[] args) {
        String str1 = "Computer";
        String str2 = "Application";
        String str3 = concat(str1, str2, " ");
        System.out.println(str3);
    }

    public static String concat(String s1, String s2, String connector) {
        return s1 + connector + s2;
    }
}
