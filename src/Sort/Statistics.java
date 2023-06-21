package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Statistics {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        TreeMap<Integer, Integer> hash = new TreeMap<>();
        int[] result = new int[4];

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(bf.readLine());

            list.add(num);

            if(!hash.containsKey(num))
                hash.put(num, 1);
            else
                hash.put(num, hash.get(num) + 1);
        }
        Collections.sort(list);
        result[0] = (int)Math.round(list.stream().mapToInt(n -> n).sum() / Double.valueOf(list.size()));
        result[1] = list.get(list.size()/2);
        // result[2];
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(hash.entrySet());

        entryList.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));
        if(entryList.size() > 1 && entryList.get(0).getValue() == entryList.get(1).getValue())
            result[2] = entryList.get(1).getKey();
        else
            result[2] = entryList.get(0).getKey();

        result[3] = list.get(list.size() - 1) - list.get(0);

        for(int element : result)
            System.out.println(element);
    }

}
