import java.util.*;
public class ControlStmt{
    public static void main(String[] args) {
        List<Integer> num=new LinkedList<>();
        num.add(80);
        num.add(90);
        num.add(60);
        num.add(40);
        num.add(20);
        num.addFirst(1);
        num.addLast(100);
        Iterator itr=num.iterator();
        /*while(itr.hasNext()){
            System.out.println(itr.next());
        }*/
        /*for(int i=0;i<=num.size();i++){
            System.out.println(num.get(i));
        }*/
        /*int i=0;
        while(i<=num.size()-1){
            System.out.println(num.get(i));
        i++;
        }*/
        int i=0;
        do{
            System.out.println(num.get(i));
        i++;
        }
        while(i<=num.size()-1);
    }
}