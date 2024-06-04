package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NewRecruits {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(bf.readLine());
            int N = Integer.parseInt(st.nextToken());
            int result = 1;

            List<List<Integer>> list = new ArrayList<>();

            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(bf.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                list.add(Arrays.asList(a, b));
            }

            list.sort(Comparator.comparing(value -> value.get(0)));

            int criteria = list.get(0).get(1);
            for(int j = 1; j < list.size(); j++) {
                int b = list.get(j).get(1);

                if(b < criteria) {
                    criteria = b;
                    result++;
                }
            }

            System.out.println(result);
        }
    }
}