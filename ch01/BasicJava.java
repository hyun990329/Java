package ch01;
// 두 수를 바꾸는 작업

public class BasicJava {
    public static void main(String[] args) {
        // 두 수 a, b를 바꾸려면
        // 0. 바꾸기 전 a와 b를 출력해본다
        // 1. 빈 공간 (temp =  변수) 을 만든다
        // 2. a를 temp에 넣는다
        // 3. b를 a로 넣는다
        // 4. temp를 b에 넣는다
        // 5. 바꾼 a와 b를 출력해본다


        // a와 b 변수와 temp를 선언하고, 초기 값을 준다
        int a = 10;
        int b = 20;
        int temp;

        // 먼저 바꾸기 전 a와 b를 출력
        System.out.println("A = " + a + ", B = " + b);

        // 두 수 a와 b를 바꾸는 작업을 한다
        temp = a; // a 값을 temp에 할당 (= -> a를 temp에 넣는 명령어)
        a = b;
        b = temp;

        // 두 수를 바꾼 후 출력
        System.out.println("A = " + a + ", B = " + b);
    }
}
