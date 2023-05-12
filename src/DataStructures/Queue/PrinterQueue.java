package DataStructures.Queue;

import java.util.*;

public class PrinterQueue {
    public static int queuePrinter(int bufferSize, int capacities, int[] documents) {

        // 버퍼 큐 선언
        List<Integer> printQueue = new ArrayList<>();
        // 문서 큐 idx 1로 선언
        int idx = 1;
        int time = 1;

        // 버퍼 큐에 0 넣고 문서큐 첫번째 요소 넣기
        for(int i = 0; i < bufferSize - 1; i++) {
            printQueue.add(0);
        }

        printQueue.add(documents[0]);

        // 버퍼 큐가 비어있을 때 까지
        while(!printQueue.isEmpty()) {

            // 버퍼 큐.pop()
            printQueue.remove(0);
            time++;

            // idx가 문서 큐의 크기 보다 작을 때
            if(idx < documents.length) {
                // 버퍼 큐의 크기 구하기 // queue.stream().sum();
                int queueCapacity = printQueue.stream().mapToInt(n -> n).sum();
                // if 버퍼 큐의 크기가 capacity보다 클 때
                if(queueCapacity + documents[idx] > capacities) {
                    // 버퍼 큐.push(0);
                    printQueue.add(0);
                }
                // else 버퍼 큐.push(문서 큐[idx++]);
                else {
                    //버퍼 큐.push(문서 큐[idx++]);
                    printQueue.add(documents[idx++]);

                }
            }

        }
        return time;
    }
}