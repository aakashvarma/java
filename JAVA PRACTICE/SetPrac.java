import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

class SetPrac{
    public static void main(String[] args){
        HashSet<String> S1 = new HashSet<>();

        S1.add("Varma");
        S1.add("Aakash");
        S1.add("Nadimpalli");

        System.out.println(S1);

        TreeSet<String> S2 = new TreeSet<>(S1);

        System.out.println(S2);

        

    }
}