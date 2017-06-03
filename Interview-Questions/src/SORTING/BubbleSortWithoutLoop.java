package SORTING;

import java.util.Arrays;

public class BubbleSortWithoutLoop {

    public static void main(String[] args){
        int arr[] = {3,60,35,2,45,320,5}; 
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void bubbleSort(int[] nums){
        bubbleOuterSort(nums, 0);
    }
    
    public static void bubbleOuterSort(int[] nums, int i){
        if(i >= nums.length){
            return;
        }
        
        bubbleInnerSort(nums, i, 1);
        bubbleOuterSort(nums, i + 1);
    }
    
    public static void bubbleInnerSort(int[] nums, int i, int j){
        if(j >= nums.length - i){
            return;
        }
        
        if(nums[j] < nums[j - 1]){
            int temp = nums[j];
            nums[j] = nums[j - 1];
            nums[j - 1] = temp;
        }
        
        bubbleInnerSort(nums, i, j + 1);
    }
}
