public class Vowels {
    private static void vowels(String str) { str.chars().filter(i->"aeiouy".indexOf(i)>0).forEach(System.out::print); }

    public static void main(String[] args) {
        vowels("Travelling alteration impression six all uncommonly");
    }
}
