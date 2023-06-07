package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JumpJump {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] dp = new int[n+1];
        int[] list = new int[n+1];
        StringTokenizer st = new StringTokenizer(bf.readLine());

        for(int i = 1; i < list.length; i++) {
            list[i] = Integer.parseInt(st.nextToken());
            dp[i] = Integer.MAX_VALUE;
        }
        dp[1] = 0;

        // 현재 인덱스+1 ~ 현재 인덱스 + 현재 값 까지 현재 가장 작은 dp + 1
        for(int i = 1; i < list.length; i++) {
            if(dp[i] == Integer.MAX_VALUE) continue;
            for(int j = 1; j <= list[i]; j++) {
                if(i+j > n)
                    break;
                dp[i+j] = Math.min(dp[i+j], dp[i]+1);
            }
        }

        if(dp[n] == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(dp[n]);

    }
}
