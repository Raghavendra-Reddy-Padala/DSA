package lineardatastructures.stacks;

import java.util.Stack;

public class builtistacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.push(50);

    //iterate over a stack

    while (!stack.isEmpty()) {
        System.out.println(stack.pop());
    }
    for (Integer integer : stack) {
        System.out.println(integer);
    }
    

    // System.out.println("Stack: " + stack);
    // System.out.println(stack.peek());
    // System.out.println(stack.pop());
    // System.out.println(stack);
    }
}
