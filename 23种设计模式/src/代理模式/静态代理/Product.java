package 代理模式.静态代理;

/*
    生产出来的产品
*/
public class Product implements Factory {



    @Override
    public void sale() {
        System.out.println("工厂出售产品");
    }

}
