package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] sequence = new int[N];
        int[] countUp = new int[N];
        int[] countDown = new int[N];

        for(int i = 0; i < N; i++) {
            sequence[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {

            if(i == 0) {
                countUp[i] = 1;
                countDown[i] = 1;
                continue;
            }

            if(sequence[i] > sequence[i-1]) {
                countUp[i] = countUp[i-1] + 1;
                countDown[i] = 1;
            }
            else if(sequence[i] == sequence[i-1]) {
                countUp[i] = countUp[i-1] + 1;
                countDown[i] = countDown[i-1] + 1;
            }
            else {
                countDown[i] = countDown[i-1] + 1;
                countUp[i] = 1;
            }
        }

        System.out.println(Math.max(Arrays.stream(countUp).max().getAsInt(), Arrays.stream(countDown).max().getAsInt()));
    }
}
