import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class MyArray{
    public static void main(String[] args){
        ArrayList al=new ArrayList();
        Collection<String> unames=new ArrayList<>();

        unames.add("Rahul");
        unames.add("Sonia");
        List<String> enames=new ArrayList<>();
        enames.add("Priya");
        enames.add("Narendra Modhi");
        enames.add("Amith");
        Iterator itr=enames.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(enames.size());
        System.out.println(enames.isEmpty());
        System.out.println(enames.contains("Rajini"));
        System.out.println(enames.containsAll(unames));
        enames.set(0,"ram lakshaman");
        System.out.println(unames);
        System.out.println(enames);
        System.out.println(unames);
        enames.removeAll(unames);
        enames.clear();
        System.out.println(enames);

    }
}