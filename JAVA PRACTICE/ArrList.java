import java.util.*;

class ArrList{
    public static void main(String[] args){
        HashMap<Integer, String> H1 = new HashMap<>();

        H1.put(2, "Aakash");
        H1.put(5, "Varma");
        H1.put(1, "Qwerty");
        H1.put(4, "Poiuyt");
        H1.put(3, "Asdfgh");

        System.out.println(H1);

        Set s = H1.entrySet();
        System.out.println(s);

        Iterator it = s.iterator();

        while(it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();
            System.out.println(me.getValue());
        }

        System.out.println("_______________");
        System.out.println(H1.remove(3));
        System.out.println(H1);

    }
}