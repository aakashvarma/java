import java.util.*;

class Prog3{

    public void printAll(ArrayList<String> list){
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
     public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Prog3 obj = new Prog3();

        obj.printAll(list);
     }
 }