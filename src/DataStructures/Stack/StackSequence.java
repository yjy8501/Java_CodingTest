package DataStructures.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        Stack<Integer> stack = new Stack<>();
        int count = 1;
        StringBuilder sb = new StringBuilder();

        loop:
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(bf.readLine());

            while(true) {
                // 빈배열 일 때는 무조건 값을 넣는다
                if(stack.isEmpty()) {
                    stack.push(count++);
                    sb.append("+\n");
                    continue;
                }

                // peek 가 num보다 작으면 count++ push
                if(stack.peek() < num) {
                    stack.push(count++);
                    sb.append("+\n");
                }
                // peek 가 numq보다 크면 NO
                else if(stack.peek() > num) {
                    sb = new StringBuilder();
                    break loop;
                }
                // peek 가 num일 때 pop
                else {
                    stack.pop();
                    sb.append("-\n");
                    break;
                }
            }

        }

        if(sb.length() == 0)
            System.out.println("NO");
        else
            System.out.print(sb);
    }
}
