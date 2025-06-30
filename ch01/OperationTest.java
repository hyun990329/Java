package ch01;

public class OperationTest {
    public static void main(String[] args) {

        int n1 = 3;
        int n2 = 4;

        int sum = n1 + n2;

        System.out.println(sum);

        String s1 = "반가워요 나의 나이는 ";
        String s2 = "살 이에요.";
        int age = 20;

        String result = s1 + age + s2;
        // + -> 연결 연산자
        System.out.println(result);
        // 반가워요 나의 나이는 20살 이에요.

        //
        // n1을 0으로 나눈 결과를 출력하시오
//        System.out.println(n1 / 0); -> Error


        // 비교 연산자
        // >, <, >=, <=, ==, !=
        // 논리 연산자
        // &&(and), ||(or), !(not)
        // 비교 판단을 위해 if 문법에서 주로 사용
        // 비교 연산과 논리 연산의 결과는 항상 논리 값이다
        boolean trueOrFalse;
        trueOrFalse = (1 == 2);
        System.out.println(trueOrFalse);

        trueOrFalse = (5 != 2);
        System.out.println(trueOrFalse);

        trueOrFalse = (5 >= 2);
        System.out.println(trueOrFalse);


        // x 라는 int 변수가 있다
        // x 가 1 ~ 10 사이의 값이면 true, 아니면 false를 출력
        // 1 <= x <= 10
        // x는 1보다 크거나 같고 and x는 10보다 작거나 같다
        int x = 9;
        trueOrFalse = (x >= 1 && x <= 10);
        System.out.println(trueOrFalse);

        trueOrFalse = (x >= 1 || x <= 10);
        System.out.println(trueOrFalse);

        System.out.println("==============");
        // 문자열 비교
        String grade = "VIP";
        String myGrade = "VIP";
        trueOrFalse = grade == myGrade;
        trueOrFalse = grade.equals("Normal");
        System.out.println(trueOrFalse);
    }
}
