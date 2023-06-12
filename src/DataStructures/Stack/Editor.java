package DataStructures.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Editor {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();

        int M = Integer.parseInt(bf.readLine());
        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            left.add(String.valueOf(str.charAt(i)));
        }

        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            String commend = st.nextToken();

            switch (commend) {
                case "L":
                    // 왼쪽 요소를 오른쪽으로 넘겨준다
                    if (!left.isEmpty()) {
                        right.add(left.pop());
                    }

                    break;
                case "D":
                    if (!right.isEmpty()) {
                        left.add(right.pop());
                    }

                    break;
                case "B":
                    if (!left.isEmpty()) {
                        left.pop();
                    }
                    break;
                case "P":
                    String add = st.nextToken();
                    left.add(add);
                    break;
                default:
                    return;
            }
        }
        // 왼쪽 스택이랑 오른쪽 큐이랑 합쳐서 출력
        StringBuilder sb = new StringBuilder();

        while(!left.isEmpty())
            right.add(left.pop());
        while(!right.isEmpty())
            sb.append(right.pop());

        System.out.println(sb);
    }

}
