public class tweedeOef {
    public static void main (String[] args) {
        String a = new String("Developer");
        String interned = a.intern();
        String literal = "Developer";

        System.out.println("Interned == literal: " + (interned == literal));
    }
}
