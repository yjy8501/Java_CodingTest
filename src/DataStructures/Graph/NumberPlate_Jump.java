package DataStructures.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class NumberPlate_Jump {
    public static String[][] plate;
    public static HashMap<String, Boolean> hash = new LinkedHashMap<>();
    public static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        plate = new String[6][6];

        for(int i = 1; i < plate.length; i++) {
            st = new StringTokenizer(bf.readLine());
            for(int j = 1; j < plate.length; j++) {
                plate[i][j] = st.nextToken();
            }
        }

        for(int i = 1; i < plate.length; i++) {
            for(int j = 1; j < plate.length; j++) {
                DFS(i, j, "");
            }
        }

        System.out.print(count);
    }

    public static void DFS(int x, int y, String num) {
        if(num.length() >= 6) {
            if(!hash.containsKey(num)) {
                hash.put(num, true);
                count++;
            }

            return;
        }

        num += plate[x][y];

        if(x+1 < plate.length)
            DFS(x+1, y, num);
        if(x-1 > 0)
            DFS(x-1, y, num);
        if(y+1 < plate.length)
            DFS(x, y+1, num);
        if(y-1 > 0)
            DFS(x, y-1, num);
    }
}
