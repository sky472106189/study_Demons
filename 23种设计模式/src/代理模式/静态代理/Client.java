package 代理模式.静态代理;

public class Client {
    public static void main(String[] args) {
        //创建被代理对象（生产厂家）
        Factory factory = new Product();
        //创建代理对象（经销商）
        Factory proxy = new ProxyProduct(factory);

        //客户通过代理对象（经销商）购买产品
        proxy.sale();

    }
}
