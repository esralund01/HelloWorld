public class booleanLogic {
    public static void main(String[] args) {
        //test af metoden bothTrue

        boolean result1 = bothTrue (true, false);
        boolean result2 = bothTrue (true, true);

        System.out.println("Resultat 1 " + result1);
        System.out.println("Resultat 2 " + result2);
    }

    public static boolean bothTrue (boolean a, boolean b) { //static fordi det er en non-access modifier.
        //den provider med info omkring a og b
        return a&&b; // returnerer a og b, hvis begge parametre er sande
    }
}
