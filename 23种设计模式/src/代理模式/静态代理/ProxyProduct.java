package 代理模式.静态代理;

/*
    代理对象(经销商)
    静态代理方式
        使用时，需要定义接口或者父类，被代理对象（生产厂家）与代理对象（经销商）一起
        实现相同的接口或者是继承相同父类

        优点：在不修改原对象的功能前提下，能通过代理对象对目标功能扩展

        缺点：因为代理对象需要与目标对象实现一样的接口，所以会有很多代理类
        一旦接口增加方法，目标对象与代理对象都要维护
*/
public class ProxyProduct implements Factory{

    private Factory product;//目标对象，通过接口来聚合

    public ProxyProduct(Factory product) {
        this.product = product;
    }

    @Override
    public void sale() {
        product.sale();
        System.out.println("经销商拿到产品");
        System.out.println("经销商出售产品");
    }
}
