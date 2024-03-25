package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AtoB {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        long count = 1;

        String A = st.nextToken();
        String B = st.nextToken();

        while(B.length() > 0) {
            long long_B = Long.parseLong(B);
            if(A.equals(B)) {
                System.out.print(count);
                return;
            }
            else if(long_B % 2 == 0) {
                count++;
                B = String.valueOf(long_B/2);
            }
            else {
                if(B.charAt(B.length()-1) != '1')
                    break;
                B = B.substring(0, B.length()-1);
                count++;
            }
        }

        System.out.print("-1");
    }
}
