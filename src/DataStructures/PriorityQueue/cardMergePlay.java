package DataStructures.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class cardMergePlay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 카드의 개수와 합체 횟수를 입력받는다
        int N = sc.nextInt();
        int M = sc.nextInt();


        // 우선순위 큐를 선언해서 카드의 숫자를 입력 받는다
        PriorityQueue<Long>  cards = new PriorityQueue<>();

        for(int i = 0; i < N; i++) {
            cards.add(sc.nextLong());
        }

        // 카드의 합체 횟수만큼 반복한다
        for(int i = 0; i < M; i++) {
            // 앞에 값 두개를 빼낸 후 더한 다음 두개 다 넣어준다
            long sum;
            sum = cards.poll() + cards.poll();

            cards.add(sum);
            cards.add(sum);

        }

        // 우선순위 큐 안에 모든 값을 더해 출력한다
        System.out.println(cards.stream().reduce(Long::sum).get());
    }
}
