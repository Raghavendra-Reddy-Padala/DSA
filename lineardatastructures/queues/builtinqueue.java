package lineardatastructures.queues;

import java.util.*;

public class builtinqueue {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println(queue);
        int len=queue.size();
        // queue.remove();
        // System.out.println(queue);
        // System.out.println(queue.peek());
        // System.out.println(queue.isEmpty());
        // System.out.println(queue.size());
        // System.out.println(queue.contains(30));
        // System.out.println(queue.contains(100));
        // System.out.println(queue.element());
        // System.out.println(queue.poll());
        for(int i =1;i<len;i++ ){
            list.add(queue.remove());
        }
        for(int i =1;i<len;i++){
            queue.add(list.pop());
        }
        System.out.println(queue);

    }
    }

