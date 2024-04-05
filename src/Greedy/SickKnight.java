package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SickKnight {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());

        int count;

        if(height == 1) {
            count = 1;
        }
        else if(height == 2)
            count = Math.min(4, (width+1)/2);
        else if(width<7)
            count = Math.min(4, width);
        else
            count = width-2;

        System.out.print(count);
    }
}

