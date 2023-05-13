package DataStructures.HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BestSeller {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        TreeMap<String, Integer> sold = new TreeMap<>();

        for(int i = 0; i < N; i++) {
            String book = bf.readLine();

            if(sold.containsKey(book)) {
                sold.put(book, sold.get(book) + 1);
            }
            else {
                sold.put(book, 1);
            }

        }

        List<String> keys = new ArrayList<>(sold.keySet());

//        System.out.println(sold.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());


        keys.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return  Integer.compare(sold.get(o2), sold.get(o1));
            }
        });

        System.out.println(keys.get(0));
    }
}
