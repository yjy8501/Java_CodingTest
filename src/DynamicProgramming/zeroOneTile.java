package DynamicProgramming;

import java.util.Scanner;

public class zeroOneTile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long[] dp = new long[N+1];

        for(int i = 1; i <= N; i++) {
            if(i <= 2) {
                dp[i] = i;
                continue;
            }
            dp[i] = (dp[i-1] + dp[i-2]) % 15746;
        }
        System.out.println(dp[N]);
    }
}
