package DP;

import java.util.List;

public class WordBreak {

    public boolean isWordBreak(String str, List<String> list){
        if(str == null || str.length() == 0){
            return false;
        }
        
        boolean[] dp = new boolean[str.length() + 1];
        dp[0] = true;
        
        for(int i = 1; i <= str.length(); i++){
            for(int j = 0; j < i; j++){
                if(dp[j] && list.contains(str.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        
        
        return dp[str.length()];
    }
}
