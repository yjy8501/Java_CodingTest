package Binary_Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Guitar_Lesson {
    public static int[] array;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        array = new int[N];

        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            sum += array[i];

            if(array[i] > max)
                max = array[i];
        }

        int result = bin(N, M, max, sum);

        System.out.print(result);

    }
    public static int bin(int N, int M, int low, int high) {
        int min = Integer.MAX_VALUE;

        while(low <= high) {
            int mid = (low+high) / 2;
            int sum = 0;
            int count = 1;
            // 배열을 순회해서 mid를 넘어가면 count++, sum 초기화
            for(int i = 0; i < N; i++) {
                if(sum + array[i] > mid) {
                    count++;
                    sum = array[i];
                }
                else
                    sum += array[i];
            }
            if(count <= M) {
                if(sum > mid) {
                    low = mid + 1;
                }
                else {
                    min = Math.min(min, mid);
                    high = mid - 1;
                }
            }
            else
                low = mid + 1;
        }

        return min;
    }
}
