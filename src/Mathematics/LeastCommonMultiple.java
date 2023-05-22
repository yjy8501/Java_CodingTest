package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LeastCommonMultiple {

    public static long GCD(long a, long b) {
        if(a % b == 0)
            return b;

        return GCD(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long gcd;

        StringTokenizer st = new StringTokenizer(bf.readLine());

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        if(a > b)
            gcd = GCD(a, b);
        else
            gcd = GCD(b, a);

        System.out.println(a*b/gcd);
    }
}
