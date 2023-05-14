package DataStructures.List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class WordReverse {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        for(int i = 0; i < n; i++) {
            String[] line = bf.readLine().split(" ");
            List<String> list = new ArrayList<>(Arrays.asList(line));

            Collections.reverse(list);

            for(String element : list) {

            }

        }
    }
}
