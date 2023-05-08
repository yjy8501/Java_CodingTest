package DataStructures.HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FrequencySort {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, Integer> hash = new LinkedHashMap<>();

        bf.readLine();

        String[] line = bf.readLine().split(" ");

        for (String s : line) {

            if (!hash.containsKey(Integer.parseInt(s))) {
                hash.put(Integer.parseInt(s), 1);
            } else {
                hash.replace(Integer.parseInt(s), hash.get(Integer.parseInt(s)) + 1);
            }
        }

        List<Integer> keys = new ArrayList<>(hash.keySet());

        keys.sort((o1, o2) -> hash.get(o2).compareTo(hash.get(o1)));

        for(Integer key : keys) {
            for(int i = 0; i < hash.get(key); i++) {
                System.out.print(key + " ");
            }
        }
    }
}
