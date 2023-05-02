package DataStructures.HashMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class fashionKing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++) {

            HashMap<String, Integer> hash = new HashMap<>();

            int t = sc.nextInt();
            sc.nextLine();

            for(int j = 0; j < t; j++) {

                String line = sc.nextLine();
                String[] clothes = line.split(" ");

                String clothe = clothes[clothes.length -1];

                if(!hash.containsKey(clothe))
                    hash.put(clothe, 1);
                else
                    hash.put(clothe, hash.get(clothe) + 1);

            }

            int result = 1;

            Set<String> keys = hash.keySet();

            for(String key : keys) {
                result *= (hash.get(key) + 1);
            }

            System.out.println(result - 1);
        }
    }
}
