package ex04;

class Box {
    int width; // 가로길기
    int length; // 세로길이
    int height; // 높이

    double getvoume() {
        return (double) width * length * height;
    }
}

public class BoxTest {
    public static void main(String[] args) {
        Box b;
        b = new Box();
        b.width = 20;
        b.length = 20;
        b.height = 30;
        System.out.println("상자의가로,세로,높이는" + b.width + b.length + "," + b.height + "입니다.");
        System.out.println("상자의부피는" + b.getvoume() + "입니다.");

    }

}
