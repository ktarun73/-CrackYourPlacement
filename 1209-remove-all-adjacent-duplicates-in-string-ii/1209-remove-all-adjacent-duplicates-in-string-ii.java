class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> stack=new Stack<>();
        
        for(char ch:s.toCharArray()){
            if(stack.isEmpty() || stack.peek()[0]!=ch){
                stack.push(new int[]{ch,1});
            }
            else{
                stack.peek()[1]++;
            }
            if(stack.peek()[1]==k){
                stack.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            int[] top=stack.peek();
            while(top[1]>0){
                sb.append((char)top[0]);
                top[1]--;
            }
            
            stack.pop();
        }
        
        return sb.reverse().toString();
    }
}