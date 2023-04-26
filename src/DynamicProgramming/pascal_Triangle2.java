package DynamicProgramming;

import java.util.Scanner;

public class pascal_Triangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int LIMIT = 30;

        int Row = sc.nextInt();
        int Col= sc.nextInt();
        int Wide = sc.nextInt();

        int[][] pascal = new int[LIMIT+1][];
        for(int i = 1; i <= LIMIT; i++) {
            pascal[i] = new int[i+1];
        }

        pascal[1][1] = 1;

        for(int row = 1; row <= LIMIT - 1; row++) {
            for(int col = 1; col <= row; col++) {
                pascal[row+1][col] += pascal[row][col];
                pascal[row+1][col+1] += pascal[row][col];
            }
        }

        int sum = 0;

        for(int row = 0; row < Wide; row++) {
            for(int col = 0; col <= row; col++) {
                sum += pascal[Row+row][Col+col];
            }
        }

        System.out.println(sum);
    }
}
