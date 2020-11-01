package 接口在开发中的作用;

/**
 * Created by 15173 on 2020/3/6.
 * 中国厨师
 *  实现菜单上的菜
 *  厨师是接口的实现者
 */
public class ChinaCooker implements FoodMenu {
    @Override
    public void shiZiChaoJiDan() {
        System.out.println("中国厨师做的柿子炒鸡蛋");
    }

    @Override
    public void yuXiangRouSi() {
        System.out.println("中国厨师做的鱼香肉丝");
    }
}
