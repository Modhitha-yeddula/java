package CF_AL_One;
import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class Test{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);
       /* for(int i=0;i<=al.size();i++) {
            System.out.println(al.get(i));
        }*/
       /* int i=0;
        while(i<=al.size()-1){
            System.out.println(al.get(i));
        i++;
        }*/
        /*int i=0;
        do{
            System.out.println(i);
            i++;
        }
        while ((i<=al.size()-1));*/
        /*for(Integer num: al){
            System.out.println(al);
        }*/
        Iterator itr=al.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
    }
}