package ch02;

public class ForEx02 {
    public static void main(String[] args) {

        // 1부터 10 사이의 짝수의 합을 구하시오
        // for 구문을 사용합니다

        int sum = 0;
        for (int i = 0; i <= 10; i = i + 2) {
            sum += i;  //  sum = sum + i;
        }
        System.out.println(sum);


        // 다음에서 부족한 부분을 구현
        sum = 0;    // 초기화
        for (int i = 0; i < 11; i = i + 1) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);







    }
}
