package String;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeating {

    public static void main(String[] args){
        
    }
    
    public static int test(String s){
        if(s == null || s.length() == 0){
            return 0;
        }
        
        Map<Character, Integer> map = new HashMap<>();
        int low = 0;
        int max = 0;
        for(int high = 0; high < s.length(); high++){
            if(map.containsKey(s.charAt(high))){
                low = Math.max(low, map.get(s.charAt(high)) + 1);
            }
            
            map.put(s.charAt(high), high);
            max = Math.max(max, (high - low) + 1);
        }
        
        
        return 0;
    }
    
}
