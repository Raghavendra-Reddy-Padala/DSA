package lineardatastructures.stacks;

public class mystackwithlnkedlist {
    class Node{
        private final int data;
        private Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        public int getData(){
            return data;
        }
    }

        private Node head;
        private Node tail;
        public void push(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                newNode.next=head;
                head=newNode;
            }
        }
            public int  pop(){
            if(head==null){
                System.out.println("Stack underflow error");
            }
            else{
                // System.out.println(head.data);
                head=head.next;
            }
            return head.data;
        }
        public void display(){
          if(head==null){
            
                System.out.println("Stack underflow error");
            }
            StringBuilder sb = new StringBuilder();
            Node curr=head;
            while(curr!=null){
                sb.append(curr.data);
                

                if(curr.next!=null){
                    sb.append("\n");
                sb.append("|");
                sb.append('\n');
                }
                curr=curr.next;
            }
            System.out.println(sb.toString());
        }
        public void peek(){
            if(head==null){
                System.out.println("Stack underflow error");
            }
            else{
                System.out.println(head.data);
            }
        }
        public boolean isempty(){
            return head==null;
        }
        public int weight(){
            int count=0;
            Node current=head;
            while(current!=null){
                count++;
                current=current.next;
            }
            return count;
        }

    }

