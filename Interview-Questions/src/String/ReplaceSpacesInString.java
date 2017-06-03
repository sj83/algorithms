package String;

import java.util.Arrays;

public class ReplaceSpacesInString {

    public static void main(String[] args){
        char[] input = "Mr John Smith    ".toCharArray();
        replaceSpace(input, "abc", 13);
        System.out.println(Arrays.toString(input));
    }
    
    public static void replaceSpace(char[] input, String replaceWith, int trueLength){
        if(input == null || input.length == 0){
            return;
        }
        
        int fast = trueLength - 1;
        int slow = input.length - 1;
        while(fast >= 0){
            if(input[fast] != ' '){
                input[slow] = input[fast];
                fast--;
                slow--;
            }else{
                for(int i = replaceWith.length() - 1; i >= 0 ; i--){
                    input[slow] = replaceWith.charAt(i);
                    slow--;
                }
                fast--;
                //fast = slow - 1;
            }
        }
    }
    
}
