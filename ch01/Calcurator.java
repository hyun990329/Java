package ch01;

public class Calcurator {
    public static void main(String[] args) {

        // 두 수 a = 20, b = 5
        // 두 수를 더하고, 빼고, 곱하고, 나눈 결과를 각각 출력하기

        int a = 20;
        int b = 3;
        int temp;

        int add = a + b;
        int min = a - b;
        int multiply = a * b;
        double divide = (double) a / b;
        // up casting (형 상향 변환) 을 해줘야 함


        System.out.println("A + B = " + add);
        System.out.println("A - B = " + min);
        System.out.println("A * B = " + multiply);
        System.out.println("A / B = " + divide);

        // 나머지를 구하는 연산자 (%)
        // 7을 3으로 나눈 나머지의 몫을 구하시오

        int c = 7;
        int d = 3;

        int per = c % d;
        int divide2 =  c / d;
        String na = "나머지 " + per;
        String mo = ", 몫 " + divide2;

        System.out.println(na + mo);

    }
}
