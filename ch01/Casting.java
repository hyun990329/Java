package ch01;
// 형 변환
// Down Casting
// Up Casting

public class Casting {
    public static void main(String[] args) {

        int n1 = 100;   // 4Byte
        double d1 = n1; // 묵시적 Up Casting
        System.out.println(n1);
        System.out.println(d1);

        long longType = 100;    // 8Byte
        int inttYpe = (int) longType;   // 명시적 Down Casting






    }
}
