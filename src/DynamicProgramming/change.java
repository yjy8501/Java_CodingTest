package DynamicProgramming;

import java.util.Scanner;

public class change {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] dp = new int[100001];

        dp[1] = -1;
        dp[2] = 1;
        dp[3] = -1;
        dp[4] = 2;
        dp[5] = 1;

        for(int i = 6; i < dp.length; i++) {
            if(i-5 == 1 || i-5 == 3) {
                dp[i] = dp[i-2] + 1;
            }
            else
                dp[i] = Math.min(dp[i-2] + 1, dp[i-5] + 1);
        }

        System.out.println(dp[n]);
    }
}
