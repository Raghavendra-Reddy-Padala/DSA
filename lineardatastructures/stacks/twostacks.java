package lineardatastructures.stacks;

public class twostacks {
    
    private final int[] items;
    private int top1;
    private int top2;
    private final int size;


    public twostacks(int size) {
        this.size = size;
        this.items = new int[size];
        this.top1 = 0;
        this.top2 = size-1;
    }
    public void push1(int value) {
        if (top1 >top2) {
            System.out.println("Stack overflow error" +value);
        }
        this.items[top1]=value;
        this.top1++;
    }
    public void push2(int value) {
        if (top2 > top1) {
            System.out.println("Stack overflow error" +value);
        }
        this.items[top2]=value;
        this.top2--;
    }
    public void pop(){
        if (top1 == 0) {
            System.out.println("Stack underflow error");
        }
        this.top1--;
        System.out.println(this.items[this.top1]);
        this.items[this.top1] = 0;
    }
    public void pop2(){
        if (top2 == size) {
            System.out.println("Stack underflow error");
        }
        this.top2++;
        System.out.println(this.items[this.top2]);
        this.items[this.top2] = 0;
    }
    public int peek() {
        if (top1 == 0) {
            System.out.println("Stack underflow error");
            return -1;
        }
        return this.items[this.top1 - 1];
    }
    public int peek2() {
        if (top2 == size) {
            System.out.println("Stack underflow error");
            return -1;
        }
        return this.items[this.top2 + 1];
    }
    public int weight() {
        return this.top1;
    }
    public int weight2() {
        return this.size - this.top2 - 1;
    }
    public boolean isempty() {
        return this.top1==0;
    }
        public boolean isempty2() {
        return this.top2 == size;
    }
    @Override
    public String toString(){
        if (top1 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append("\n");

        for (int i = 0; i < top1; i++) {
            sb.append(this.items[i]);
            if (i < top1 - 1) {
                sb.append("\n");
            }
        }
        sb.append("\n");
        sb.append(']');
        return sb.toString();

    }
    public String toString2(){
        if (top2 == size) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append("\n");
        for (int i = size-1; i > top2; i--) {
            sb.append(this.items[i]);
            if (i > top2 + 1) {
                sb.append("\n");
            }
        }
        sb.append("\n");
        sb.append(']');
        return sb.toString();
    }
    public static void main(String[] args) {
        twostacks stack = new twostacks(10);
        stack.push1(1);
        stack.push1(2);
        stack.push1(3);
        stack.push1(4);
        stack.push1(5);
        stack.push2(1);
        stack.push2(2);
        stack.push2(3);
        stack.push2(4);
        stack.push2(5);
        System.out.println(stack.toString());
        System.out.println(stack.toString2());
        System.out.println(stack.weight());
        System.out.println(stack.weight2());
        stack.pop();
        stack.pop2();
        System.out.println(stack.toString());
        System.out.println(stack.toString2());
        System.out.println(stack.weight());
        System.out.println(stack.weight2());
        System.out.println(stack.isempty());
        System.out.println(stack.isempty2());
        System.out.println(stack.peek());
    }
}
