package Arrays;

public class Buy_and_Sell_Stocks {
    public static int profit(int sellStock[]){
        int buyStock = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0; i < sellStock.length; i++){
            if(buyStock < sellStock[i]){
                int profit1 = sellStock[i] - buyStock;
                maxprofit = Math.max(maxprofit, profit1);
            }
            else{
                buyStock = sellStock[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int sellStock[] = {7, 1, 5, 3, 6, 4};
        int ans = profit(sellStock);
        System.out.println("Maximum profit is : "+ans+" units.");
    }
}
