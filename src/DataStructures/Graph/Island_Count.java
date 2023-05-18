package DataStructures.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Island_Count {

    // 그래프와 좌표를 입력받아, 좌표 가로, 세로, 대각선에 인접한 1이 있는지 확인한다
    // 크기를 벗어나면 return 한다
    public static void checkIsland(String[][] graph, int row, int col) {

        // 좌표가 그래프의 크기를 넘어가면 종료한다
        if(row < 0 || row > graph.length - 1 || col < 0 || col > graph[row].length - 1)
            return;
        if(graph[row][col].equals("0"))
            return;

        // 현재 좌표 값을 0으로 바꾼다
        graph[row][col] = "0";

        //상
        checkIsland(graph, row - 1, col);
        //하
        checkIsland(graph, row + 1, col);
        //좌
        checkIsland(graph, row, col - 1);
        //우
        checkIsland(graph, row , col + 1);
        //좌상
        checkIsland(graph, row - 1, col - 1);
        //좌하
        checkIsland(graph, row + 1, col - 1);
        //우상
        checkIsland(graph, row - 1, col + 1);
        //우하
        checkIsland(graph, row + 1, col + 1);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while(true) {

            int count = 0;

            // 높이와 너비를 입력 받는다
            StringTokenizer st = new StringTokenizer(bf.readLine());

            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            // 0, 0 을 입력 받았을 시 종료한다
            if(w == 0 && h == 0)
                break;

            String[][] graph = new String[h][w];

            // 그래프를 입력 받는다

            for(int i = 0; i < h; i++) {
                graph[i] = bf.readLine().split(" ");
            }

            //그래프를 순회하면서 1인 곳에 countIsland()를 실행한다
            for(int row = 0; row < h; row++) {
                for(int col = 0; col < w; col++) {
                    if(graph[row][col].equals("1")) {
                        count++;
                        checkIsland(graph, row, col);
                    }

                }
            }

            System.out.println(count);
        }
    }
}
