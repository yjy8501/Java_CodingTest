package DataStructures.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class goodWord {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        int T = Integer.parseInt(bf.readLine());

        for(int i = 0; i < T; i++) {

            String word = bf.readLine();

            Stack<Character> checkWord = new Stack<>();


            for(int j = 0; j < word.length(); j++) {
                if(checkWord.empty())
                    checkWord.push(word.charAt(j));
                else if(checkWord.peek().equals(word.charAt(j)))
                    checkWord.pop();
                else {
                    checkWord.push(word.charAt(j));
                }
            }

            if(checkWord.empty())
                count++;
        }

        System.out.println(count);
    }
}
