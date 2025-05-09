public class Test {
    static public void main(String[] args) {
        String original = "Java";
        String modified = original.concat(" Programming");
        System.out.println(original); // Java
        System.out.println(modified); // Java Programming

        String name = "Learning";
        System.out.println(name.length()); // 8
        System.out.println(name.charAt(2)); // a
        System.out.println(name.substring(0, 4)); // Lear
        System.out.println(name.toUpperCase()); // LEARNING

        String word = "Multimedi";
        String result = word.concat(" Rocks");
        System.out.println(word);
        System.out.println(result);

        String job =  "Developer";
        String Futurejob = job.concat(" Senior");
        System.out.println(job.length());
        System.out.println(job.substring(0,7));
        System.out.println(job.toUpperCase());

        System.out.println(job);
        System.out.println(Futurejob);
    }
}
