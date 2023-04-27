package DynamicProgramming;

import java.util.Scanner;

public class stoneGame1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        boolean[] dp = new boolean[1001];

        dp[1] = true;
        dp[2] = false;
        dp[3] = true;

        for(int i = 4; i < dp.length; i++) {
            dp[i] = !dp[i - 3] || !dp[i - 1];
        }

        if(dp[N])
            System.out.println("SK");
        else
            System.out.println("CY");
    }

}
