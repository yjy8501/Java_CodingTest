package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreamPasta {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        String[] num = bf.readLine().split(" ");
        int[] dp = new int[N];
        int min = 0;
        StringBuilder sb = new StringBuilder();


        // 들어온 값이 최솟값보다 작을 때 min = 0, dp[i] = dp[i-1]
        // 아닐 때 들어온 값을 최솟값이랑 뺀거랑 전갑시랑 비교해서 더 큰 수를 dp에 저장
        for(int i = 0; i < num.length; i++) {
            int number = Integer.parseInt(num[i]);

            if(i == 0) {
                dp[i] = i;
                sb.append(i + " ");
                min = number;
                continue;
            }

            if(number < min) {
                min = number;
                dp[i] = dp[i-1];
                sb.append(dp[i] + " ");

            }
            else {
                dp[i] = Math.max(dp[i-1], number - min);
                sb.append(dp[i] + " ");
            }
        }

        System.out.println(sb);
    }
}
