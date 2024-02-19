import java.util.Scanner;
//define function
public class teaTime {
    public static void announceTeaTime () {
        System.out.println("Waiting for tea time");
        System.out.println("Type in random word and press 'Enter' " + "to start tea time");
        Scanner input =new Scanner(System.in);
        input.next();
        System.out.println("Its tea time");
    }
//run function
    public static void main(String[] args) {
        announceTeaTime();
    }
}
