class MinStack {
    List<Integer> list;
    int min=Integer.MAX_VALUE;
    public MinStack() {
        list=new ArrayList<>();
    }
    
    public void push(int val) {
        min=Math.min(val,min);
        list.add(val);
        
    }
    
    public void pop() {
        list.remove(list.size()-1);
        min=Integer.MAX_VALUE;
        for(Integer i:list){
            min=Math.min(i,min);
        }
        
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */