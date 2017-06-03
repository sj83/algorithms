package String;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhoneNumber {

    public static void main(String[] args){
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }
    
    public void test(List<String> result, StringBuilder sb, Map<Character, String> map, int index, String digits){
        if(index >= digits.length()){
            return;
        }
        
        String input = map.get(digits.charAt(index));
        for(int i = 0; i < input.length(); i++){
            sb.append(input.charAt(i));
            if(sb.length() == digits.length() - 1){
                result.add(sb.toString());
            }
            test(result, sb, map, index + 1, digits);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    
}
