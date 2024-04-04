package Binary_Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TreeSlice {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        long M = Integer.parseInt(st.nextToken());

        long[] trees = new long[N];
        long start = 1;
        long end = Long.MIN_VALUE;
        long mid = 0;
        long max = 0;

        st = new StringTokenizer(bf.readLine());

        for(int i = 0; i < trees.length; i++) {
            trees[i] = Long.parseLong(st.nextToken());
            if(trees[i] > end)
                end = trees[i];
        }

        while(start <= end) {
            mid = (start + end) / 2;
            long sum = 0;
            for(long tree : trees) {
                if(tree > mid)
                    sum += tree - mid;
            }


            if(sum >= M) {
                start = mid + 1;
                if(max < mid)
                    max = mid;
            }
            else
                end = mid - 1;
        }

        System.out.print(max);
    }
}
