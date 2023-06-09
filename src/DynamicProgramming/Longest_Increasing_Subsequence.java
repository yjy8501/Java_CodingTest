package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import java.util.StringTokenizer;

public class Longest_Increasing_Subsequence {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 수열의 길이를 입력 받는다
        int N = Integer.parseInt(bf.readLine());
        // 수열을 입력받는다
        StringTokenizer st = new StringTokenizer(bf.readLine());
        // dp 배열을 선언해준다
        int[] dp = new int[N+1];
        int[] arr = new int[N+1];

        for(int i = 1; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i < dp.length; i++) {
            dp[i] = Math.max(dp[i], 1);
            // i보다 작은 값 중에 가장 큰 값
            for(int j = 0; j < i; j++) {
                if(arr[j] < arr[i] && dp[j] >= dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        System.out.println(Arrays.stream(dp).max().getAsInt());

    }
}


