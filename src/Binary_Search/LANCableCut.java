package Binary_Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LANCableCut {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        long start = 1;
        long end = Integer.MIN_VALUE;
        long max = Integer.MIN_VALUE;
        int[] list = new int[K];


        for(int i = 0; i < K; i++) {
            st = new StringTokenizer(bf.readLine());
            list[i] = Integer.parseInt(st.nextToken());
            if(end < list[i])
                end = list[i];
        }

        while(start <= end) {
            int count = 0;
            long mid = (start + end) / 2;

            for(int i = 0; i < list.length; i++) {
                count += list[i] / mid;
            }

            // 개수가 N과 같거나 더 많으면 길이를 더 늘린다
            if(count >= N) {
                if(max < mid)
                    max = mid;
                start = mid + 1;
            }
            // 개수가 N보다 작으면 길이를 더 짧게 만든다
            else
                end = mid - 1;
        }

        System.out.print(max);
    }
}
