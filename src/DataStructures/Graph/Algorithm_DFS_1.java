package DataStructures.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Algorithm_DFS_1 {
    static int cnt = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        int[] result = new int[N+1];

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i = 1; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }

         result = DFS(graph, result, R);

        for(int i = 1; i < result.length; i++) {
            sb.append(result[i]).append("\n");
        }
        System.out.print(sb);
    }

    public static int[] DFS(List<List<Integer>> graph, int[] result, int start) {
        result[start] = cnt;

        for(int i = 0; i < graph.get(start).size(); i++) {
            if(result[graph.get(start).get(i)] == 0) {
                cnt++;
                DFS(graph, result, graph.get(start).get(i));
            }
        }
        return result;
    }
}
