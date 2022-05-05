class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int area=1;
            if(height[i]<height[j]){
                area=height[i]*(j-i);
                i++;
            }
            else{
                area=height[j]*(j-i);
                j--;
            }
            if(maxArea<area){
                maxArea=area;
            }
        }
     return maxArea;   
    }
}