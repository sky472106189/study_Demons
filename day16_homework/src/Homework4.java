/**
 * Created by 15173 on 2020/3/5.
 *
 * 编写java程序模拟简单的计算器
 * 定义名为Nubmer的类其中两个整型数据成员n1和n2应声明为私有.
 * 编写构造方法赋予n1和n2初始值
 * 再为该类定义加addition(),减subtration(),乘multiplication(),除division()等公有实例方法
 * 分别对两个成员变量执行加,减,乘,除的运算
 */
public class Homework4 {
    public static void main(String[] args) {

        Number num1 = new Number(6,3);
        System.out.println(num1.addition());
        System.out.println(num1.subtration());
        System.out.println(num1.multiplication());
        num1.division();
    }
}

class Number{
    private int n1;
    private int n2;

    public Number() {
    }

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int addition(){
        return n1+n2;
    }

    public int subtration(){
        return n1-n2;
    }

    public int multiplication(){
        return n1*n2;
    }

    public void division(){
        if(n2==0){
            System.out.println("除数不能为0");
            return;
        }
        int result = n1/n2;
        System.out.println(result);
    }
}