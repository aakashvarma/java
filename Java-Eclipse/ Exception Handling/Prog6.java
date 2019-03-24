import java.util.*;
import java.lang.*;

class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}

class Prog6{
    public static int m1, m2, m3;
    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
    }
    public double average(int a, int b, int c) throws NumberFormatException, MyException{
        if(m1<0 || m2<0 || m3<0){
            throw new MyException("Negative number error.");
        }
        else return (a + b + c)/3;
    }
    
    public static void main(String[] args){
        Prog6 obj = new Prog6();
        obj.getData();
        try{
            System.out.println(obj.average(m1, m2, m3)); 
        }
        catch(NumberFormatException e){
            System.out.println("Number Format is wrong.");
        }
        catch(MyException e){
            System.out.println(e);
        }
    }
}