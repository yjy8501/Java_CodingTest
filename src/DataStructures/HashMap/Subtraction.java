package DataStructures.HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Subtraction {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        TreeMap<Integer, Integer> hashMap = new TreeMap<>();
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());

        while(st.hasMoreTokens())
            hashMap.put(Integer.parseInt(st.nextToken()), 1);

        st = new StringTokenizer(bf.readLine());

        for(int i = 0; i < b; i++) {
            int num = Integer.parseInt(st.nextToken());

            if(hashMap.containsKey(num)) {
                hashMap.remove(num);
            }
        }

        Set<Integer> keys = hashMap.keySet();

        int size = keys.size();

        if(size == 0) {
            System.out.println("0");
            return;
        }
        else
            System.out.println(size);

        for(Integer key : keys) {
           sb.append(key).append(" ");
        }

        System.out.println(sb);

    }
}
