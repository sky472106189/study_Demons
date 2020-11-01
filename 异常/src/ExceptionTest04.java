
public class ExceptionTest04 {
    public static void main(String[] args) throws ClassNotFoundException {
        //由于dosome方法会上抛错误,所以需要及时处理
        //处理方法:1.继续上抛;2.使用try catch进行捕捉
    /*    try {
            dosome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
        dosome();
    }

    /*
    dosome方法在声明时,使用了 throws ClassNotFoundException
    这个代码表示dosome方法在执行过程中,有可能会出现ClassNotFoundException异常
    叫做"类没找到"异常,这个异常的直接父类是:Exception,所以ClassNotFoundException属性编译时异常
    */
    public static void dosome() throws ClassNotFoundException{

    }
}
