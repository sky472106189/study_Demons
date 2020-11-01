import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test01{
    public static void main(String[] args) {
        Map hashmap = new HashMap();
        Set hashset = new HashSet();
        A a1 = new A(1);
        A a2 = new A(4);
        A a3 = new A(8);

        hashset.add(a1);
        hashset.add(a2);
        hashset.add(a3);
        System.out.println(hashset.size());

    }

}

class A{
    private int id;

    public A(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        A a = (A) o;

        return id == a.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
