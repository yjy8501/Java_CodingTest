package DataStructures.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class IronBar {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();

        boolean isLaser = false;
        int result = 0;

        Stack<Character> lines = new Stack<>();

        for(int i = 0; i < input.length(); i++) {
            char line = input.charAt(i);
            // 레이저 나오면
            if(line == ')' && isLaser) {
                lines.pop(); // 팝 하고
                result += lines.size();
                isLaser = false;
            }
            // 막대기 컷
            else if(line == ')') {
                lines.pop();
                result += 1;
            }
            else {
                // 일단 ( 추가
                lines.add(line);
                isLaser = true;
            }

        }
        System.out.print(result);
    }
}
