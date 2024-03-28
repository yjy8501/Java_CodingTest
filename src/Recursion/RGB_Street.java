package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 시간초과
public class RGB_Street {
    public static int[][] street;
    public static int min = Integer.MAX_VALUE;
    public static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());

        street = new int[N][3];

        for(int i = 0; i < street.length; i++) {
            st = new StringTokenizer(bf.readLine());
            for(int j = 0; j < street[i].length; j++) {
                street[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < 3; i++) {
            DFS(0, i, 0);
        }

        System.out.print(min);
    }

    public static void DFS(int dept, int RGB, int sum) {
        sum += street[dept][RGB];

        if(dept >= N-1 ) {
            if(min > sum) {
                min = sum;
            }
            return;
        }

        for(int i = 0; i < 3; i++) {
            if(RGB != i) {
                DFS(dept+1, i, sum);
            }
        }
    }
}
