public class SB {
    public static void main (String [] args) {
        StringBuilder sb = new StringBuilder("Start");
        sb.append(" - Middle");
        sb.insert(0, "Begin: ");
        sb.replace(7, 13, "Replaced");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

    }
}
