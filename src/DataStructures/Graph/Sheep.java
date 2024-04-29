package DataStructures.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sheep {
    public static int[] listX = {0, 0, 1, -1};
    public static int[] listY = {1, -1, 0, 0};
    public static boolean visited[][];
    public static char[][] yard;
    public static int totalSheepCount = 0;
    public static int totalWolfCount = 0;
    public static int sheepCount;
    public static int wolfCount;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        yard = new char[x+1][y+1];
        visited = new boolean[x+1][y+1];

        for(int i = 1; i <= x; i++) {
            String line = bf.readLine();

            for(int j = 1; j <= y; j++) {
                yard[i][j] = line.charAt(j-1);
            }
        }

        for(int i = 1; i <= x; i++) {
            for(int j = 1; j <= y; j++) {
                sheepCount = 0;
                wolfCount = 0;
                DFS(i, j);
                if(sheepCount > wolfCount)
                    totalSheepCount += sheepCount;
                else
                    totalWolfCount += wolfCount;
            }
        }
        System.out.print(totalSheepCount+" "+totalWolfCount);
    }

    public static void DFS(int x, int y) {
        if(visited[x][y])
            return;

        visited[x][y] = true;

        if(yard[x][y] == '#')
            return;
        if(yard[x][y] == 'o')
            sheepCount++;
        if(yard[x][y] == 'v')
            wolfCount++;


        for(int i = 0; i < listX.length; i++) {
            int X = x + listX[i];
            int Y = y + listY[i];

            if(X > 0 && X < yard.length && Y > 0 && Y < yard[0].length) {
                DFS(X, Y);
            }
        }
    }
}
