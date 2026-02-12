class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0 ,high=nums.length-1;
        int pos = nums.length;
        while(low<=high){
            int mid = low + (high-low)/2;
           if(nums[mid]>=target){
                pos = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return pos;
    }
}