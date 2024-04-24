package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class MeetingRoom {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int result = 0;
        int endTime = 0;

        int N = Integer.parseInt(bf.readLine());

        List<List<Integer>> times = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());

            List<Integer> time = new ArrayList<>();
            time.add(Integer.parseInt(st.nextToken()));
            time.add(Integer.parseInt(st.nextToken()));
            times.add(time);
        }

        Collections.sort(times, (o1, o2) -> {

            if(o1.get(1) == o2.get(1))
                return o1.get(0) - o2.get(0);

            return o1.get(1) - o2.get(1);
        });

        for(List<Integer> time : times) {
            if(time.get(0) >= endTime) {
                endTime = time.get(1);
                result++;
            }
        }

        System.out.print(result);
    }
}
