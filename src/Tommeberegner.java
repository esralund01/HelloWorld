import java.util.Scanner;
public class Tommeberegner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Hvor mange inches vil du have omregnet til cm? ");
            double inches = input.nextDouble();
            //gør en variabel konstant ved at skrive med stort og sætte "final" foran
            final double CENTIMETER_PER_INCHES = 2.54;

            double inchesTilCM = (inches * CENTIMETER_PER_INCHES);
            System.out.println("Det er " + inchesTilCM + "cm");
        }
    }
