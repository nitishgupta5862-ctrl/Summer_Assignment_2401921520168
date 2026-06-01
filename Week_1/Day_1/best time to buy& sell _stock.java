class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int buyprice=prices[0];
        for(int i=1;i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice;
                 maxprofit=Math.max(profit,maxprofit);
            }
            else{
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }
}
