package DataStructures.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConnectedComponentCount {

    // dfs에서는 인접한 모든 정점을 방문하고 visited[]를 true로 바꿔준다
    public static void dfs(int start, int[][]graph, boolean[] visited) {

        if(!visited[start]) {
            visited[start] = true;

            for(int i = 1; i < graph.length; i++) {
                if(graph[start][i] == 1) {
                    graph[start][i] = 0;
                    dfs(i, graph, visited);
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        // 정점의 개수
        int N = Integer.parseInt(st.nextToken());
        // 간선의 개수
        int M = Integer.parseInt(st.nextToken());

        //무방향 그래프를 입력받는다
        int[][] graph = new int[N+1][N+1];

        for(int i = 1; i <= N; i++) {
            graph[i][i] = 1;
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = 1;
            graph[b][a] = 1;


        }

        // visited[]배열을 선언한다
        boolean[] visited = new boolean[N+1];
        int count = 0;

        // 그래프를 순회하면서 방문하지 못한 곳을 만나면 count++를 해주고 dfs 실행
        for(int i = 1; i < graph.length; i++) {
            for(int j = 1; j < graph.length; j++) {
                if(graph[i][j] == 1){
                    count++;
                    dfs(i, graph, visited);
                }
            }
        }

        System.out.println(count);
    }
}
