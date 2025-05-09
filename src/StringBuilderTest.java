

public class StringBuilderTest {
    public static void main (String[] args) {

        String result = " nummer ";
        for (int i = 0; i < 5; i++) {
            result += i + " nummer ";
        }
        System.out.println(result);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());

        StringBuilder sb1 = new StringBuilder("Java");
        sb.append(" Rocks");
        System.out.println(sb); // Java Rocks
        sb.insert(5, "really ");
        System.out.println(sb); // Java really Rocks
        sb.replace(5, 12, "surely ");
        System.out.println(sb); // Java surely Rocks
        sb.reverse();
        System.out.println(sb); // skcoR ylerus avaJ


        StringBuilder sb2 = new StringBuilder("Code");
        sb.append(" Review");
        System.out.println(sb);

    }
}
