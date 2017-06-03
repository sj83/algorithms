package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindCombination {

    public static void main(String[] args){
        Set<String> set = findCombinations("1234");
    }
    
    public static Set<String> findCombinations(String str){
        Set<String> list = new LinkedHashSet<>();
        findCombinations(list, new StringBuilder(), str, 0, 2);
        System.out.println(list);
        
        return list;
    }
    
    public static void findCombinations(Set<String> list, StringBuilder sb, String str, int index, int k){
        for(int i = index; i < str.length(); i++){
            sb.append(str.charAt(i));
            //if(sb.length() == k){
                list.add(sb.toString());
            //}
            findCombinations(list, sb, str, i + 1, k);
            sb.deleteCharAt(sb.length() - 1);
        }
        
    }
    
}
