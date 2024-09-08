public class a13 {
    public static void main(String[] args) {
        String s = "Water";
        System.out.println("Length : " + s.length());
        System.out.println("Sub String (0,2): " + s.substring(0, 2));
        System.out.println("Index of \'ter\': " + s.indexOf("ter"));
        System.out.println("Uppercase : " + s.toUpperCase());
        System.out.println("Lowercase : " + s.toLowerCase());
        System.out.println("Replace e with u : " + s.replace('e', 'u'));
        System.out.println("Repeat s 3 times " + s.repeat(3));
        System.out.println("Character at index 3: " + s.charAt(3));
    }
}
