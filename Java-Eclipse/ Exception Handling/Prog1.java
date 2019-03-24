import java.util.*;

class Prog1{

    public static void main(String[] args){
        System.out.print("Enter an Integer: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try{

            int a = Integer.parseInt(s);
            System.out.println("The square value is " + Math.sqrt(a));
        }
        catch(NumberFormatException e){
            System.out.println("Entered input is not a valid format for an integer.");
        }
    }
}