package DataStructures.Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Sieve_Of_Eratosthenes {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Set<Integer> set = new HashSet<>();
        for(int i = 2; i <=N; i++) {
            set.add(i);
        }
        int count = 0;
        int i = 2;

        loop:
        while(!set.isEmpty()) {
            for(int j = 1; j*i <=N; j++) {
                int num = j*i;

                if(set.contains(num)) {
                    set.remove(num);
                    count++;
                    if(count == K) {
                        System.out.println(num);
                        break loop;
                    }

                }
            }
            i++;
        }
    }
}
