package 作业;


/**
 * Created by 15173 on 2020/3/7.
 * 编写程序,使用一维数组,模拟栈数据结构.
 *  要求:
 *      1.这个栈可以存储java中的任何引用类型的数据.
 *      2.在栈中提供push方法模拟压栈.(栈满了,要有提示信息)
 *      3.在栈中提供pop方法模拟弹栈.(栈空了,要有提示信息)
 *      4.编写测试程序,new栈对象,调用push pop方法来模拟压栈弹栈的动作.
 *
 *      public class MyStack{//栈类
 *
 *          //提供一个数组来存储栈中的元素
 *          Object[] elements;
 *
 *          //栈帧(永远指向栈顶元素)
*           //每加1个元素,栈帧+1
 *          //每减1个元素,栈帧-1
 *          int index;
 *
 *          //构造方法
 *
 *          //push方法(压栈)
 *          //压栈表示栈中多一个元素.
 *          //但是栈如果已满,压栈失败.
 *          //这个方法的参数以及返回值类型自己定义
 *
 *          //pop方法(弹栈)
 *          //弹栈表示栈中哨一个元素.
 *          //如果栈已空,弹栈失败.
 *          //方法参数,返回值自己定义
 *
 *      }
 *
 *      main(){
 *          测试...
 *      }
 */


//不太完美,弹栈只是移动了栈帧
public class Stack {
    public static void main(String[] args) {
        MyStack m1 = new MyStack(new Object[5]);
        m1.push("123");
        m1.push("224");
        m1.push("224");
        m1.push("224");
        m1.push("224");
        m1.pop();
        m1.pop();
        m1.pop();
        m1.pop();
        m1.pop();
}
}
//栈类,后入先出
class MyStack{
    Object[] element;
    int index = 0;

    MyStack(Object[] element){
        this.element = element;
    }

    //压栈
    public void push(Object obj){
        if(index != element.length){
            //执行压栈
            element[index] = obj;
            index++;
        }else{
        System.out.println("栈已满,无法压栈");
        }
    }

    //弹栈
    public void pop(){
        if(index !=0){
            //执行弹栈
            index--;
        }else {
            System.out.println("栈为空,无法弹栈");
        }
    }

}

