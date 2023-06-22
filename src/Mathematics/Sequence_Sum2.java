package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sequence_Sum2 {
    public static void main(String[] args) throws IOException {
        // i는 0 j는 1로 시작
        // sum 초기값 sum = i + j
        // 만약 sum이 M보다 작으면 j++ sum += list[j]
        // 같으면 i++ j++ count++  sum = list[i] + list[j]
        // 크면 sum -= list[i] i++

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] sequence = new int[N+1];

        st = new StringTokenizer(bf.readLine());

        for(int i = 1; i <= N; i++) {
            sequence[i] = Integer.parseInt(st.nextToken());
        }

        int startPoint = 1;
        int endPoint = 1;
        int sum = 0;
        int count = 0;

        // sum보다 작으면 endPoint ++

        while(true) {
            if(sum >= M)
                sum -= sequence[startPoint++];
            else if(endPoint >= sequence.length)
                break;
            else
                sum += sequence[endPoint++];

            if(sum == M)
                count++;
        }

        System.out.println(count);
    }
}
