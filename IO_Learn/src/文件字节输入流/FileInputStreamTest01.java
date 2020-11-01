package 文件字节输入流;
/*
    import java.io.InputStream;
        java.io.FileInputStream:文件字节输入流

        按照字节方式读取文字
        public int read()
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        //1.要想读取某文件，先给这个文件创造一个输入流；

        //文件路径
        String filePath = "IO_Learn\\test_1.txt";//相对路径，相对当前而言，在当前路径下找.
        //以下两行为绝对路径
        //String filePath ="C:\\Users\\15173\\IdeaProjects\\com.demons\\IO_Learn\\test_1.txt";
        //String filePath ="C:/Users/15173/IdeaProjects/com.demons/IO_Learn/test_1.txt";
        try {
             fis = new FileInputStream(filePath);

            //开始读
            int i1 = fis.read();//以字节方式读取
            int i2 = fis.read();//
            int i3 = fis.read();//
            int i4 = fis.read();//
            int i5 = fis.read();//
            int i6 = fis.read();//

            int i7 = fis.read();//

            System.out.println(i1);//97
            System.out.println(i2);//98
            System.out.println(i3);//99
            System.out.println(i4);//100
            System.out.println(i5);//101
            System.out.println(i6);//102
            System.out.println(i7);//-1，如果已经读取到文件的末尾，就会返回-1

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //为了保证流一定会释放，所以在finally语句块中执行
            if(fis!=null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
