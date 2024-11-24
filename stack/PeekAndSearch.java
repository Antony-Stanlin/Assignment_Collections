package stack;

import java.util.List;
import java.util.Stack;

public class PeekAndSearch {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();

        // stack.push("first");
        // stack.push("second");
        // stack.push("Third");
        // stack.push("forth");

        stack.addAll(List.of("first", "second", "third", "fourth"));

        System.out.println("The top of element is: "+stack.peek());

        System.out.println("Position of \"second\" is: "+stack.search("second"));
        
    }
    
}
