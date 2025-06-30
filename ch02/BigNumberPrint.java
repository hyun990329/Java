package ch02;

import java.util.Scanner;

public class BigNumberPrint {
    public static void main(String[] args) {

        // 두 수를 차례로 입력 받습니다
        // 1. 그 중 큰 수를 출력하시오
        // First : 20, Second : 40
        // 큰 수 : 40
        // 2. 입력 받은 두 수를 바꾸어서 출력하시오
        // First : 20, Second : 40
        // 두 수를 바꾼 결과는?
        // First : 40, Second : 20

        Scanner sc = new Scanner(System.in);    // 스캐너

        int temp;   // 빈 칸 할당

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        int second = sc.nextInt();

        System.out.println();

        if (first > second) {
            System.out.println("큰 수 :" + first);
        } else {
            System.out.println("큰 수 : " + second);
        }
        System.out.print("입력하신 두 수는? ");
        System.out.println("First : " + first + ", Second : " + second);

       temp = first;
       first = second;
       second = temp;

        System.out.print("두 수를 바꾼 결과는? ");
        System.out.println("First : " + first + ", Second : " + second);






        // 선생님 답
//
//        Scanner sc1 = new Scanner(System.in);    // 스캐너
//        System.out.print("첫 번째 수를 입력하세요 : ");
//        int n1 = sc.nextInt();
//        System.out.print("두 번째 수를 입력하세요 : ");
//        int n2 = sc.nextInt();
//        System.out.println();
//        System.out.print("입력하신 두 수는 : ");
//        System.out.println("First : " + n1 + ", Second : " + n2);
//        if (n1 > n2) {
//            System.out.println("큰 수 : " + n1);
//        } else {
//            System.out.println("큰 수 : " + n2);
//        }
//        int temp1 = n1;
//        n1 = n2;
//        n2 = temp1;
//        System.out.println();
//        System.out.print("두 수를 바꾼 결과는?");
//        System.out.println("First : " + n1 + ", Second : " + n2);

        System.out.print("성적을 입력하세요 : ");
        int score = sc.nextInt();
        String grade = "";
        // 성적 처리
        if (score >= 90) {
            grade = "수";
        } else if (score >= 80) {
            grade = "우";
        } else if (score >= 70) {
            grade = "미";
        } else if (score >= 60) {
            grade = "양";
        } else {
            grade = "가";
        }
        System.out.println("당신의 성적은 : " + grade);
        }
    }
