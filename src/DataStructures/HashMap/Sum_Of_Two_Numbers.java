package DataStructures.HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Sum_Of_Two_Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int x = Integer.parseInt(bf.readLine());

        HashMap<Integer, Boolean> hash = new HashMap<>();
        ArrayList<Integer> pair = new ArrayList<>();

        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());

            hash.put(num, true);

            if (num <= x) {
                pair.add(x - num);
            }
        }

        int count = 0;

        for(int element : pair) {
            if(hash.containsKey(element)) {
                count++;
            }
        }

        System.out.println(count/2);
    }
}
