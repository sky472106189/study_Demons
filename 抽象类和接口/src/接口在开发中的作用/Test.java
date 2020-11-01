package 接口在开发中的作用;

/**
 * Created by 15173 on 2020/3/6.
 */
public class Test {
    public static void main(String[] args) {

        //创建厨师对象
        //FoodMenu cooker1 = new ChinaCooker();
        FoodMenu cooker1 = new AmericaCooker();

        //创建顾客对象
        Customer c1 = new Customer(cooker1); //如果cooker不传递进去,会报空指针异常
                                            //因为c1.order()方法要用到FoodMenu接口

        //顾客点菜
        c1.order();
    }
}
