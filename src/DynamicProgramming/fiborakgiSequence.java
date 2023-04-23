package DynamicProgramming;

import java.util.Scanner;

public class fiborakgiSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] dp = new long[n+1];

        for(int i = 1; i <= n; i++) {

            if(i <= 3) {
                dp[i] = 1;
                continue;
            }

            dp[i] = dp[i-1] + dp[i-3];
        }

        System.out.println(dp[n]);
    }
}
