package Mathematics;

import java.util.ArrayList;

public class GDC_pepero {
    public static ArrayList<Integer[]> divideChocolateStick(int M, int N) {

        ArrayList<Integer[]> result = new ArrayList<>();
        int small = Math.min(M, N);

        // GDC(2부터 작은 숫자까지 나눠서 둘다 0이 되면 공약수)를 이용해 공약수들을 구한다
        for(int i = 1; i <= small; i++) {
            if(M % i == 0 && N % i == 0) {
                // 구한 공약수와 M과 N을 나눠 나누어주는 빼빼로 숫자를 구한다
                Integer[] commonDivisor = new Integer[3];

                commonDivisor[0] = i;
                commonDivisor[1] = M / i;
                commonDivisor[2] = N / i;

                result.add(commonDivisor);
            }
        }

        return result;
    }


    public static void main(String[] args) {

        int M = 4;
        int N = 8;
        ArrayList<Integer[]> output = divideChocolateStick(M, N);
        for(Integer[] divisor : output) {
            for(Integer element : divisor) {
                System.out.print(element+" ");
            }
            System.out.println();
        }
        // [[1, 4, 8], [2, 2, 4], [4, 1, 2]]

    }
}
