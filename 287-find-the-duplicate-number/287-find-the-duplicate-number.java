class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int index=Math.abs(nums[i]);
            if(nums[index]<0){
                return Math.abs(nums[i]);
            }
            nums[index]*=-1;
        }
        return -1;
    }
}