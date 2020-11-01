
public class CustomerService {
    public boolean login(String username,String password){
        if (username.equals("zs")&&("123").equals(password)){
            return true;
        }
        return false;
    }

    public void logout(){
        System.out.println("已退出系统!");
    }
}
