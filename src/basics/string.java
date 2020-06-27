package basics;

public class string {

    public static void main(String[] args) {

        System.out.println("OLÁ".charAt(2));
        String s = "Bolotinha";

        System.out.println(s.concat(" preta"));
        System.out.println(s.toUpperCase());
        System.out.println(s.startsWith("B"));
        System.out.println(s.startsWith("b"));
        System.out.println(s.endsWith("nha"));
        System.out.println(s.endsWith("A"));
        System.out.println(s.length());

        System.out.printf("Eu gosto de %s", s);

    }
}
