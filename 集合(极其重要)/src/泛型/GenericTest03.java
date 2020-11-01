package 泛型;

/*
    自定义泛型
        自定义泛型的时候,<>尖括号中的一个标识符,随便写.
        java源代码中经常出现:
            <E>和<T>
        E是Element首字母
        T是Type首字母
*/
public class GenericTest03<标识符随便写> {
    public void dosome(标识符随便写 o){
        System.out.println(o);
    }

    public static void main(String[] args) {
        GenericTest03<String> gt = new GenericTest03<>();
        //gt.dosome(100); 类型不匹配 不行
        gt.dosome("你好");

        MyIterator<Boolean> mit = new MyIterator<>();
        boolean flag = mit.get();
    }

}
class MyIterator<不一定非得是这个>{
    public 不一定非得是这个 get(){
        return null;
    }
}