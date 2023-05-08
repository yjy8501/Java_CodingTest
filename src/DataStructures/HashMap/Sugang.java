package DataStructures.HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Sugang {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> hash = new LinkedHashSet<>();

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        for(int i = 0; i < L; i++) {
            String hakbun =  bf.readLine();

            if(hash.contains(hakbun)) {
                hash.remove(hakbun);
                hash.add(hakbun);
            }
            else {
                hash.add(hakbun);
            }
        }

        hash.stream().limit(K).forEach(System.out::println);
        //hash.stream().forEach(System.out::println);
    }
}
