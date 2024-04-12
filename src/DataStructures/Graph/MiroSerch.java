package DataStructures.Graph;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class MiroSerch {
    static int N;
    static int M;
    static char[][] miro;
    static int[][] distance;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        miro = new char[N+1][M+1];
        distance = new int[N+1][M+1];

        for(int i = 1; i <= N; i++) {
            String line = bf.readLine();
            for(int j = 1; j <=M; j++) {
                miro[i][j] = line.charAt(j-1);
            }
        }
        BFS(1, 1);
        System.out.print(distance[N][M]);
    }

    public static void BFS(int start, int end) {
        Queue<Point> queue = new LinkedList<>();

        queue.add(new Point(start,end));
        distance[start][end] = 1;

        while(!queue.isEmpty()) {
            Point point = queue.poll();
            miro[point.x][point.y] = 0;

            if(point.x-1 > 0) {
                if(miro[point.x-1][point.y] == '1') {
                    queue.offer(new Point(point.x-1, point.y));
                    distance[point.x-1][point.y] = distance[point.x][point.y] + 1;
                }
            }
            if(point.x+1 <= N) {
                if(miro[point.x+1][point.y] == '1') {
                    queue.offer(new Point(point.x+1, point.y));
                    distance[point.x+1][point.y] = distance[point.x][point.y] + 1;
                }
            }
            if(point.y-1 > 0) {
                if(miro[point.x][point.y-1] == '1') {
                    queue.offer(new Point(point.x, point.y-1));
                    distance[point.x][point.y-1] = distance[point.x][point.y] + 1;
                }
            }
            if(point.y+1 <= M) {
                if(miro[point.x][point.y+1] == '1') {
                    queue.offer(new Point(point.x, point.y+1));
                    distance[point.x][point.y+1] = distance[point.x][point.y] + 1;
                }
            }
        }
    }
}
