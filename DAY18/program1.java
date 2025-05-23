// public DSA
// https://leetcode.com/problems/implement-queue-using-stacks/description/
class MyQueue {
    Stack<Integer> stack;

    public MyQueue() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x); // Always push to the top
    }

    public int pop() {
        if (stack.isEmpty()) return -1;

        int x = stack.pop();

        if (stack.isEmpty()) {
            // This is the front of the queue
            return x;
        } else {
            int res = pop(); // Recursively get to the bottom
            stack.push(x);   // Put back the elements as we unwind
            return res;
        }
    }

    public int peek() {
        if (stack.isEmpty()) return -1;

        int x = stack.pop();

        if (stack.isEmpty()) {
            stack.push(x);
            return x;
        } else {
            int res = peek(); // Recursive to get front
            stack.push(x);
            return res;
        }
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
