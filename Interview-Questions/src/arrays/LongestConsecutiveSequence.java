package arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

    public static int test(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int max = 1;
       for(int num : nums){
           if(map.containsKey(num)){
               continue;
           }
           
           int left = map.containsKey(num - 1) ? map.get(num - 1) : 0;
           int right = map.containsKey(num + 1) ? map.get(num + 1) : 0;
           
           int result = left + right + 1;
           map.put(num, result);
           map.put(num - 1, result);
           map.put(num + 1, result);
           max = Math.max(result, max);
       }
        
        return max;
    }
    
}
