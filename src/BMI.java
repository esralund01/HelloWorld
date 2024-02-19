import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Indtast din vægt i kg:");
        double vægtIKG = input.nextDouble();

        System.out.println("Indtast din højde i m:");
        double højdeIM = input.nextDouble();

        double BMI = vægtIKG / (højdeIM * højdeIM);
        System.out.println("Dit BMI er " + BMI);

        if(BMI <18.5){
            System.out.println("Undervægtig");
        }
        if (BMI >= 18.5 && BMI <=25){
            System.out.println("Normalvægtig");
        }
        if (BMI > 25 && BMI <= 30){
            System.out.println("Overvægtig");
        }
        else if (BMI >30) {
            System.out.println("Svært overvægtig");
        }
    }
}
