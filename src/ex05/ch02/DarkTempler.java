package ex05.ch02;

public class DarkTempler extends ProtossUnit {
    String name;
    int hp;
    int attack;

    public DarkTempler(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;

    }

    public static void main(String[] args) {
        DarkTempler dt1 = new DarkTempler("다크템플러1", 100, 10);
    }

}
