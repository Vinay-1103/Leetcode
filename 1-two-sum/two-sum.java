class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] rarray=new int[2];
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target==nums[i]+nums[j]){
                    rarray=new int[]{i,j};
                    return rarray;
                }
            }
        }
        return null;
    }
}