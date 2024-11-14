package LeetCode;

public class BestTimeBuy {
    public static void main(String[] args) {
        maxProfit();
    }
    public static int maxProfit() {
        int[] price={
                7,6,4,3,1,2
        };
        int minPrice = price[0];
        int maxProfit=0 ;

        for (int i = 1; i < price.length; i++) {

            if (price[i] < minPrice) {
                minPrice = price[i];
            }


            int currentProfit = price[i] - minPrice;


            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }

        System.out.println("Maksimum Kâr: " + maxProfit);
        return maxProfit;
    }

}
