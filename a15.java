public class a15 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Water");
        System.out.println("Append : " + sb.append("!"));
        System.out.println("Insert at 5 : " + sb.insert(5, " "));
        System.out.println("Replace 1-3 with \'cat\' : " + sb.replace(1, 3, "cat"));
        System.out.println("Delete 1 : " + sb.delete(0, 1));
        System.out.println("Reverse : " + sb.reverse());
        System.out.println("Length : " + sb.length());
        System.out.println("Capacity : " + sb.capacity());
    }
}
