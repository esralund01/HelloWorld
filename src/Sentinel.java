import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SENTINEL = -1;
        int sum = 0;

        System.out.println("Indtast tal der skal lægges sammen eller -1 for at stoppe");

        while (true) {
            int tal = input.nextInt();

            if (tal == SENTINEL) {
                break;
            }
            sum += tal;
        }
        System.out.println("Summen af tallene er: " + sum);
    }
}
