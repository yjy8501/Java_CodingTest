package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class maximunSubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int t = 0; t < T; t++) {
            int N = sc.nextInt();

            int[] dp = new int[N];
            int[] X = new int[N];

            for(int n = 0; n < N; n++) {
                X[n] = sc.nextInt();
            }

            dp[0] = X[0];

            for(int i = 1; i < N; i++) {
                dp[i] = Math.max(dp[i-1] + X[i], X[i]);
            }

            System.out.println(Arrays.stream(dp).max().getAsInt());

        }
    }
}
