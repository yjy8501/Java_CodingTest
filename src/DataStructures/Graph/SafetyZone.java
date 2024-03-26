package DataStructures.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SafetyZone {
    public static int[][] land;
    public static int[][] visited;
    public static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());

        // 1 ~ N 번 이차원 배열을 반복하면서 가장 안전지대가 많은 개수를 출력해야함
        land = new int[N+1][N+1];
        int maxCnt = 1;
        int max = Integer.MIN_VALUE;

        for(int i = 1; i <= N; i++) {
            st = new StringTokenizer(bf.readLine());
            for(int j = 1; j <= N; j++) {
                land[i][j] = Integer.parseInt(st.nextToken());
                if(max < land[i][j])
                    max = land[i][j];
            }
        }

        for(int i = 0; i < max; i++) {
            int count = 0;
            visited = new int[N+1][N+1];

            for(int x = 1; x <= N; x++) {
                for(int y = 1; y <= N; y++) {
                    int value = land[x][y];
                    if(visited[x][y] != 1 && value > i) {
                        count++;
                        DFS(x, y, i);
                    }
                }
            }
            if(count > maxCnt)
                maxCnt = count;
        }

        System.out.print(maxCnt);
    }
    public static void DFS(int x, int y, int high) {
        if(land[x][y] <= high)
            return;
        visited[x][y] = 1;

        if(x-1 >= 1 && visited[x-1][y] != 1)
            DFS(x-1, y, high);
        if(x+1 <= N && visited[x+1][y] != 1)
            DFS(x+1, y, high);
        if(y+1 <= N && visited[x][y+1] != 1)
            DFS(x, y+1, high);
        if(y-1 >= 1 && visited[x][y-1] != 1)
            DFS(x, y-1, high);
    }
}
