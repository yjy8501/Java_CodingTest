package DataStructures.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FindParents {
    private static int[] visited;
    private static int[] parent;
    private static List<List<Integer>> graph;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();

        graph = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken());

        parent = new int[N+1];
        visited = new int[N+1];

        for(int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < N-1; i++) {
            st = new StringTokenizer(bf.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            graph.get(start).add(end);
            graph.get(end).add(start);
        }
        DFS(1);

        for(int i = 2; i < parent.length; i++) {
            sb.append(parent[i]).append("\n");
        }

        System.out.print(sb);
    }

    public static void DFS(int head) {
        visited[head] = 1;
        for(int i = 0; i < graph.get(head).size(); i++) {
            int child = graph.get(head).get(i);
            if(visited[child] == 0) {
                parent[child] = head;
                DFS(child);
            }
        }
    }
}
