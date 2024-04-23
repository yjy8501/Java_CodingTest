package Sw_Expert_Academy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class View {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i = 1; i <= 10; i++) {
            int result = 0;
            int N = Integer.parseInt(bf.readLine());
            st = new StringTokenizer(bf.readLine());

            int[] building = new int[N];

            for(int j = 0; j < N; j++) {
                building[j] = Integer.parseInt(st.nextToken());
            }

            for(int j = 0; j < N; j++) {
                List<Integer> line = new ArrayList<>();
                int max;

                if(j == 0) {
                    line.add(building[j+1]);
                    line.add(building[j+2]);
                }
                else if(j == 1) {
                    line.add(building[j-1]);
                    line.add(building[j+1]);
                    line.add(building[j+2]);
                }
                else if(j == N-2) {
                    line.add(building[j-2]);
                    line.add(building[j-1]);
                    line.add(building[j+1]);
                }
                else if(j == N-1) {
                    line.add(building[j-2]);
                    line.add(building[j-1]);
                }
                else {
                    line.add(building[j-2]);
                    line.add(building[j-1]);
                    line.add(building[j+1]);
                    line.add(building[j+2]);
                }

                max = line.stream().mapToInt(Integer::intValue).max().getAsInt();

                if(max < building[j]) {
                    result += building[j] - max;
                }
            }
            System.out.println("#"+i+" "+result);
        }
    }
}
