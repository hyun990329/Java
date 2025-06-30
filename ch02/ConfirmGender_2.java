package ch02;

import java.util.Scanner;

public class ConfirmGender_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호 뒷 자리 첫 숫자를 입력하세요 : ");
        int num = sc.nextInt();
        String result;

        if (num < 1 || num > 5) {
            result = "잘 못 입력하셨습니다.";
        } else if (num == 5) {
            result = "외국인";
        } else if ((num % 2) == 1) {
            result = "남성";
        } else {
            result = "여성";
        }
        System.out.println(result);

    }
}
