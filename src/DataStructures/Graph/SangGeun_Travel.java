package DataStructures.Graph;

import java.util.*;

public class SangGeun_Travel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int countries = sc.nextInt();
            int airplanes = sc.nextInt();

            int[][] graph = new int[countries+1][countries+1];
            boolean[] visited = new boolean[countries+1];

            for(int j = 0; j < airplanes; j++) {
                int start = sc.nextInt();
                int end = sc.nextInt();

                graph[start][end] = 1;
                graph[end][start] = 1;
            }

            bfs(graph, 1, visited);
        }
    }

    private static void bfs(int[][] graph, int start, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        int result = 0;

        queue.add(start);

        while(!queue.isEmpty()) {
            int point = queue.poll();
            if(visited[point])
                continue;
            visited[point] = true;
            result++;

            for(int i = 1; i < graph.length; i++) {
                if(graph[point][i] == 1 && !visited[i]) {
                    queue.add(i);
                }
            }
        }

        System.out.println(result-1);
    }
}
