package 装饰者模式;
/*
    使用BufferedRedaer对FileReader中的close()方法进行扩展
*/
//1.装饰者模式中要求,装饰者类中含有被装饰者的引用
//2.装饰者模式中要求,装饰者和被装饰者应该实现同一个类型.
public class BufferedReader extends Reader{ //装饰者
    //关联关系 has a
    Reader reader;                       //被装饰

    //构造方法
    BufferedReader(Reader reader){ //别理解错了,Reader是抽象类没错,不能new出来,但是这个只是传值,后面调用方法是不能用Reader抽象类的
                                   //但是可以用Reader抽象类的子类 new FileReader.
        this.reader = reader;
    }

    //对FileReader中的方法进行扩展
    public void close(){
        //扩展
        System.out.println("扩展代码1");
        reader.close();
        System.out.println("扩展代码2");
    }

}
