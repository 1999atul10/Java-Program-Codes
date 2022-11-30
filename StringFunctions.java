public class StringFunctions {
    static String s1 = " Hello ";
    static String s2 = " World ";

    void checkEquality() {
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 == s1 : " + (s1 == s1));
    }

    void findLength() {
        System.out.println("Length of s1 " + s1.length());
        System.out.println("Length of s2 " + s2.length());
    }

    void replaceLetters() {
        System.out.println("s1.replace('l', 'Z') : " + s1.replace('l', 'Z'));
        System.out.println("s2.replace('l', 'L') : " + s2.replace('l', 'Z'));
    }

    void convertToUpperCase() {
        System.out.println("s1.toUpperCase() : " + s1.toUpperCase());
        System.out.println("s2.toUpperCase() : " + s2.toUpperCase());
    }

    void concatenate2Strings() {
        System.out.println("s1.concat(s2) : " + s1.concat(s2));
    }

    public static void main(String[] args) {
        System.out.println("\n\n");
        StringFunctions sf = new StringFunctions();
        sf.checkEquality();
        System.out.println("\n");
        sf.findLength();
        System.out.println("\n");
        sf.replaceLetters();
        System.out.println("\n");
        sf.convertToUpperCase();
        System.out.println("\n");
        sf.concatenate2Strings();
        System.out.println("\n\n");
    }
}
