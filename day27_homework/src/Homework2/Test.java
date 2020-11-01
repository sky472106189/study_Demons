package Homework2;

public class Test {
    public static void main(String[] args) {
        Army army = new Army(10);
        try {
            army.addWeapon(new Tank());
            army.addWeapon(new Canno());
            army.attackAll();
            army.moveAll();
        } catch (WeaponIndexOutOfBoundException e) {
            e.printStackTrace();
        }
    }
}
