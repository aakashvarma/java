import java.lang.*; 
  
public class Wrapper { 
  
    public static void main(String[] args) 
    { 
        int a = 10;
        Integer ai = new Integer(a);

        String as = "1234";
        int asip = Integer.parseInt(as);
        int asiv = Integer.valueOf(as);

        String binary = Integer.toBinaryString(asip);
        int hex = Integer.valueOf(binary, 8);

        System.out.println(asiv);
        System.out.println(binary);
        System.out.println(hex);
    } 
} 
