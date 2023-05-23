package DataStructures.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DegreeCount {

    public static int dfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int start, int end, int count, boolean[] check) {
        if (start == end) {
            check[0] = true;
            return count;
        }

        if (!visited[start]) {
            ArrayList<Integer> children = graph.get(start);
            visited[start] = true;

            for (Integer element : children) {
                int result = dfs(graph, visited, element, end, count + 1, check);
                if (check[0])
                    return result;
            }
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
        // 촌수 배열을 생헝 한 후, 그래프 관계를 맺어 준 후 dfs를 실행해서 촌수를 센다
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        boolean[] visited = new boolean[n+1];
        boolean[] check = new boolean[1];

        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(bf.readLine());

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(bf.readLine());

            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());

            graph.get(parent).add(child);
            graph.get(child).add(parent);

        }

        int count = dfs(graph, visited, start, end, 0, check);

        System.out.println(count);

        for(ArrayList<Integer> list : graph) {
            System.out.println(list.toString());
        }
    }
}
