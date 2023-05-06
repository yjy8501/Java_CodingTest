package DataStructures.Stack;

import java.io.*;
import java.util.*;

public class Tops {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<int[]> tower = new Stack<>();

        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());

        for(int i = 1; i <= N; i++) {
            int height = Integer.parseInt(st.nextToken());

            while(!tower.empty()) {
                if(tower.peek()[0] > height) {
                    System.out.print(tower.peek()[1] + " ");
                    break;
                }
                tower.pop();
            }
            if(tower.isEmpty()) {
                System.out.print("0 ");
            }
            tower.push(new int[] {height, i});
        }
    }
}


//    int height = Integer.parseInt(st.nextToken());
//    int[] top = {height, i+1};
//
//            if(i == 0) {
//                    Tower.push(top);
//                    System.out.printf("%d ", i);
//                    }
//                    // 맨 앞이 height 보다 클 때
//                    else if(Tower.peek()[0] > top[0]) {
//                    System.out.printf("%d ", Tower.peek()[1]);
//                    Tower.push(top);
//                    }
//                    // 맨 앞이 height 보다 작을 때
//                    else if(Tower.peek()[0] < top[0]) {
//        while(!Tower.empty() && Tower.peek()[0] < top[0]) {
//        Tower.pop();
//        }
//        if(Tower.empty()) {
//        System.out.printf("%d ", 0);
//        Tower.push(top);
//        }
//        else {
//        System.out.printf("%d ", Tower.peek()[1]);
//        Tower.push(top);
//        }
//        }