package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Repairman {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] line = new int[1001];
        int[] spot = new int[N];
        int result = 0;

        st = new StringTokenizer(bf.readLine());

        for(int i = 0; i < spot.length; i++) {
            spot[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(spot);

        for(int i = 0; i < spot.length; i++) {
            if(line[spot[i]] == 1)
                continue;
            for(int j = 0; j < L; j++) {
                if(spot[i]+j <= 1000)
                    line[spot[i]+j] = 1;
            }
            result++;
        }

        System.out.print(result);
    }
}
