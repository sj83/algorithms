package arrays;

public class FindMinThatDecreasesAndIncreases {

    public static void main(String[] args){
        //int nums[] = {9, 8, 7, 6, 4, 3, 8, 9, 15, 18, 20, 22};
        int nums[] = {2,1};
        int index = test(nums, 0, nums.length - 1);
        System.out.println(nums[index]);
    }
    
    public static int test(int[] nums, int low, int high){
        if(low == high){
            return low;
        }

        if(low + 1 == high){
            return nums[high];
        }
        
        int mid = (high - low) / 2;
        if(mid + 1 == high){
            
        }
        
        if(nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1]){
            return mid;
        }else if(nums[mid] < nums[mid + 1]){
            high = mid - 1;
        }else{
            low = mid + 1;
        }
        
        return -1;
    }
    
}
