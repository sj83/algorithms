package arrays;

public class MaxSubArray {

    public static int test(int[] nums){
        int max = 0;
        int sum = 0;
        for(int num : nums){
            if(sum < 0){
                sum = num;
            }else{
                sum+= num;
            }
            
            max = Math.max(max, sum);
        }
        
        return max;
    }
    
}
