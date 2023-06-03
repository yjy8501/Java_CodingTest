package DataStructures.PriorityQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class ChristmasGift {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        int n = Integer.parseInt(bf.readLine());

        for(int i = 0; i < n; i++) {
            String line = bf.readLine();

            if(line.equals("0")) {
                if(queue.isEmpty())
                    System.out.println("-1");
                else
                    System.out.println(queue.poll());
            }
            else {
                StringTokenizer st = new StringTokenizer(line);
                st.nextToken();
                while(st.hasMoreTokens())
                    queue.add(Integer.parseInt(st.nextToken()));
            }
        }
    }
}
