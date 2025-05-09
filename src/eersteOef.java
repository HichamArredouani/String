public class eersteOef {
    public static void main(String[] args) {
        String a = "Humble";
        String b = "Humble";
        String c = new String("Humble");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));
    }
}
