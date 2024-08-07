package Sort;

// 그리디 알고리즘
// 가방에는 하나의 보석만 들어갈 수 있다.
// 일단 제일 비싼 보석을 앞으로
// 보석의 무게에 가장 가까운 가방을 빼야한다. -> 탐색 시간 듦
// 우선 순위 큐, 값 기준으로 정렬, pop 비교, pop 비교
// 해쉬는 안될듯?? 키가 중복됨

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class JewelThief {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long result = 0;

        List<List<Integer>> jewels = new ArrayList<>();
        List<Integer> bagWeights = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        int N = Integer.parseInt(st.nextToken()); // 보석의 개수
        int K = Integer.parseInt(st.nextToken()); // 가방의 개수

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int M = Integer.parseInt(st.nextToken()); // 보석의 무게
            int V = Integer.parseInt(st.nextToken()); // 보석의 가격

            jewels.add(List.of(V, M));
        }

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int C = Integer.parseInt(st.nextToken()); // 가방이 적재할 수 있는 무게

            bagWeights.add(C);
        }
        jewels.sort(Comparator.comparingInt((List<Integer> o) -> o.get(1)).thenComparing(Comparator.comparingInt((List<Integer> o) -> o.get(0)).reversed()));
        bagWeights.sort(Comparator.comparingInt(Integer::intValue));

        for(int i = 0, j = 0; i < K; i++){
            int bagWeight = bagWeights.get(i);
            while(j < N && jewels.get(j).get(1) <= bagWeight) {
                pq.offer(jewels.get(j++).get(0));
            }

            if(!pq.isEmpty())
                result += pq.poll();
        }

        System.out.println(result);
    }
}
