package String;

public class OneAway {

    public static void main(String[] args){
        System.out.println(oneAway("pale", "ale"));
        System.out.println(oneAway("pales", "pale"));
        System.out.println(oneAway("pale", "bale"));
        System.out.println(oneAway("pale", "bake"));
        System.out.println(oneAway("ale", "pale"));
        System.out.println(oneAway("aale", "ale"));
        System.out.println(oneAway("aael", "ale"));
        System.out.println(oneAway("motherinlaw", "womanhitler"));
        System.out.println(oneAway("motherinlaw", "motherinlow"));
    }
    
    public static boolean oneAway(String s1, String s2){
        int diff = Math.abs(s1.length() - s2.length());
        if(diff > 1){
            return false;
        }
        
        if(diff == 0){
            return oneAwayEqual(s1, s2);
        }else{
            return oneAwayNotEqual(s1, s2);
        }
    }
    
    public static boolean oneAwayEqual(String s1, String s2){
        int count = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;
                if(count > 1){
                    return false;
                }
            }
        }
        
        if(count == 0){
            return false;
        }
        
        return true;
    }
    
    public static boolean oneAwayNotEqual(String s1, String s2){
        int count = 0;
        String max = "";
        String min = "";
        if(s1.length() > s2.length()){
            max = s1;
            min = s2;
        }else{
            max = s2;
            min = s2;
        }
        
        int minIndex = 0;
        int maxIndex = 0;
        while(maxIndex < max.length() && minIndex < min.length()){
            if(max.charAt(maxIndex) != min.charAt(minIndex)){
                count++;
                if(count > 1){
                    return false;
                }
                maxIndex++;
            }else{
                maxIndex++;
                minIndex++;
            }
            
        }
        
        return true;
    }
}
