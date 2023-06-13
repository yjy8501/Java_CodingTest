package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Antenna {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        while(st.hasMoreTokens())
            list.add(Integer.parseInt(st.nextToken()));

        Collections.sort(list);

        if(N % 2 == 0)
            System.out.println(list.get(list.size()/2 - 1));
        else
            System.out.println(list.get(list.size()/2));
    }
}
