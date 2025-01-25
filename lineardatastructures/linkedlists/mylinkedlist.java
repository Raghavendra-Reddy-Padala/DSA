package lineardatastructures.linkedlists;

import java.util.HashSet;

class Node{
    public  int data;
    public Node next=null;

    public Node(int data) {
        this.data = data;
    }
}

public class mylinkedlist {
     private   Node head;
     private  Node tail;

    public mylinkedlist(){
        head = null;
        tail=null;
    }

    public boolean  isEmpty(){
        return  head==null && tail ==null;
    }

    public void insert(int value){
        Node node = new Node(value);
        if(isEmpty()){// for empty linked list
            head=node;
            tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
    }
    public int sum(){
        Node curr = head;
        int sum=0;
        while(curr!=null){
            sum+=curr.data;
            curr=curr.next;
        }
        return  sum;
    }
    public int indexof(int value){
        int index=0;
        Node curr = head;
        while(curr!=null){
            if(curr.data==value)return index;
            index++;
            curr=curr.next;
        }
        return index;
    }
    public boolean  exist(int value){
        Node curr = head;
        while(curr!=null){
            if(curr.data==value) return true;
            curr=curr.next;
        }
        return false;
    }
    public void insertatfirst(int value){
        Node node = new Node(value);
        if(isEmpty()){
            insert(value);
        }
        
        node.next=head;
        head=node;
    }

     
    public void  insertatindex(int index,int value) {
        if(index<0) throw new IllegalArgumentException();
        if(isEmpty())throw new IllegalArgumentException();
        Node node = new Node(value);
        Node curr = head;
//type 1
        Node prev = null;
        while(index>0&&curr!=null){
            prev=curr;
            curr=curr.next;
            index--;
        }
        prev.next=node;
        node.next=curr;
//type 2
//         int i=0;
//         while(i<index-1){
//             //curr will points to index befor element
//             curr=curr.next;
//             i++;
//         }
//         node.next=curr.next;
//         curr.next=node;
    }

    public void reversemyllist(){
        if(head==null||head.next==null)return;
        Node prev=null;
        Node curr=head;
        Node next=curr.next;
        while(next!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            next=next.next;
        }
        curr.next=prev;
        tail=head;
        tail.next=null;
        head=curr;
    }
    public void delatstart(){
        if(isEmpty())return;
        Node temp = head;
        head=head.next;  
        temp.next=null;
    }

    public void delatend(){
        if(isEmpty())return;
        Node curr=head;
        while(curr.next!=tail){
            curr=curr.next;
        }
        curr.next=null;
        tail=curr;
        
    }
    public void delatindex(int index){
        if(isEmpty())return;
        Node curr=head;
        int c=0;
        while (curr != null) {
            c++;
            curr = curr.next;
        }
        if(index>c){
            System.out.println("Index out of Bound");
        }
        Node prev=null;
        while(index>0 && curr!=null){
            prev=curr;
            curr=curr.next;
            index--;
        }
        if (prev != null && curr != null) {
            prev.next = curr.next;
        }
    }
    private  Node reverserec(Node head){
        if(head==null || head.next==null)return head;

        Node rest =reverserec(head.next);
        Node next = head.next;
        next.next=head;
        head.next=null;

        return rest;
    }
    public void recreverse(){
        head=reverserec(head);
    }

    private  void   printelem(Node head){
        StringBuilder x=new StringBuilder();
        if(head==null){
            return ;
        }if(head.next!=null){
            x.append(" -- >");
        }
        x.append(head.data);
        
        printelem(head.next);
        System.out.print(x.toString());
    }
    public void printrec(){
        printelem(head);
    }

    @Override
    public String toString() {
        Node curr = head;
        StringBuilder str = new StringBuilder();
        while(curr !=null){
            str.append(curr.data);
            if(curr.next!=null){
                str.append(" -- > ");
            }
            curr=curr.next;
        }
        return str.toString();
        
    }
    
    //revsers linked list in k pairs

    private Node reverseinpairs(Node head, int k) {
        if (head == null || head.next == null) return head;
        Node prev = null;
        Node curr = head;
        Node next = curr.next;
        int c = 0;
        while (next != null && c < k) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
            c++;
        }
        
        Node x = reverseinpairs(curr, k);
        head.next = x;
        return prev;
    }
    public void reverseinkpairs(int k){
        head=reverseinpairs(head,k);
    }
    public void delatvalue(int value){
        if(isEmpty())return;
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            if(curr.data==value){
                if(prev==null){
                    head=head.next;
                }else{
                    prev.next=curr.next;
                }
                return;
            }
            prev=curr;
            curr=curr.next;
        }
    }
    public boolean  detectandremoveloop(){
        HashSet<Node> set = new HashSet<>();
        Node slow= head;
        Node fast = head;
        set.add(slow);
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(set.contains(slow)){
                System.out.println("loop detected at value "+slow.data);
                return true ;
            }
            else{
                set.add(slow);
            }
            if(slow==fast){
                return false;
            }

    }
    return false;
}
}

