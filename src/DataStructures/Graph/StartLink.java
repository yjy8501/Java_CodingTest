package DataStructures.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class StartLink {
    public static int[] floors;
    public static int totalFloors;
    public static int nowFloor;
    public static int startLinkFloor;
    public static int up;
    public static int down;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

         totalFloors = Integer.parseInt(st.nextToken());
         nowFloor = Integer.parseInt(st.nextToken());
         startLinkFloor = Integer.parseInt(st.nextToken());
         up = Integer.parseInt(st.nextToken());
         down = Integer.parseInt(st.nextToken());

        floors = new int[totalFloors+1];

        BFS(nowFloor);

        System.out.print(floors[startLinkFloor] == 0 ? "use the stairs" : floors[startLinkFloor]-1);
    }

    public static void BFS(int startFloor) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startFloor);
        floors[startFloor] = 1;

        while(!queue.isEmpty()) {
            int floor = queue.poll();
            int downFloor = floor - down;
            int upFloor = floor + up;

            if(downFloor >= 1) {
                if(floors[downFloor] == 0) {
                    queue.add(downFloor);
                    floors[downFloor] = floors[floor] + 1;
                }
            }
            if(upFloor <= totalFloors) {
                if(floors[upFloor] == 0) {
                    queue.add(upFloor);
                    floors[upFloor] = floors[floor] + 1;
                }
            }
        }
    }
}
