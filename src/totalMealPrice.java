public class totalMealPrice {
    public static double calculateTotalMealPrice(double listedPrice,
                                               double tipRate,
                                               double taxRate){
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result = listedPrice + tip + tax;
        return result;
        //System.out.println("Your total meal price is: " + result);
    }
    public static void main(String[] args) {
       double groupTotalMealCost = calculateTotalMealPrice(15, 2.0, 5);
        System.out.println(groupTotalMealCost);
        double individualTotalMealCost  = groupTotalMealCost / 5;
        System.out.println(individualTotalMealCost);

    }
}
