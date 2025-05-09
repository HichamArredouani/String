public class Own {
    public static void main(String[] args) {
        String quote = "Innamal ilmu bi ta'alum";
        System.out.println(quote.toLowerCase());
        System.out.println("Character: " + quote.length());

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        System.out.println(s1 == s2);       // true — same object in the pool
        System.out.println(s1 == s3);       // false — different objects
        System.out.println(s1.equals(s3));

        String a = "Multimedi";
        String b = "Multimedi";
        String c = new String("Multimedi");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        String x = "Code";
        String y = new String("Code");
        System.out.println(x == y);         // false
        System.out.println(x.equals(y));    // true
        String z = y.intern();
        System.out.println(x == z);
    }
}
