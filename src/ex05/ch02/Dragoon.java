package ex05.ch02;

public class Dragoon extends ProtossUnit {
    String name;
    int hp;
    int attack;

    public Dragoon(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public static void main(String[] args) {
        Dragoon z1 = new Dragoon("드라군1", 100, 5);
    }
}