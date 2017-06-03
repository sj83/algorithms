package arrays;

public class FindSumEqualsForConsecutiveNumbers {

    public static void main(String[] args){
        isSum(5);
    }
    
    public static void isSum(int n){
        int sum = 0;
        int limit = n;
        int l = 1;
        int h = (n/2) + 1;
        int curr = l;
        int range = 1;
        while(l <= h){
            sum = 0; 
            while(range <= limit){
                sum+= curr;
                //System.out.println(curr);
                if(sum == n){
                    System.out.println(l + " " + curr);
                    limit = curr - l;
                    l = curr - 1;
                    break;
                }
                curr++;
                range++; 
            }
            l++;
            range = 1;
        }
    }
    
}
