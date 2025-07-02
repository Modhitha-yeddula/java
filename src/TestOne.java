package CF_AL_One;
import java.util.ArrayList;
public class TestOne{
    public static void main(String[] args){
        ArrayList<String> al=new ArrayList<>();
        al.add("Rajiv");
        al.add("Ram Babu");
        al.add("Ramesh");
        System.out.println(al);
        al.set(2,"Rakesh");
        System.out.println(al);

        System.out.println(al.get(0));
    }
}