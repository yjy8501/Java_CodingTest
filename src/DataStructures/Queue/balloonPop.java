package DataStructures.Queue;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class balloonPop {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> sequence = new ArrayList<>();

        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());

        for(int i = 1; i <= n; i++) {
            sequence.add(Arrays.asList(Integer.parseInt(st.nextToken()), i));
        }


        while(!sequence.isEmpty()) {
            List<Integer> step = sequence.remove(0);

            if(sequence.size() == 0) System.out.print(step.get(1));
            else System.out.print(step.get(1)+ " ");

            if(step.get(0) > 0) {
                Collections.rotate(sequence, -(step.get(0) - 1));
            }
            else {
                Collections.rotate(sequence, -(step.get(0)));
            }
        }
    }
}
