package Greedy;

import java.util.Scanner;

public class Number_Sum {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        Long S = scanner.nextLong();

        Long sum = 0L;
        int count = 0;
        Long index = 1L;

        while(sum <= S) {
            sum += index++;
            count++;
            System.out.println(count);
        }

        System.out.print(count - 1);
    }
}
