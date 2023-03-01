package leetCode;

import java.util.Stack;

public class Algorithms1MyQueue2 {
    private final Stack<Integer> stackMain = new Stack<>();
    private final Stack<Integer> stackReserve = new Stack<>();
    int front;

    public void push(int x) {
        if (stackMain.empty())
            front = x;
        stackMain.push(x);
    }

    public int pop() {
        if (stackReserve.isEmpty()) {
            while (!stackMain.isEmpty())
                stackReserve.push(stackMain.pop());
        }
        return stackReserve.pop();
    }

    public int peek() {
        if (!stackReserve.isEmpty()) {
            return stackReserve.peek();
        }
        return front;
    }

    public boolean empty() {
        return stackMain.isEmpty() && stackReserve.isEmpty();
    }
}
