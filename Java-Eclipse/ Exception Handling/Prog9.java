import java.util.Scanner;

class Prog9{
    static int a, b;
    public static void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        a = sc.nextInt();
        System.out.print("Enter number 2: ");
        b = sc.nextInt();
    }
    public static float quotient(int a, int b){
        return a/b;
    }
    public static void main(String[] args){
        try{
            getData();
            System.out.println(quotient(a, b));
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Inside final block.");
        }
    }
}