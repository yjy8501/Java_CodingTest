package DynamicProgramming;

import java.util.Scanner;

public class tail_Decoration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();

        long[] dp = new long[81];

        dp[1] = 4;
        dp[2] = 6;
        dp[3] = 10;

        for(int i = 4; i < dp.length; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(dp[n]);
    }
}
