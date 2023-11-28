package Greedy.Retry;

import java.util.*;
import java.util.stream.Collectors;

public class Treasure {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int answer = 0;

        sc.nextLine();
        String[] A = sc.nextLine().split(" ");
        String[] B = sc.nextLine().split(" ");


        List<Integer> sortedA = Arrays.stream(A).map(value -> Integer.parseInt(value)).sorted().collect(Collectors.toList());
        List<Integer> sortedB = Arrays.stream(B).map( value -> Integer.parseInt(value)).sorted(Collections.reverseOrder()).collect(Collectors.toList());

        for(int i = 0; i < N; i++) {
            answer += sortedA.get(i) * sortedB.get(i);
        }

        System.out.println(answer);
    }
}
