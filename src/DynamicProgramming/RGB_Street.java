package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RGB_Street {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[][] dp = new int[N+1][4];

        for(int i = 1; i < dp.length; i++) {
            st = new StringTokenizer(bf.readLine());
            for(int j = 1; j < dp[i].length; j++) {
                dp[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 2; i < dp.length; i++) {
            for(int j = 1; j < dp[i].length; j++) {
                if(j == 1) {
                    dp[i][j] += Math.min(dp[i-1][j+1], dp[i-1][j+2]);
                }
                else if(j == 2) {
                    dp[i][j] += Math.min(dp[i-1][j-1], dp[i-1][j+1]);
                }
                else {
                    dp[i][j] += Math.min(dp[i-1][j-1], dp[i-1][j-2]);
                }
            }
        }

        System.out.println(Arrays.stream(dp[N]).skip(1).min().getAsInt());
    }
}
