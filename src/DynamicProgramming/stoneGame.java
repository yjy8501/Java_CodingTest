package DynamicProgramming;

import java.util.Scanner;

public class stoneGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        boolean[] dp = new boolean[N];

        for(int i = 0; i < N; i++) {

            if(i == 0)
                dp[i] = true;
            else
                dp[i] = !dp[i-1];
        }
        if(dp[N-1])
            System.out.println("CY");
        else
            System.out.println("SK");
    }
}
