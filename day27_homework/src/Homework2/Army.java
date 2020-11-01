package Homework2;


/*
    军队
*/
public class Army {
    private Weapon[] weapons;

    public Army(){}

    public Army(int count){
        weapons = new Weapon[count];
    }

    public void addWeapon(Weapon weapon) throws WeaponIndexOutOfBoundException {
        for(int i = 0 ;i < weapons.length;i++){
            if(weapons[i]==null){
                weapons[i] = weapon;
                return;
            }
        }
        //程序执行到此处,说明武器没有添加成功
        throw new WeaponIndexOutOfBoundException("武器库已满");

    }

    public void attackAll(){
        for(int i = 0; i<weapons.length;i++){
            if(weapons[i] instanceof Attackable) {
                Attackable attackWeapon = (Attackable) weapons[i];
                attackWeapon.attack();
            }
        }
    }

    public void moveAll(){
   /*   这是我的错误写法,会报空指针异常,原因很简单,数组初始化后,没有数据的默认值是null.
        扫描到第一个数据有,读取到坦克在移动,而第二个为null,所以报错了.
        用这个方法想要执行成功,除非全部装满了
        for(int i = 0; i<weapons.length;i++){
            weapons[i].move();
        }*/

        for(int i = 0; i<weapons.length;i++){
            if(weapons[i] instanceof Moveable) {
                Moveable moveWeapon = (Moveable) weapons[i];
                moveWeapon.move();
            }
        }
    }
}
