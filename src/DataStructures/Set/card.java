package DataStructures.Set;

import java.util.*;

public class card {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long max = 0;
        long maxCard = 0;

        long N = sc.nextInt();

        HashMap<Long, Long> map = new HashMap<>();

        for(int i = 0; i < N; i++) {

            long card = sc.nextInt();

            if(map.containsKey(card)){
                map.put(card, map.get(card) + 1);
            }
            else {
                map.put(card, 1L);
            }

            if(map.get(card) > max) {
                max = map.get(card);
                maxCard = card;
            }
            else if(map.get(card) == max) {
                maxCard = Math.min(maxCard, card);
            }
        }
        System.out.println(maxCard);
    }
}
