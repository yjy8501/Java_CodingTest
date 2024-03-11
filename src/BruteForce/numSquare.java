package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] st = bf.readLine().split(" ");

        int N = Integer.parseInt(st[0]);
        int M = Integer.parseInt(st[1]);

        int result = 0;

        String[][] graph = new String[N][M];

        for(int i = 0; i < N; i++) {
            graph[i] = bf.readLine().split("");
        }

        // N과 M중에 작은 것을 기준으로 point+ 1,2,3, N or M까지
        for(int i = 1; i < (Math.min(N, M)); i++) {
            for(int x = 0; x + i < graph.length; x++) {
                for(int y = 0; y + i < graph[x].length; y++) {
                    if(graph[x][y].equals(graph[x+i][y]) &&
                       graph[x][y].equals(graph[x][y+i]) &&
                       graph[x][y].equals(graph[x+i][y+i])) {
                        result = (i+1) * (i+1);
                    }
                }
            }
        }
        if(result == 0)
            System.out.println(1);
        else
            System.out.println(result);
    }
}
