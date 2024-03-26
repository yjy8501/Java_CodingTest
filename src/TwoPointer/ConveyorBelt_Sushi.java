package TwoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ConveyorBelt_Sushi {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int max;

        List<Integer> belt = new ArrayList<>();
        HashMap<Integer, Integer> combo = new LinkedHashMap<>();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            belt.add(Integer.parseInt(st.nextToken()));
        }

        for(int i = 0; i < k; i++) {
            if(combo.containsKey(belt.get(i)))
                combo.put(belt.get(i), combo.get(belt.get(i))+1);
            else
                combo.put(belt.get(i), 1);
        }

        max = combo.size();

        if(!combo.containsKey(c))
            max +=1;

        for(int i = 1; i < belt.size(); i++) {
            int j = (i + k - 1) % N;

            combo.put(belt.get(i-1), combo.get(belt.get(i-1))-1);
            if(combo.get(belt.get(i-1)) == 0)
                combo.remove(belt.get(i-1));

            if(combo.containsKey(belt.get(j)))
                combo.put(belt.get(j), combo.get(belt.get(j))+1);
            else
                combo.put(belt.get(j), 1);

            if(max <= combo.size()) {
                max = combo.size();
                if(!combo.containsKey(c))
                    max += 1;
            }
        }

        System.out.print(max);
    }
}
