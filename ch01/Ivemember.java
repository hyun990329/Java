package ch01;

// Class 변수

class Ivemember {

    // 아이브 멤버를 표현할 수 있는

    // Properties (Member) : 속성
    String name;
    int age;
    double height;

    // Method : 특정 작업을 수행하는 코드 블록
    void dance() {
        System.out.println();
    }
}

class jang {
    public static void main(String[] args) {
        Ivemember jang = new Ivemember(); // 인스턴스
        jang.name = "장원영";
        jang.age = 23;
        jang.height = 173.5;
        jang.dance();
        System.out.println(jang.name);
        System.out.println(jang.age);
        System.out.println(jang.height);
    }
}