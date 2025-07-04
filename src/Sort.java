import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Sort{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1000);
        al.add(10);
        al.add(100);
        al.add(1);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);

    }
}