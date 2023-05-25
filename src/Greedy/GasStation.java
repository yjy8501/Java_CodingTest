package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GasStation {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int[] distances = new int[N];
        int[] city = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine());

        for(int i = 0; i < N-1; i++) {
            distances[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(bf.readLine());

        for(int i = 0; i < N; i++) {
            city[i] = Integer.parseInt(st.nextToken());
        }

        // 거리의 마지막에 0을 넣어준다
        distances[distances.length - 1] = 0;

        // min에 현재를 넣고 시작
        int min = city[0];
        int distance = distances[0];
        // 총 가격
        int price = 0;

        // N만큼 반복
        for(int i = 1; i < N; i++) {
            // min 보다 작은 도시를 찾았을 때
            if(min > city[i]) {
                // price = min *  distance -> 지금까지 가장 싼 가격을 더해주고
                price += min * distance;
                // min = city[i] -> 가장 작은 값에 현재를 적용한다
                min = city[i];
                distance = distances[i];
            }
            // 아닐 경우 distance에 distance[i] 를 더해준다
            else {
                distance += distances[i];
            }

        }
        // 끝까지 다음으로 싼 가격을 찾지 못했을 경우

        price += min * distance;

        System.out.println(price);
    }
}
