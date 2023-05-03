package DataStructures.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class snackShare{
    public static void main(String[] args) {

        List<Integer> line = new ArrayList<>();
        List<Integer> sequence = new ArrayList<>();
        Stack<Integer> wait = new Stack<>();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int idx = 1;

        for(int i = 1; i <= N; i++) {
            int num = sc.nextInt();

            sequence.add(i);

            if(num == idx) {
                line.add(num);
                idx++;
            }
            else if (!wait.empty() && wait.peek() == idx) {
                while(!wait.empty() && wait.peek() == idx) {
                    line.add(wait.pop());
                    idx++;
                }
                wait.push(num);
            }
            else {
                    wait.push(num);
            }
        }

        while(!wait.empty()) {
            line.add(wait.pop());
        }

        if(sequence.equals(line))
            System.out.println("Nice");
        else
            System.out.println("Sad");
    }
}
