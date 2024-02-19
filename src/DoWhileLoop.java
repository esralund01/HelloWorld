import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //laver en scanner, den hedder bare "scanner"

        int runAgain = 0;

        do {
            System.out.println("Enter the first number");
            double number1 = scanner.nextDouble(); //bruger scanneren til at kunne køre igennem de tal der bliver indtastet

            System.out.println("Enter the second number");
            double number2 = scanner.nextDouble();

            double sum = number1 + number2; //regner summen ud til en double værdi
            System.out.println("The sum is " + sum);

            System.out.println("Would you like to start over? Enter 1 for yes, 2 for no");
            runAgain =scanner.nextInt();
        } while(runAgain ==1); //hvis der bliver tastet 1 skal den kører igen
        scanner.close();
    }

}
