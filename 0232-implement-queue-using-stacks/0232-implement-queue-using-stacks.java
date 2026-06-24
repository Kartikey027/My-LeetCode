class MyQueue {
    Stack<Integer> inp;
    Stack<Integer> opt;
    public MyQueue() {
        inp=new Stack<>();
        opt=new Stack<>();
    }
    
    public void push(int x) {
        inp.push(x); 
    }
    
    public int pop() {
        while(inp.size()!=0){
            opt.push(inp.pop());
        }
        int r=opt.pop();
        while(opt.size()!=0){
            inp.push(opt.pop());
        }
        return r;
    }
    
    public int peek() {
        if(!empty()){
            while(inp.size()!=0){
                opt.push(inp.pop());
            }
            int p=opt.peek();
            while(opt.size()!=0){
                inp.push(opt.pop());
            }
            return p;
        }
        return 0;
    }
    
    public boolean empty() {
        return inp.size()==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */