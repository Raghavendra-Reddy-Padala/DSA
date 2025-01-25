package lineardatastructures.stacks;

public class mystack {
    private final int[] items;
    private int top;
    private final int size;

    public mystack(int size) {
        this.size = size;
        this.items = new int[size];
        this.top = 0;
    }
    public void push(int value) {
        if (top == size) {
            System.out.println("Stack overflow error" +value);
        }
        this.items[this.top] = value;
        this.top++;
    }
    
    public int peek() {
        if (top == 0) {
            System.out.println("Stack underflow error");
            return -1;
        }
        return this.items[this.top - 1];
    }
  
    public int  pop() {
        if (top == -1) {
            System.out.println("Stack underflow error");
        }
        this.top--;
        // System.out.println(this.items[this.top]);
        // this.items[this.top] = 0;
        return this.items[this.top];
    }
    public int weight() {
        return this.top;
    }
    public boolean isempty() {
        return this.top == 0;
    }
    @Override
    public String toString(){
        if (top == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append("\n");


        for (int i =size-1; i >= 0; i--) {
            if(items[i]==0){
                continue;
            }
            sb.append(items[i]);
            sb.append("\n");
            if(i>0){
                sb.append("|");
                sb.append("\n");
            }
            
        }
        sb.append(']');

        return sb.toString();
    }


    // two stacks one array
    



    

}
