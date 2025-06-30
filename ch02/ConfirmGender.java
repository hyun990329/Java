package ch02;

import java.util.Scanner;

public class ConfirmGender {
    public static void main(String[] args) {

        // 주민번호 뒷 자리 첫 숫자를 입력하세요
        // 1 || 3 = 남성
        // 2 || 4 = 여성
        // 5 = 외국인

        Scanner sc = new Scanner(System.in);

        System.out.print("주민번호 뒷 자리 첫 수자를 입력하세요 : ");
        int n1 = sc.nextInt();

        if (n1 == 1 || n1 == 3) {
            System.out.println("당신은 남성");
        } else if (n1 == 2 || n1 == 4) {
            System.out.println("당신은 여성");
        } else if (n1 == 5) {
            System.out.println("당신은 외국인");
        }




        // 선생님 답
//
//        int num = sc.nextInt();
//        String result;
//
//        // 비교
//         System.out.print("주민번호 뒷 자리 첫 숫자를 입력하세요");
//        if (num == 1 || num == 3) {
//            result = "남";
//        } else if (num == 2 || num == 4) {
//            result = "여";
//        } else if (num == 5) {
//            result = "외국인";
//        } else {
//            result = "잘 못 입력하셨습니다.";
//        }
//           System.out.println(result);

    }
}


