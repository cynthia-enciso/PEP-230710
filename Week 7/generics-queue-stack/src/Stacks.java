import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Stacks {
    // push, peek, pop
    public static void main(String[] args) {
        // deque
        Deque<Integer> dequeStack = new ArrayDeque<>();
        System.out.println("DequeStack:");
        dequeStack.push(1);
        System.out.println(dequeStack);
        dequeStack.push(2);
        System.out.println(dequeStack);
        dequeStack.push(3);
        System.out.println(dequeStack);
        dequeStack.push(4);
        System.out.println(dequeStack);
        dequeStack.push(5);
        System.out.println(dequeStack);

        System.out.println("Iterating over a Deque Stack:");
        for(Integer element : dequeStack) {
            System.out.println(element);
        }


        // stack
        System.out.println("Stack:");
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        System.out.println(stack2);
        stack2.push(2);
        System.out.println(stack2);
        stack2.push(3);
        System.out.println(stack2);
        stack2.push(4);
        System.out.println(stack2);
        stack2.push(5);
        System.out.println(stack2);
        stack2.pop();
        System.out.println(stack2);

        System.out.println("Iterating over a Stack Stack:");
        for(Integer element : stack2) {
            System.out.println(element);
        }

        // https://stackoverflow.com/questions/12524826/why-should-i-use-deque-over-stack

    }
}
