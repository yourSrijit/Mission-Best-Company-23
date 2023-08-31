
//Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), price = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
public class BestTimeToBuy_and_Sell {
    public static int findMaxProfit(int price[]){
        int maxProfit=0;
        int minsoFar=price[0];
        for(int i=0;i<price.length;i++){
            minsoFar=Math.min(minsoFar,price[i]);
            int profit=price[i]-minsoFar;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        int ans=findMaxProfit(price);
        System.out.println("So the max profit is "+ans);
    }
}
