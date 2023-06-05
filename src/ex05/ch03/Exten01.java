package ex05.ch03;

class 지구인 {
    String name = "지구인";
}

class 아시아인 extends 지구인 {
    void speak() {/
        System.out.println("아시아어");
    }
}

class 한국인 extends 아시아인 {
    void speak() {
        System.out.println("한국어");
        // 부모가적은 speak 같은이름으로 재정의
        // 오버라이딩,무효화하다
        // 아시아인으로 포인트잡아도 무효화되서 한국어로뜸
        // 오버라이딩은 메서드에서만존재 변수x
    }
}

class 홍길동 extends 한국인 {
}

public class Exten01 {
    public static void main(String[] args) {
        아시아인 p1 = new 한국인(); // 타입이 메모리 공간에 위치를 가르킴
        p1.speak();
    }

}
