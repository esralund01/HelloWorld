import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //to use scanner
        Random rand = new Random(); //to use random generator
        //lav to variabler

        int numberToGuess = rand.nextInt(10)+1; // 10 fordi den giver 10 tal.
        //+1 fordi den starter fra 1 istedet for 0. så den giver et random tal fra 1-10
        int userGuess = -1;
        int guesses =1; // ekstra variabel der tilføjer hvor mange gæt brugeren har brugt

        //lav prompt til bugeren om at indtaste et tal
        System.out.println("Indtast et tal mellem 1-10");

        //tilføj et loop
        while (userGuess != numberToGuess) {
            userGuess = scanner.nextInt(); //der skal bruges scanner til at registerer hvorvidt userguess matcher numbertoguess
            if(userGuess < numberToGuess){
                System.out.println("Forkert. Tallet jeg tænker på er større. Prøv igen");
                guesses++; //tilføjer ++ for at få den til at lægge gættene sammen
            }
            if(userGuess > numberToGuess) {
                System.out.println("Forkert. Tallet jeg tænker på er mindre. Prøv igen");
                guesses++;
            }

        } /* der behøves ikke laves et if loop for det korrekte svar
        //da de if loops vi har lavet kun er gældende sålænge det er !=.
        //den ved derfor at hvis det er == så skal den gå udenom den prompt, og kommer derfor automatisk herned til
        //sidste output */
        System.out.println("Korrekt!");
        System.out.println("Total antal gæt: " + guesses);
    }
}
