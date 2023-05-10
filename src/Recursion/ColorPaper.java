package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ColorPaper {

    public static int blue = 0;
    public static int white = 0;
    public static int[][] board;

    public static  void paper(int row, int col, int size) {

        // 체크가 트루일 때
        if(check(row, col, size)) {
            // 첫번째 요소가 0 일 때
            if(board[row][col] == 0)
                white++;
            // 두번째 요소가 1 일 때
            else
                blue++;

            return;
        }

        // 사이즈를 나눈다
        size = size / 2;

        // 좌상단
        paper(row, col, size);
        // 우상단
        paper(row, col + size, size);
        // 좌하단
        paper(row + size, col, size);
        // 우하단
        paper(row + size, col + size, size);

    }

    public static boolean check(int row, int col, int size) {
        for(int i = row; i < row + size; i++) {
            for(int j = col; j < col + size; j++) {
                if(board[row][col] != board[i][j])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());


        board = new int[n][n];

        // 이차원 배열을 입력 받는다
        for(int i = 0; i < n; i++) {
            String line = bf.readLine();
            StringTokenizer st = new StringTokenizer(line);
            for(int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // parper함수에 넣는다
        paper(0, 0, n);

        System.out.println(white);
        System.out.println(blue);

    }
}


//for(int i = 0; i < n; i++) {
//        for(int j = 0; j < n; j++) {
//        System.out.print(board[i][j]+ " ");
//        }
//        System.out.println();
//        }