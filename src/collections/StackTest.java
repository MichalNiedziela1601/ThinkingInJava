package collections;

import net.mindview.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for(String s : "My dog has flees".split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.println(stack.pop() + " ");
        }
    }
}
