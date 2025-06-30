package ch02;

import java.util.Scanner;

public class ThreeNumberTest {
    public static void main(String[] args) {

        // 세 수를 차례로 입력 받는다
        // 가장 큰 수와 가장 작은 수를 출력한다


        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int n1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        int n2 = sc.nextInt();
        System.out.print("세 번째 숫자를 입력하세요 : ");
        int n3 = sc.nextInt();

        System.out.println();

        if (n1 > n2 && n1 > n3) {
            System.out.println("가장 큰 수는 : " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("가장 큰 수는 : " + n2);
        } else if (n3 > n1 && n3 > n2) {
            System.out.println("가장 큰 수는 : " + n3);
        }

        if (n1 < n2 && n1 < n3) {
            System.out.println("가장 작은 수는 : " + n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.println("가장 작은 수는 : " + n2);
        } else if (n3 < n1 && n3 <n2) {
            System.out.println("가장 작은 수는 : " + n3);
        }


    }
}
