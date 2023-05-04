package DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Coin1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] dp = new int[k+1];

        dp[0] = 1;

        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            for(int j = num; j < dp.length; j++) {
                dp[j] += dp[j-num];
            }
        }

        System.out.println(dp[k]);
    }
}
