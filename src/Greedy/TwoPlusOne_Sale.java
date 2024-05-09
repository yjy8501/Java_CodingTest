package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class TwoPlusOne_Sale {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            list.add(Integer.parseInt(st.nextToken()));
        }

        list.sort(Collections.reverseOrder());

        int count = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            sum += num;
            count++;

            if(min > num)
                min = num;

            if(count >= 3) {
                sum -= min;
                min = Integer.MAX_VALUE;
                count = 0;
            }

        }

        System.out.print(sum);
    }
}
