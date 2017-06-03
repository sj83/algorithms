package arrays;

public class BestTimeToBuyStocks {

    public static void main(String[] args){
        
    }
    
    public int test(int[] input){
        int maxProfit = 0;
        int minPrice = input[0];
        for(int i = 1; i < input.length; i++){
            int diff = input[i] - minPrice;
            maxProfit = Math.max(maxProfit, diff);
            minPrice = Math.min(minPrice, input[i]);
        }
        
        return maxProfit;
    }
}
