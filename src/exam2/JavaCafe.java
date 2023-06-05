package exam2;

public class JavaCafe {
    public static void main(String[] args) {
        printPay(10.00, 40);
        printPay(10.00, 50);
        printPay(7.50, 38);
        printPay(8.50, 66);
    }

    // 시급과 일한 시간을 입력받아, 주급을 출력
    public static void printPay(double basePay, int hours) {
        if (basePay < 8) {
            System.out.println("최저시급에러");
        }
        if (hours > 60) {
        }
        System.out.printf("$ %.2f\n", pay);
    }
}
