package DynamicProgramming;

import java.util.Scanner;

public class sumOneTwoThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int c = 0; c < T; c++) {

            int n = sc.nextInt();

            int[] dp = new int[n+1];

            for(int i = 1; i < n + 1; i++) {

                if(i < 3) {
                    dp[i] = i;
                }
                else if(i == 3) {
                    dp[i] = 4;
                }
                else {
                    dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
                }
            }

            System.out.println(dp[n]);
        }
    }
}
