package StackAndQueue;

import java.util.*;

class CorrectBracket {
    boolean Solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case '(':
                    stack.push(s.charAt(i));
                    break;

                case ')':
                    if (stack.isEmpty()) {
                        answer = false;
                        return answer;
                    }

                    stack.pop();
                    break;
            }
        }

        if (!stack.isEmpty()) {
            answer = false;
        }

        return answer;
    }
}
