package ex04;

class Account {
    // 입금 (입금할금액, 계좌잔액)
    int deposit(int amount, int money) { // 자판기눈으로보이는 값 매개변수 int amount, int money
        int restMoney = money + amount;
        return restMoney; // 메서드를 호출한 라인으로 값 반환 자판기 실제로나오는 거
    }

    // 출금(입금할금액, 계좌잔액)
    int withdrow(int amount, int money) {
        int restMoney = money - amount;
        return restMoney; // 실제값 리턴 반환해줄려면 void아니고 int withdrow 해줘야함

    }

    // 이체(보낼금액(amount),받는사람잔액(receivermoney),보내는사람잔액(sendermoney))
    // void transfer(int receivermoney, int sendermoney, int amount) {
    // int receivermoney = sendermoney - amount;
    // System.out.println("받는사람잔액:" + receivermoney);
    // System.out.println("보낸사람잔액:" + sendermoney);
    // }

}

public class Meth03 {
    public static void main(String[] args) {

        // 홍길동의잔액
        int hmoney = 1000;

        // 임꺽정의잔액
        int imoney = 1000;

        // 홍길동이 입금을 2번하고 출금한번하기
        Account haccount = new Account();
        hmoney = haccount.deposit(100, hmoney); // 리턴이되면 우변이 1100원으로바뀜 인수:100, money
        System.out.println("홍길동남은금액:" + hmoney);
        hmoney = haccount.deposit(500, hmoney);// 리턴이되면 우변이 1600원으로바뀜
        System.out.println("홍길동남은금액:" + hmoney);
        hmoney = haccount.withdrow(300, hmoney);// 리턴이되면 우변이 1300원으로바뀜
        System.out.println("홍길동남은금액:" + hmoney);

        // 임꺽정이 입금을1번(100원)하고, 출금2번 (300,500)하기
        Account iaccount = new Account();
        imoney = iaccount.deposit(100, imoney);
        System.out.println("임꺽정남은금액:" + imoney);
        imoney = iaccount.withdrow(300, imoney);
        System.out.println("임꺽정남은금액:" + imoney);
        imoney = iaccount.withdrow(500, imoney);
        System.out.println("임꺽정남은금액:" + imoney);

        // 이체하기

    }

}
