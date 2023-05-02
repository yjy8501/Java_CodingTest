package DataStructures.Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class symmetrySubtraction {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int countA = Integer.parseInt(st.nextToken());
        int countB = Integer.parseInt(st.nextToken());

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < countA; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < countB; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> copyA = new HashSet<>();

        for(Integer element : A) {
            copyA.add(element);
        }

        A.removeAll(B);
        B.removeAll(copyA);
        A.addAll(B);

        System.out.println(A.size());

    }
}
