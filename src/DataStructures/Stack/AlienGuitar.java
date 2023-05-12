package DataStructures.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class AlienGuitar {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int count = 0;

        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        Stack<Integer>[] guitar = new Stack[P+1];

        for(int i = 1; i <= P; i++) {
            guitar[i] = new Stack<>();
        }

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());

            int melody = Integer.parseInt(st.nextToken());
            int pNum = Integer.parseInt(st.nextToken());

            if(!guitar[melody].isEmpty()) {
                if (guitar[melody].peek() >= pNum) {
                    while (guitar[melody].peek() > pNum) {
                        guitar[melody].pop();
                        count++;
                        if (guitar[melody].isEmpty())
                            break;
                    }
                    if(!guitar[melody].isEmpty() && guitar[melody].peek() == pNum)
                        continue;
                }
            }
            guitar[melody].push(pNum);
            count++;


        }

        System.out.println(count);
    }
}
