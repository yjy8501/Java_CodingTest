package DataStructures.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Find_City {
    public static int[] visited;
    public static List<List<Integer>> graph = new ArrayList<>();
    public static List<Integer> result = new ArrayList<>();
    public static int N;
    public static int M;
    public static int K;
    public static int X;
    public static int[] distance;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        visited = new int[N+1];
        distance = new int[N+1];

        for(int i = 0; i < N+1; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            graph.get(start).add(end);
        }

        BFS();

        Collections.sort(result);
        StringBuilder sb = new StringBuilder();

        for(int element : result)
            sb.append(element).append("\n");

        System.out.print(sb.length() == 0 ? "-1" : sb);
    }

    public static void BFS() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(X);
        visited[X] = 1;

        while(!queue.isEmpty()) {
            int top = queue.poll();
            if(distance[top] == K)
                result.add(top);
            for(int i = 0; i < graph.get(top).size(); i++) {
                int value = graph.get(top).get(i);

                if(visited[value] != 1) {
                    distance[value] = distance[top] + 1;
                    queue.add(value);
                    visited[value] = 1;
                }
            }
        }
    }
}
