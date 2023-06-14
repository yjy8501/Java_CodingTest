package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Rope {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> weights = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            list.add(Integer.parseInt(bf.readLine()));
        }

        list.sort(Collections.reverseOrder());

        for(int i = 0; i < N; i++) {
            int weight = list.get(i);
            weights.add(weight*(i+1));
        }

        System.out.println(weights.stream().max(Integer::compareTo).get());
    }
}
