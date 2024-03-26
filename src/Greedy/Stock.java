package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Stock {
    public static void main(String[] args) throws IOException {
        // 반대로 돌아가야
        // 정순으로 가면 시간초과 나옴
        // 최댓값 * 주식수 - 투자금
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int T = Integer.parseInt(st.nextToken());

        for(int i = 0; i < T; i++) {
            Stack<Integer> queue = new Stack<>();
            bf.readLine();
            st = new StringTokenizer(bf.readLine());
            while (st.hasMoreTokens()) {
                queue.add(Integer.parseInt(st.nextToken()));
            }

            long max = Integer.MIN_VALUE;
            long stockCnt = 0;
            long invMoney = 0;
            long profit = 0;
            while(!queue.isEmpty()) {
                int value = queue.pop();
                if(max < value) {
                    profit += (max * stockCnt) - invMoney;
                    max = value;
                    stockCnt = 0;
                    invMoney = 0;
                }
                else {
                    stockCnt++;
                    invMoney += value;
                }
            }
            profit += (max * stockCnt) - invMoney;
            System.out.println(profit);
        }
    }
}
