package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quit_Job {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int[] dp = new int[N+15];
        int[] T = new int[N+15];
        int[] P = new int[N+15];
        int max = 0;

        for(int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i <= N; i++) {
            if(i+T[i] <= N+1) {
                dp[i] = Math.max(dp[i], max);

                dp[i+T[i]] = Math.max(dp[i+T[i]], P[i]+dp[i]);

                max = Math.max(max, dp[i]);
            }
        }
        System.out.println(max);
    }
}
