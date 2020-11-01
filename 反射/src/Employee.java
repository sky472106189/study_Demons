
public class Employee {
    //Field
    private String name;
    public String id;

    //Construct
    public Employee(){
        System.out.println("Employee的无参构造器启动");
    }

    public Employee(String name){
        this.name = name;
    }

    //Method
    public void work(){
        System.out.println(name+"在工作");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
