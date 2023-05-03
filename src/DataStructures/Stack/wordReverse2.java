package DataStructures.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class wordReverse2 {

    public static void main(String[] args) throws IOException {

        // 문자열을 입력 받는다
        // < 일 경우 문자열을 반대로 출력하고
            // >가 나올 때 까지 그대로 출력
        // < 아닐 경우 스택에 문자열을 넣는다
        // 공백이 나오면 스택에 있는 문자를 모두 출력하고 공백을 출력한다

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> reverseWord = new Stack<>();
        boolean flag = false;

        String words = bf.readLine();

        for(int i = 0; i < words.length(); i++) {
            if(words.charAt(i) == '<') {
                reverse(reverseWord);
                flag = true;
            }

            if(flag) { // <가 나왔을 경우
                System.out.print(words.charAt(i));
                if(words.charAt(i) == '>') {
                    flag = false;
                }
            }
            else { // <가 없을 경우
                if(words.charAt(i) == ' ') {
                    reverse(reverseWord);
                    System.out.print(" ");
                }
                else {
                    reverseWord.push(words.charAt(i));
                }
            }

        }
        reverse(reverseWord);
    }

    private static void reverse(Stack<Character> reverseWord) {
       while(!reverseWord.empty()) {
           System.out.print(reverseWord.pop());
       }
    }
}
