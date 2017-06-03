package arrays;

public class SearchElementInRotatedSortedArray {

    
    public boolean search(int[] nums, int target){
        // first find the number of rotations;
        int low = 0;
        int high = nums.length - 1;
        while(high > low){
            int mid = (high - low) / 2;
            if(nums[mid] > nums[high]){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        
        int rot = low;
        low = 0;
        high = nums.length - 1;
        while(high > low){
            int mid = (high - low) / 2;
            int realMid = (mid + rot) % nums.length;
            if(target == nums[realMid]){
                return true;
            }else if(target > nums[realMid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        
        return false;
    }
    
}
