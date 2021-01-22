
public class 局部变量Demo {
    //定义在方法的代码块中或者方法的参数列表中
    //a,b和c都是局部变量.
    public void doSome(int a){
        int b;
        while(true){
            int c;
        }
    }
}

//1.作用范围:
//    * 如果是定义在方法的参数列表中,那么在当前方法的任何位置都可以访问该局部变量
class Range1{
    public void test (int a){
        System.out.println(a);//能输出
        if (true){
            System.out.println(a);//能输出
        }
    }
}
//    * 如果是定义在方法中,那么就要看这个局部变量是"直接"位于哪一对大括号内
class Range2{
    public void test(){
        int a;
    {
        int b;
    }
    if(true) {
        int c;
    }
  }
}

//2.默认值:
//    局部变量是"没有"默认值的,我们只能显式的赋值之后才能使用该变量,否则会编译报错.
//    例如:
//编译通过
//  只定义了变量但是没有使用
class Default {
    public void test1() {
        int a;
        }

//编译报错
//  因为在使用局部变量之前没有赋值
/*    public void test2() {
        int a;
        System.out.println("a = " + a);
        }*/

//编译通过
    //只有在使用之前赋值就可以了
    //int a = 1;
    //当然声明的同时就赋值也是可以的
    public void test3() {
        int a;
        a = 1;
        System.out.println("a = " + a);
  }
}

//3.生命周期:
//        当方法被调用,代码执行到局部变量的声明这一刻开始,这个局部变量就出现了,
//        直到局部变量"直接"位于的大括号内中的代码执行结束的时候,该变量在内存中
//        也就释放消失了。
//例如:
class Life{
    //test4方法执行完,变量a就没有了
/*    public void test4(){
        int a;
        System.out.println(b);
        //这里是访问不到变量b的,编译报错
    }*/

    //if代码块执行完,变量b就没有了
    public void test5(int b){
        if(true){
            int c;
        }
    }

}

