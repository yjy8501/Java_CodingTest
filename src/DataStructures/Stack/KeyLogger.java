package DataStructures.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class KeyLogger {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());

        for(int i = 0; i < T; i++) {
            String[] line = bf.readLine().split("");
            StringBuilder sb = new StringBuilder();

            Stack<String> str = new Stack<>();
            Stack<String> store = new Stack<>();

            for (String s : line) {

                if (s.equals("<")) {
                    if (!str.isEmpty())
                        store.push(str.pop());
                } else if (s.equals(">")) {
                    if (!store.isEmpty())
                        str.push(store.pop());
                } else if (s.equals("-")) {
                    if (!str.isEmpty())
                        str.pop();
                } else {
                    str.push(s);
                }
            }

            while(!store.isEmpty())
                str.push(store.pop());

            while(!str.isEmpty())
                sb.append(str.pop());

            sb.reverse();

            System.out.println(sb);

        }
    }
}
