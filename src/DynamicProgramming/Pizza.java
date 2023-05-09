package DynamicProgramming;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] dp = new int[n+1];

        dp[1] = 0;

        for(int i  = 2; i <= n; i++) {
            if(i % 2 == 0)
                dp[i] = 2 * dp[i/2] +  (i / 2) * (i / 2);
            else {
                dp[i] = dp[i/2 + 1] + dp[i/2] + ((i/2 +1) * (i/2));
            }
        }

        System.out.println(dp[n]);
    }
}
