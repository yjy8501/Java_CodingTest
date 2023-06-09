package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Longest_Increasing_Subsequence {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 수열의 길이를 입력 받는다
        int N = Integer.parseInt(bf.readLine());
        // 수열을 입력받는다
        StringTokenizer st = new StringTokenizer(bf.readLine());
        // dp배열을 선언해준다
        int[] dp = new int[N+1];
        int[] max = new int[]{0, 0};


        for(int i = 1; i < dp.length; i++) {
            int num = Integer.parseInt(st.nextToken());

            // Max 보다 클 때 Max값 + 1
            if(num >= max[0]) {
                dp[i] = dp[max[1]] + 1;
                max[0] = num;
                max[1] = i;

            }
            // Max 보다 작을 때 자기 자신 값 또는 1
            else {
                dp[i] = Math.max(dp[i], 1);
            }
        }

        System.out.println(dp[N]);
    }
}


