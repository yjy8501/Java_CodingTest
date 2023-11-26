package Greedy;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Reverse {
    public static void main(String args[]) {
        // 연속된 문자열만큼 문자열을 자른다
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        StringTokenizer one = new StringTokenizer(s, "0");
        StringTokenizer zero = new StringTokenizer(s, "1");

        System.out.println(one.countTokens() >= zero.countTokens() ? zero.countTokens() : one.countTokens());


    }
}
