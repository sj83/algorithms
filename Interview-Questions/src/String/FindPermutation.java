package String;

import java.util.ArrayList;
import java.util.List;

public class FindPermutation {
    
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        boolean flag = findPermutation(list, "", "tactcoa");
        System.out.println(list.size());
        System.out.println(flag);
    }
    
    public static boolean findPermutation(List<String> list, String prefix, String input){
        if(input.length() == 0){
            list.add(prefix);
            return isPalindrome(prefix);
            //list.add(prefix);
            //System.out.println(list.size());
        }
        
        for(int i = 0; i < input.length(); i++){
            boolean flag = findPermutation(list, prefix + input.charAt(i), input.substring(0, i) + input.substring(i + 1, input.length()));
            if(flag){
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean isPalindrome(String input){
        int l = 0;
        int h = input.length() - 1;
        while(h > l){
            if(input.charAt(l) != input.charAt(h)){
                return false;
            }
            h--;
            l++;
        }
        
        return true;
    }
    
}
