package DynamicProgramming;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Tiling {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BigInteger[] dp = new BigInteger[250+1];

        for(int j = 0; j < dp.length; j++) {
            if(j < 2)
                dp[j] = new BigInteger("1");
            else {
                dp[j] = dp[j-1].add(dp[j-2].multiply(new BigInteger("2")));
            }
        }

        while(sc.hasNextInt()) {
            int n = sc.nextInt();

            System.out.println(dp[n]);
        }
    }
}
