package Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/*
    hashCode()+equals() 简单示范
*/
public class HashMapTest03 {
    public static void main(String[] args) {
        Map<Human,Integer> map = new HashMap<>();
        Human p1 = new Human(1,"苹果");
        Human p2 = new Human(2,"山梨");
        Human p3 = new Human(3,"杏仁");
        Human p4 = new Human(1,"桃子");

        map.put(p1,20);
        map.put(p2,20);
        map.put(p3,20);
        map.put(p4,20);
        System.out.println(map.size());
    }
}
class Human{
    private int id;
    private String name;

    //普通人以编号(id)为唯一标识符
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null||!(obj instanceof Human)) return false;
        if(obj==this)return true;
        Human p = (Human) obj;
        return (this.id==p.getId());
    }

    public Human() {
    }

    public Human(int id, String name) {

        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}