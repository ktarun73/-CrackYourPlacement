class Solution {
    public int firstMissingPositive(int[] nums) {
        sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1) return i+1;
        }
        
        return nums.length+1;
        
    }
    
    void sort(int[] ar){
        int i=0;
        while(i<ar.length){
            if(ar[i]<1 || ar[i]>ar.length){
                i++;
                continue;
            }
            int correct=ar[i]-1;
            if(ar[i]!=ar[correct]){
                swap(ar,i,correct);
            }
            else{
                i++;
            }
        }
    }
    
    void swap(int[] ar,int i,int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
}