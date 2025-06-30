package ch02;

import java.util.Scanner;

public class ThreeNumberTest_ans {
    static Scanner sc = new Scanner(System.in);
    // 위에 적은 스캐너를 공용으로 사용하기 위함
    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        System.out.println("세 수를 차례로 입력하세요");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        // a와 b를 비교해서 큰 수는 maxValue에, 작은 수는 minValue에 넣는다
        if (a > b) {
            maxValue = a;
            minValue = b;
        } else {
            maxValue = b;
            minValue = a;
        }
        // c가 maxValue 보다 크면 c를 maxValue에 넣고
        // c가 minValue 보다 작으면 c를 minValue에 넣는다
        if (c > maxValue) {
            maxValue = c;
        }
        if (c < minValue) {
            minValue = c;
        }
        System.out.println("Max : " + maxValue);
        System.out.println("Min : " + minValue);








    }
}
