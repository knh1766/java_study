import java.util.Scanner;

public class X1 {
    public static void main(String[] args) {
        int grade;

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를입력하시오");
        grade = sc.nextInt();
        if (grade >= 90)
            System.out.println("입력된정수는 짝수입니다.");
        else if (grade >= 80)
            System.out.println("학점B");
        else if (grade >= 70)
            System.out.println("학점C");
        else if (grade >= 60)
            System.out.println("학점D");
        else
            System.out.println("입력된 정수는 홀수입니다");
    }

}
