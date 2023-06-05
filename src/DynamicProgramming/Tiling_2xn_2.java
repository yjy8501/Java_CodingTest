package DynamicProgramming;

import java.io.*;

public class Tiling_2xn_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        int[] dp = new int[n+1];

        for(int i = 0; i < dp.length; i++) {
            if(i < 2)
                dp[i] = 1;
            else
                dp[i] = (dp[i-1] + 2 * dp[i-2]) % 10007;
        }

        bw.write(String.valueOf(dp[n]));
        bw.flush();
        bw.close();
    }
}
