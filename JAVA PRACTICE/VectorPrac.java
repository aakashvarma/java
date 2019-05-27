import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

class VectorPrac{
    public static void main(String[] main){
        ArrayList<Integer> A = new ArrayList<>();
        Vector<Integer> V = new Vector<>();
        HashSet<Integer> S = new HashSet<>();

        V.add(56);
        V.add(12);
        V.add(34);
        V.add(26);
        V.add(34);
        V.add(26);

        System.out.println(V);

        A.addAll(V);

        System.out.println(A.remove(2));

        S.addAll(V);

        System.out.println(S);
    }
}