public class forLoop {
    public static void main(String[] args) {
        //opgave 1
        for (int i = 1; i <= 4; i++) { //hvis i går fra 1-4 så skal der udskriver følgende
            System.out.println("2 gange " + i + "=" + i * 2);
        }
        //opgave 2
        System.out.println();
        for (int i = 2; i <= 12; i = i + 2) { //i går fra 2-12 og fordi den plusser med 2 er det kun hver anden der bliver printet
            System.out.println(i + " ");
        }
        for (int i = 4; i <= 79; i = i + 15) {
            System.out.println(i + " ");
        }
        for (int i = 30; i >= -20; i = i - 10) {
            System.out.println(i + " ");
        }
        for (int i = -7; i <= 13; i = i + 4) {
            System.out.println(i + " ");
        }
        for (int i = 97; i >= 82; i = i - 5) {
            System.out.println(i + " ");
        }
    }
}
