import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
    对异常的第一种方式处理:上抛
    谁调用我这个方法,我就抛给谁,抛给调用者处理.
*/
public class ExceptionTest05 {

    public static void main(String[] args) {
        System.out.println("main begin");
        try {
            m1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("main over");
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("异常.iml");
    }
}

