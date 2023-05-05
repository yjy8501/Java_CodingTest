package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class right_Triangle {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        while(true) {

            StringTokenizer st = new StringTokenizer(bf.readLine());
            List<Double> list = new ArrayList<>();

            while(st.hasMoreTokens()) {
                list.add(Double.parseDouble(st.nextToken()));
            }
            if(list.contains(0.0)) break;

            Collections.sort(list);

            list.replaceAll(a -> Math.pow(a, 2));


            if(list.get(0) + list.get(1) == list.get(2)) {
                System.out.println("right");
            }
            else{
                System.out.println("wrong");
            }
        }
    }
}