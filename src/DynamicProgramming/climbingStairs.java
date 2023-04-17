package DynamicProgramming;

import java.util.Scanner;

public class climbingStairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] stairs = new int[n + 1];

        for(int i = 1; i < n + 1; i++) {
            int stair = sc.nextInt();
            stairs[i] = stair;

        }

        int[] dp = new int[n + 1];

        for(int i = 1; i < n + 1; i++) {

            if(i == 1){
                dp[i] = stairs[i];
            }

            else if(i == 2) {
                dp[i] = stairs[i-1] + stairs[i];
            }
            else if (i == 3) {
                dp[i] = Math.max(stairs[1], stairs[2]) + stairs[i];
            }
            else {
                dp[i] = Math.max(dp[i-2], dp[i-3] + stairs[i-1]) + stairs[i];
            }

        }

        System.out.println(dp[n]);

    }

}
