package DataStructures.HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OrganizeFile {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(bf.readLine());

        TreeMap<String, Integer> hash = new TreeMap<>();

        for(int i = 0; i < N; i++) {
            String[] line = bf.readLine().split("\\.");
            String extension = line[line.length-1];

            if(hash.containsKey(extension))
                hash.put(extension, hash.get(extension) + 1);
            else
                hash.put(extension, 1);
        }

        Set<String> keys = hash.keySet();

        for(String element : keys) {
            StringBuilder sb = new StringBuilder();
            sb.append(element).append(" ").append(hash.get(element));
            System.out.println(sb);
        }
    }
}
