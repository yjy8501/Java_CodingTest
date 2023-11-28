package Greedy;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // 문자열의 개수를 세어준다
        // 홀수 문자열이 2개 이상이면 불가
        // 짝수 문자열 빠른 순으로 출력, 홀수 문자 출력, 앞에 문자열 뒤집어서 출력

        Scanner sc = new Scanner(System.in);
        String middleStr = "";


        int[] count = new int[26];

        StringBuffer sb = new StringBuffer(sc.next());
        StringBuffer answer = new StringBuffer();

        for(int i = 0; i < sb.length(); i++) {
            count[sb.charAt(i) - 65]++;
        }

        for(int i = 0; i < count.length; i++) {
            char character = (char) (65 + i);
            if(count[i] % 2 != 0 && middleStr == "") {
                middleStr = String.valueOf(character);
            }
            else if (count[i] % 2 != 0) {
                answer = null;
                break;
            }
            answer.append((String.valueOf(character).repeat(count[i]/2)));
        }

        if(answer == null)
            System.out.println("I'm Sorry Hansoo");
        else {
            System.out.print(answer);
            System.out.print(middleStr);
            System.out.print(answer.reverse());
        }

    }
}
