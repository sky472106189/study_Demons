/*
方法覆盖时,重写之后的方法不能比重新给之前的方法抛出更多的异常,可以更少.
*/
public class ExceptionTest07 {
    public void doSome(){}

    public void doOther()throws Exception{}
}
class ExceptionForExtends extends ExceptionTest07{
/*
    编译报错
    public void doSome() throws Exception{}
*/

    //编译正常
/*
    public void doOther() {
    }
*/

    //编译正常
/*
    public void doOther() throws Exception{

    }
*/

    //编译正常
/*
    public void doOther() throws NullPointerException {

    }
*/

}
