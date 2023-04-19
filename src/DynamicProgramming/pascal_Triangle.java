package DynamicProgramming;

import java.util.Scanner;

public class pascal_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] square = new int[n][n];

        for(int i = 0; i < n; i++) {
            square[0][i] = 1;
            square[i][0] = 1;
        }

        for(int i = 1; i < n; i++) {
            for(int j = 1; j < n; j++) {
                square[i][j] = square[i][j-1] + square[i-1][j];
            }
        }

        for(int i = 0; i < n; i++) {
            if(i == k - 1) {
                System.out.println(square[i][n - 1 - i]);
            }
        }
    }
}
