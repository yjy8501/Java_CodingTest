package DataStructures.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class Parenthesis {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> parentesis = new Stack<>();

        String lines = bf.readLine();

        char[] word = lines.toCharArray();

        for (char c : word) {
            if (!parentesis.isEmpty()) {
                if (c == ')' && parentesis.peek() == '(') {
                    parentesis.pop();
                    continue;
                }
            }

            parentesis.push(c);
        }

        System.out.print((long) parentesis.size());

    }
}
