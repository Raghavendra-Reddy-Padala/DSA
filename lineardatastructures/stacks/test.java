package lineardatastructures.stacks;

import java.util.Stack;

public class test {
        public static void main(String[] args) {
            // mystack stack = new mystack(5);

            // stack.push(10);
            // stack.push(20);
            // stack.push(30);
            // stack.push(40);
            // stack.push(50);
            // System.out.println(stack);
            // stack.pop();
            // stack.pop();
            // System.out.println();
            // System.out.println(stack);
            // System.out.println("Is the stack empty? "+stack.isempty());

            // mystackwithlnkedlist stack2 = new mystackwithlnkedlist();
            // stack2.push(10);
            // stack2.push(20);
            // stack2.push(30);
            // stack2.push(40);
            // stack2.push(50);
            // // stack2.pop();
            // // stack2.display();
            // stack2.peek();

            //reverse a string using stack

            // mystack x = new mystack(5);
            // Scanner y= new Scanner(System.in);
            // System.out.println("Enter your String");
            // String s = y.nextLine();
            // for(int i=0;i<s.length();i++){
            //     x.push(s.charAt(i));
            // }
            // System.out.println("Reversed String is: ");

            // StringBuilder sb = new StringBuilder();

            // for(int i=0;i<s.length();i++){
            //     sb.append(x.peek());
            //     x.pop();
            // }
            // System.out.println(sb.toString());
            // System.out.println(y);



            //validate parenthesis
            
            //insert element at its bottom in a given stack
            // mystack stack = new mystack(6);
            // stack.push(10);
            // stack.push(20);
            // stack.push(30);
            // stack.push(40);
            // stack.push(50);
            // Stack<Integer> temp = new Stack<>();

            // while(!stack.isempty()){
            //     temp.push(stack.pop());
            // }
            // temp.push(100);
            // while(!temp.isEmpty()){
            //     stack.push(temp.pop());
            // }
            // System.out.println(stack);


            //redundant parenthesis
            String s = "((a+b))";
            System.out.println(isredundant(s));
            String e="((a+b)+c)";
            System.out.println(isredundant(e));
            String r="((a+b)+(c+d))";
            System.out.println(isredundant(r));
            Stack<int[]> stack = new Stack<>();
            stack.push(new int[]{0,1,0});
            stack.push(new int[]{0,0,0});
            stack.push(new int[]{0,1,0});
            
            System.out.println(stack.peek()[0]);


        }
        // public static boolean isredundant(String s){
        //     Stack<Character> stack = new Stack<>();
        //     for(int i=0;i<s.length();i++){
        //         if(s.charAt(i) == ')'){
        //             if(stack.peek() == '('){
        //                 return true;
        //             }
        //             while(stack.peek() != '('){
        //                 stack.pop();
        //             }
        //             stack.pop();
        //         }
        //         else{
        //             stack.push(s.charAt(i));
        //         }
        //     }
        //     return false;
        // }
        public static boolean isredundant(String s){
            Stack<Character> stack = new Stack<>();
            for(char ch: s.toCharArray()){
                if(ch==')'){
                    if(stack.peek()=='('){
                        return true;
                    }
                    while(stack.peek()!='('){
                        stack.pop();
                    }
                    stack.pop();
                }
                else{
                    stack.push(ch);}}return false;}}
