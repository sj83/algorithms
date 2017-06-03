package arrays;

import java.util.Arrays;

public class ProductOfArrayExceptItSelf {

    public static void main(String[] args){
        int input[] = {2,3,4,5};
        int[] result = test(input);
        System.out.println(Arrays.toString(result));
    }
    
    public static int[] test(int[] input){
       int[] result = new int[input.length];
       int temp = 1;
       for(int i = 0 ; i < input.length; i++){
           result[i] = temp;
           temp*= input[i];
       }
       
       temp = 1;
       for(int i = input.length - 1 ; i >= 0; i--){
           result[i]*= temp;
           temp*= input[i];
       }
       
       return result;
        
    }
    
    
    
}
