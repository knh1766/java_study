package ex04;

class Cal01 {
    void add() {
        System.out.println("add 호출됨");
    }

    void minus() {
        System.out.println("minus 호출됨");
    }

    void multi() {
        System.out.println("multi 호출됨");
    }

    void divide() {
        System.out.println("divide 호출됨");
    }

}

public class Meth01 {
    public static void main(String[] args) {
        Cal01 c1 = new Cal01();
        // c1.객체연결연산자
        c1.add(); // 호출할려면 괄호있어야함
        c1.minus();
        c1.multi();
        c1.divide();

        Cal01 c2 = new Cal01();
        // c1.객체연결연산자
        c2.add();
        c2.minus();
        c2.multi();
        c2.divide();

    }
}