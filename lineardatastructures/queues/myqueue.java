package lineardatastructures.queues;

public class myqueue {
    private final int[] items;
    private int front;
    private int rear;
    private final int size;
    public myqueue(int cap){
        this.items=new int[cap];
        this.front=-1;
        this.rear=0;
        this.size=cap;
    }
    public void enqueue(int vall){
        if(rear==size){
            System.out.println("sal iga masthu nipinav dengai");
            return;
        }
        this.items[rear]=vall;
        rear++;
    }
    public int dequeue(){
        if(front+1==rear){
            System.out.println("empty queue");
            return -1;
        }
        front++;
        int temp=items[front];
        items[front]=0;
        return temp;   
    }
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=0;i<rear;i++){
            // if(items[i]==0){
            //     continue;
            // }
            sb.append(items[i]);
            if(i!=rear-1){
                sb.append(",");
                }
            }
            sb.append("]");

            return  sb.toString();
    }
}
