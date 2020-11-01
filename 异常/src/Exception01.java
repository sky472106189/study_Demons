/*
finally面试题
*/
public class Exception01 {
    public static void main(String[] args) {
        System.out.println(m());//100
    }

    public static int m(){
        int i = 100;
        try{
            return i;
        }finally {
            i++;
        }
    }
}
