package DataStructures.HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;

public class marathon {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> marathoners = new HashMap<>();

        int N = Integer.parseInt(bf.readLine());

        for(int i = 0; i < N; i++) {
            String name = bf.readLine();

            if(marathoners.containsKey(name))
                marathoners.put(name, marathoners.get(name) + 1);
            else {
                marathoners.put(name, 1);
            }
        }

        for(int i = 0; i < N-1; i++) {
            String name = bf.readLine();
            if(marathoners.get(name) - 1 == 0) {
                marathoners.remove(name);
                continue;
            }
            marathoners.put(name, marathoners.get(name) - 1);

        }

        Set<String> keys = marathoners.keySet();

        for(String key : keys) {
            System.out.println(key);
        }

    }
}
