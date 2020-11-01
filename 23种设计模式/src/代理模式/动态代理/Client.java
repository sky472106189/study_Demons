package 代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
    客户
    动态代理

    Proxy.newProxyInstance(ClassLoader loader,
                           Class<?>[] interfaces,
                           InvocationHandler h)方法说明：
        1.ClassLoader loader:指定当前目标对象使用的类加载器。固定写法
        2.Class<?>[] interfaces:目标对象实现的接口类型，使用泛型确认方法类型
        3.InvocationHandler h:事件处理。执行目标对象方法时，会触发事件处理器的方法。
                              会把当前执行的目标对象方法作为参数传入。

*/
public class Client {
    public static void main(String[] args) {
        //被代理对象(生产厂)
        Factory factory = new Product();

        //代理对象(经销商)
        Factory ProxyProduct = (Factory) Proxy.newProxyInstance(factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理(经销商)联系被代理对象(厂家)");
                        Object returnValue  = method.invoke(factory,args);//invoke(两个参数，第一个是执行的目标对象方法，第二个是对象方法参数)
                        System.out.println("经销商拿到产品");
                        System.out.println("经销商出售产品");
                        return returnValue ;
                    }
                });

        //代理对象出售产品
        ProxyProduct.sale();
    }
}
