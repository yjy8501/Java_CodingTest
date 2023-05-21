package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BABBA {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(bf.readLine());

        int[] dpA = new int[K+1];
        int[] dpB = new int[K+1];

        for(int i = 0; i <= K; i++) {
            if(i == 0) {
                dpA[i] = 1;
                dpB[i] = 0;
            }
            else if(i == 1) {
                dpA[i] = 0;
                dpB[i] = 1;
            }
            else {
                dpA[i] = dpA[i-1] + dpA[i-2];
                dpB[i] = dpB[i-1] + dpB[i-2];
            }

        }

        System.out.println(dpA[K]+" "+dpB[K]);
    }
}
