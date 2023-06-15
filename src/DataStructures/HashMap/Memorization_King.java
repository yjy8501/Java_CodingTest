package DataStructures.HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Memorization_King {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());

        for(int i = 0; i < T; i++) {
            bf.readLine();

            HashMap<String, Integer> note1 = new HashMap<>();
            StringBuilder sb = new StringBuilder();

            StringTokenizer st = new StringTokenizer(bf.readLine());

            while(st.hasMoreTokens())
                note1.put(st.nextToken(), 1);

            bf.readLine();

            st = new StringTokenizer(bf.readLine());


            while(st.hasMoreTokens()) {
                String note2 = st.nextToken();

                if(note1.containsKey(note2))
                    sb.append(1).append("\n");
                else
                    sb.append(0).append("\n");
            }

            System.out.print(sb);
        }
    }
}
