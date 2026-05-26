import java.util.*;
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] prices = new int[n];
        for(int i=0; i<prices.length; i++){
            prices[i] = input.nextInt();
        }
        System.out.println(bestTimeToSell(prices));
    }
    static int bestTimeToSell(int[] prices){
        if(prices.length == 0){
            return 0;
        }
        int currentPrice = prices[0];
        int maxProfit = 0;
        for(int i=1; i<prices.length; i++){
            int netProfit = prices[i] - currentPrice;
            if(netProfit > maxProfit){
                maxProfit = netProfit;
            }
            if(prices[i] < currentPrice){
                currentPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
