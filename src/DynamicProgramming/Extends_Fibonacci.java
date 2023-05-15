package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Extends_Fibonacci {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        long[] dp = new long[Math.abs(n)+1];

        for(int i = 0; i < dp.length; i++) {
            if(i <= 1)
                dp[i] = i;
            else
                dp[i] = (dp[i-1] + dp[i-2]) % 1000000000;
        }

        if(n == 0){
            System.out.println(dp[n]);
            System.out.println(dp[n]);
        }
        else{
            System.out.println( n > 0 ? 1 : Math.abs(n) % 2 == 0 ? -1 : 1 );
            System.out.println(dp[Math.abs(n)]);
        }

    }
}
