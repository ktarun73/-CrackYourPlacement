class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set=new HashSet<>();
        
        for(int i:nums){
            set.add(i);
        }
        
        int longestStreak=0;
        
        for(int i:nums){
            if(!set.contains(i-1)){
                int cur=i;
                int curStreak=1;
                while(set.contains(cur+1)){
                    cur++;
                    curStreak++;
                }
                
                longestStreak=Math.max(longestStreak,curStreak);
            }
        }
     return longestStreak;
    }
}