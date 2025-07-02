import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();  // allows mixed types

        System.out.println(al);
        al.add(10);          // Integer
        al.add(10);          // Integer
        al.add("Rahul");     // String
        al.add(45000.45);    // Double
        System.out.println(al);
        al.set(2,"mouni");
        System.out.println(al);
    }
}
