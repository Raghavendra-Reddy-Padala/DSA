package lineardatastructures.queues;
public class testqueue {
    public static void main(String[] args) {
        myqueue queue = new myqueue(5);
        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(1);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(1);
        System.out.println(queue);


    }
}
