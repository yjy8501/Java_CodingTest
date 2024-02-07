package DataStructures.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class GomGomEmoji {
    public static void main(String[] args) {
        // enter 이후로 나오는 문자열을 해쉬에 저장하면서 존재하지 않으면 ++ 존재하면 넘어가기
        // enter가 나오면 해쉬를 초기화해준다
        Scanner sc = new Scanner(System.in);
        HashMap<String, Boolean> chat = new HashMap<>();
        int gomgomCount = 0;

        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            String str = sc.next();

            if(str.equals("ENTER")) {
                //해쉬 초기화
                chat.clear();
            }
            else {
                // 인사를 안했을 경우
                if(!chat.containsKey(str)) {
                    gomgomCount++;
                    chat.put(str, true);
                }
                // 인사를 했을 경우
                else {
                }
            }
        }
        System.out.println(gomgomCount);
    }
}
