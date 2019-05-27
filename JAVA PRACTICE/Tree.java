import java.util.*;

class Tree{
    public static void main(String[] args){
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);

        Set set = map.entrySet();

        System.out.println(set);

        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry m = (Map.Entry)it.next();
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        map.remove("one");
        System.out.println(map.get("one"));

        System.out.println(map);
    }
}