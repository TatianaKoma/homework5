package leetCode;
import java.util.Stack;

public class MyQueue {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)

        System.out.println(myQueue.peek());// return 1
        System.out.println(myQueue.pop()); // return 1, queue is [2]
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());// return false
    }

    Stack<Integer> stackMain = new Stack<>();
    Stack<Integer> stackReserve = new Stack<>();

    public MyQueue() {
        stackMain = new Stack<>();
        stackReserve = new Stack<>();
    }

    public void push(int x) {
        stackMain.push(x);
    }

    public int pop() {
        copyStackOneToTwo(stackMain, stackReserve);
        int result = stackReserve.pop();
        copyStackOneToTwo(stackReserve, stackMain);
        return result;
    }

    public int peek() {
        copyStackOneToTwo(stackMain, stackReserve);
        int result = stackReserve.peek();
        copyStackOneToTwo(stackReserve, stackMain);
        return result;
    }

    public boolean empty() {
        return stackMain.empty();
    }

    private void copyStackOneToTwo(Stack<Integer> one, Stack<Integer> two) {
        while (!one.empty()) {
            two.push(one.pop());
        }
    }
}
