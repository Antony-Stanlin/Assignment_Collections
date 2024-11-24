package stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ConvertArrayStack {
    public static void main(String[] args) {
        
        Stack<Double> stack=new Stack<>();
        
        stack.addAll(List.of(1.1, 2.2, 3.3, 4.4, 5.5));

        double[] a=toArrayDouble(stack);
        System.out.println("Array Format: "+Arrays.toString(a));

        Stack<Double> converedStack=toStackDouble(a);

        System.out.println("Stack Format:");
        while (!converedStack.isEmpty()) {
            System.out.println(converedStack.pop());
        }
    }

    public static double[] toArrayDouble(Stack<Double> stack){
        int len=stack.size();
        double a[]=new double[len];
        int i=0;

        while (!stack.isEmpty()) {
            a[i++]=stack.pop();
        }
           

        return a;
    }

    public static Stack<Double> toStackDouble(double[] a){
        Stack<Double> stack=new Stack<>();

        for(double i:a)
            stack.push(i);

        return stack;
    }
}
