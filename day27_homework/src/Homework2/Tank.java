package Homework2;

/**
 * Created by 15173 on 2020/3/12.
 */
public class Tank extends Weapon implements Attackable,Moveable {
    @Override
    public void move() {
        System.out.println("坦克移动");
    }

    @Override
    public void attack() {
        System.out.println("坦克攻击");
    }
}
