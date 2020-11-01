/**
 * Created by 15173 on 2020/5/18.
 */
public class Test01 {
    public class InnerOne{}

    public class InnerTwo{}

}
public class Class1{
    Test01 test01 = new Test01();
    InnerOne innerOne = new Test01.InnerOne();
}
