import java.util.*;

class HashMapDemo{

    public static void main(String[] args){
        HashMap<String, Double> hm = new HashMap<String, Double>();

        hm.put("John Doe", new Double(3434.34));
        hm.put("Tom Smith", new Double(123.22));
        hm.put("Jane Baker", new Double(1378.00));
        hm.put("Tod Hall", new Double(99.22));
        hm.put("Ralph Smith", new Double(-19.08));

        Set set = hm.entrySet();

        Iterator i = set.iterator();

        while(i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            System.out.println(me.getKey() + ":" + me.getValue());
        }

        double balance = ((Double)hm.get("John Doe"));
        hm.put("John Doe", new Double(balance + 1000));
        System.out.println("John Doe's new balance: " + hm.get("John Doe"));

    }
}