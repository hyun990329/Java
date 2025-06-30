package ch01;

public class ExchangeMoney {
    public static void main(String[] args) {

        // 2,680원을 1,000원, 500원, 100원, 50원, 10원
        // 각각 몇 개씩 최소로 필요한지 출력하시오
        // 금액 : 2,680원
        // 1,000원 : 2개
        // 500원 : 1개
        // 100원 : 1개
        // 50원 : 1개
        // 10원 : 3개

        int n1 = 2680;  // 원금
        int n2 = 1000;
        int n3 = 500;
        int n4 = 100;
        int n5 = 50;
        int n6 = 10;

        // 2680 / 1000
        int mo1 = n1 / n2;
        int na1 = n1 % n2;
        // 680 / 500
        int mo2 = na1 / n3;
        int na2 = na1 % n3;
        // 180 / 100
        int mo3 = na2 / n4;
        int na3 = na2 % n4;
        // 80 / 50
        int mo4 = na3 / n5;
        int na4 = na3 % n5;
        // 30 / 10
        int mo5 = na4 / n6;
        int na5 = 0;

        String g1 = "금액 : 2,680원";  // 액수
        String g2 = "1,000원 : ";
        String g3 = "500원 : ";
        String g4 = "100원 : ";
        String g5 = "50원 : ";
        String g6 = "10원 : ";
        String dog = "개";


        String r1 = g2 + mo1;   // 액수 + 결과 값
        String r2 = g3 + mo2;
        String r3 = g4 + mo3;
        String r4 = g5 + mo4;
        String r5 = g6 + mo5;

        System.out.println("============");
        System.out.println(g1);
        System.out.println(r1 + dog);
        System.out.println(r2 + dog);
        System.out.println(r3 + dog);
        System.out.println(r4 + dog);
        System.out.println(r5 + dog);
        System.out.println("============");


        // 선생님 답


//        System.out.println("원금 : " + coin);

//        System.out.println("1000원 개수 : " + (coin / 1000));
//        restCoin = coin % 1000;
//        System.out.println("500원 개수 : " + (restCoin / 500));
//        restCoin = restCoin % 500;
//        System.out.println("100원 개수 : " + (restCoin / 100));
//        restCoin = restCoin % 100;
//        System.out.println("50원 개수 : " + (restCoin / 50));
//        restCoin = restCoin % 50;
//        System.out.println("10원 개수 : " + (restCoin / 10));
//        restCoin = restCoin % 10;
//
//        //System.out.println("잔액 : " + restCoin);



        // 함수를 써서 더 간단하게
        // 잔액을 출력하는 함수

        int coin = 2680;
        int restCoin = coin;


        System.out.println("============");
        restCoin = restCoinPrint(restCoin, 1000);
        restCoin = restCoinPrint(restCoin, 500);
        restCoin = restCoinPrint(restCoin, 100);
        restCoin = restCoinPrint(restCoin, 50);
        restCoin = restCoinPrint(restCoin, 10);

    }
        static int restCoinPrint(int restCoin, int don) {
            System.out.println(don + "원 개수 : " + (restCoin / don));
            restCoin = restCoin % don;
            System.out.println("잔액 : " + restCoin);
            return restCoin;
    }
}







