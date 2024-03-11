package DataStructures.List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Fox_Say {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bf.readLine());

        for(int i = 0; i < t; i++) {
            String[] howling = bf.readLine().split(" ");
            HashMap<String, String> hashMap = new LinkedHashMap<>();
            while(true) {
                String line = bf.readLine();
                if(line.equals("what does the fox say?")) {
                    break;
                }
                else {
                    String[] animals = line.replace(" ","").split("goes");
                    hashMap.put(animals[1], animals[0]);
                }
            }

            for(int j = 0; j < howling.length; j++) {
                String howl = howling[j];
                if(!hashMap.containsKey(howl)) {
                    System.out.print(howl+" ");
                }
            }
        }
    }
}
