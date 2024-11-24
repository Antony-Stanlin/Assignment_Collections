package stack;

import java.util.Stack;

public class BasicOperation {
    public static void main(String[] args) {
        
        Stack<Integer> stack=new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}
