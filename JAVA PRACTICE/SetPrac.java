import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class SetPrac{
    public static void main(String[] args){
        HashSet<Integer> A = new HashSet<>();

        A.add(34);
        A.add(67);
        A.add(23);
        A.add(45);
        A.add(12);

        System.out.println(A);

        ArrayList<Integer> A1 = new ArrayList<>(A);
        Collections.sort(A1, Collections.reverseOrder());

        System.out.println(A1);
    }
}