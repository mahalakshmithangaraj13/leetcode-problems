class Solution {
    public int[] finalPrices(int[] prices) {
        int[] result=prices.clone();
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(i<j && prices[i]>=prices[j]){
                    result[i]=prices[i]-prices[j];
                    break;
                }
            }
        }
        return result;
    }
}
