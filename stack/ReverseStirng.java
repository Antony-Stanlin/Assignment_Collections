package stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStirng {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        char[] s=sc.nextLine().toCharArray();

        Stack<Character> stack=new Stack<>();

        for(char c:s)
            stack.push(c);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        System.out.println();

    }
}
