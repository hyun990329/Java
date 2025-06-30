package ch01;
// 3항 연사자 처리 (?)
public class TernaryOpr {
    public static void main(String[] args) {

        int n1 = 15;
        // 조건 비교 ? 참일 때 : 거짓일 때 :
        // n1과 10을 비교 ?
        // 10보다 큰 값인지, 작은 값인지 출력

        String result;  // 두 수를 비교한 결과 값

        result = n1 > 10 ? "크다" : "작다";

        System.out.println(result);

        System.out.println("=============");
        // score 변수 생성 : 시험 점수 70
        // 점수가 60 이상이면 Pass, 아니면 Fail을 출력하도록 하시오

        int score = 70;    // 시험 점수
        result = score >= 60 ? "Pass" : "Fail";
        System.out.println(result);






    }
}
