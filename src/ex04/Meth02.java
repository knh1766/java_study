package ex04;

class Cal02 {
    void add(int n1, int n2) // 매개변수
    {
        System.out.println("더하기:" + (n1 + n2));
    }// 스택을 종료하고,복귀주소를 확인하고 복귀한다.

    void minus(int n1, int n2) {
        System.out.println("빼기:" + (n1 - n2));
    }

    void multi(int n1, int n2) {
        System.out.println("곱하기:" + (n1 * n2));
    }

    void divide(int n1, int n2) {
        System.out.println("나누기:" + (n1 / n2));
    }

}

public class Meth02 {
    public static void main(String[] args) {
        Cal02 c1 = new Cal02();
        // c1.객체연결연산자
        c1.add(10, 5); // 인수
        c1.minus(10, 5);
        c1.multi(10, 5);
        c1.divide(10, 5);

    }
}
