package collections.lab;

import net.mindview.util.Stack;

public class Lab15 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String schema = "+U+n+c--+e+r+t--+a-+i-+n+t+y--+-+r+u--+l+e+s--";
        char[] chars = schema.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == '+') {
                stack.push(chars[i+1]);
            }
            if(chars[i] == '-') {
                System.out.println(stack.pop());
            }
        }
    }
}
