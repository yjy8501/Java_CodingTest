package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrefixSum5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =  new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] line = bf.readLine().split(" ");

        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);

        int[][] dp = new int[N+1][N+1];


        for(int x = 1; x <= N; x++) {
            int[] num = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int y = 1; y <= N; y++) {
                if(y == 1)
                    dp[x][y] = num[y-1];
                else
                    dp[x][y] = dp[x][y-1] + num[y-1];
            }
        }

        for(int i = 0; i < M; i++) {
            line = bf.readLine().split(" ");
            int result = 0;

            int x1 = Integer.parseInt(line[0]);
            int y1 = Integer.parseInt(line[1]);
            int x2 = Integer.parseInt(line[2]);
            int y2 = Integer.parseInt(line[3]);

            for(int j = x1; j <= x2; j++) {
                result += dp[j][y2] - dp[j][y1-1];
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
