package 装饰者模式;


public class Test01 {
    public static void main(String[] args) {
        A b = new B();//继承的方式进行扩展,不推荐
        b.m1();
        System.out.println("===============================");
        //创造被装饰者
        FileReader fr = new FileReader();
        //创造装饰者
        BufferedReader br = new BufferedReader(fr);
        br.close();
    }
}
