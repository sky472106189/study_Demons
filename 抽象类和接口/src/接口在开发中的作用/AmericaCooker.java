package 接口在开发中的作用;

/**
 * Created by 15173 on 2020/3/6.
 * 美国厨师
 *  实现菜单上的菜
 *  厨师是接口的实现者
 */
public class AmericaCooker implements FoodMenu {
    @Override
    public void shiZiChaoJiDan() {
        System.out.println("美国厨师的柿子炒鸡蛋");
    }

    @Override
    public void yuXiangRouSi() {
        System.out.println("美国厨师的鱼香肉丝");
    }
}
