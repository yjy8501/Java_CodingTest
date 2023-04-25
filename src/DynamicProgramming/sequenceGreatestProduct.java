package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class sequenceGreatestProduct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double[] dp = new double[N];

        for(int i = 0; i < N; i++) {
            double num = sc.nextDouble();

            if(i == 0) {
                dp[i] = num;
                continue;
            }

            dp[i] = Math.max(dp[i-1] * num, num);
        }

        System.out.printf("%.3f%n",Arrays.stream(dp).max().getAsDouble());
    }
}
