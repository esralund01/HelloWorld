public class arrays {
    public static void main(String[] args) {

        // opgave 1
    int[] myArray = {34, 0, 0, 0, 0, 0, 0, 117}; //liste med de numre vi skal bruge
    for (int i = 0; i <= 7; i++) { // selve formlen for "for-loop"
            System.out.print(myArray[i]);
            System.out.println(" ");
        }

        //opgave 2 +3 :print goddag & index 2 = 3. i rækken
        String [] goddag = {"Hej", "med", "dig"};
        double[] numbers = {3.4, 2.5, 1.2, 6.7};

        for (int i=0; i <numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println(" ");

        for (String i: goddag){
            System.out.print(" " + i);
        }
        System.out.println(" ");

        System.out.println(numbers[2]);
        System.out.println(numbers.length);

    }
}
