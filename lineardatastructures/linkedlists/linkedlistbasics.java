package lineardatastructures.linkedlists;

import java.util.LinkedList;
import java.util.List;

public class linkedlistbasics {
    public static void main(String[] args) {
        //predefined or built in linked list
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(200);
        list.add(300);
       
        //linked list which i made
        mylinkedlist x = new  mylinkedlist();
        x.insert(10);
        x.insert(30);
        x.insert(50);
        x.insert(300);
        x.insert(-5);
        // x.delatend();
        // x.delatstart();
        // x.reversemyllist();
        // x.delatindex(9);
        System.out.println(x.detectandremoveloop());
    }
}
