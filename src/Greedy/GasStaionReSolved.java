package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GasStaionReSolved {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bf.readLine());

        String[] betweenDistance = bf.readLine().split(" ");
        String[] gasPrice = bf.readLine().split(" ");


        long distance = Integer.parseInt(betweenDistance[0]);
        long minPrice = Integer.parseInt(gasPrice[0]);
        long total = 0;

        for(int i = 1; i < betweenDistance.length; i++) {
            if(minPrice > Integer.parseInt(gasPrice[i])) {
                total += minPrice * distance;
                minPrice = Integer.parseInt(gasPrice[i]);
                distance = Integer.parseInt(betweenDistance[i]);
            }
            else {
                distance += Integer.parseInt(betweenDistance[i]);
            }
        }
        total += minPrice * distance;
        System.out.println(total);
    }
}
