package ex01;

public class Var03 {
    public static void main(String[] args) {
        //업캐스팅
        int n1 = 10;
        double d1 = n1; //변수의선언 double d1 = n1 이렇게 선언도할수잇음 더블이 더 크기때문에 넣을수잇음 =묵시적형변환
        System.out.println(d1);
      
        //다운캐스팅,명시적형변환
        double d2= 10.5;
        //int n2 = d2;// 더블이 더커서 매치가안됨
        double n2= (int)d2;
        System.out.println(n2);
        //문자형변환(아스키코드)
        int ch =65;
        System.out.println(ch);
    }
}
