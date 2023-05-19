package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class NextSequence {

    public static ArrayList<String> check(String[] arr) {

        ArrayList<String> list = new ArrayList<>();
        boolean[] visited = new boolean[arr.length];

        list = sequences(arr, visited, new String[]{}, list, arr.length);

        return list;
    }

    public static ArrayList<String> sequences(String[] arr, boolean[] visited, String[] sequence, ArrayList<String> list, int count) {
        // count = 0 이면 리스트에 추가 후 리턴
        if(count == 0) {
            String str = "";
            // 문자열 배열 안에 요소를 문자열로 반환
            for(int i = 0; i < sequence.length; i++) {
                if(i == sequence.length - 1)
                    str += sequence[i];
                else
                    str += sequence[i] + " ";
            }
            list.add(str);
        }


        // 카드의 숫자만큼 반복한다
            for(int i = 0; i < arr.length; i++) {
                // 방문 하지 않았을 시
                if(!visited[i]) {
                    //현재를 방문처리한다
                    visited[i] = true;
                    // 순열의 크기를 1 증가시킨 배열을 만든다
                    String[] newArr = Arrays.copyOf(sequence, sequence.length + 1);
                    // 순열에 현재의 숫자를 넣는다
                    newArr[newArr.length - 1] = arr[i];
                    list = sequences(arr, visited, newArr, list, count - 1);
                    // 현재를 미 방문 처리한다
                    visited[i] = false;
                }

            }
        return list;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        String sequence = bf.readLine();

        String[] str = new String[N];

        for(int i = 0; i < N; i++) {
            str[i] = String.valueOf(i+1);
        }

        ArrayList<String> list = check(str);

        int nextIdx = list.indexOf(sequence) + 1;

        if(nextIdx >= list.size())
            System.out.println("-1");
        else {
            System.out.println(list.get(nextIdx));
        }

        // 순열 구하기
        // 순열별로 리스트에 저장
        // 리스트에서 1 2 3 4의 값을 가지는 인덱스를 찾고 다음 인덱스를 출력한다
    }
}
