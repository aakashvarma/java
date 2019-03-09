import java.lang.Math.*;

class Calculator{
    public static int powerInt(int num1, int num2){
        int power = 1;
        for(int i = 0; i < num2; i++){
            power = power * num1;
        }
        return power;
    }
    public static double powerDouble(double num1, double num2){
        return Math.pow(num1, num2);
    }
    public static void main(String[] args){
        System.out.println(powerInt(4, 2));
        System.out.println(powerDouble(4.0, 2.0));
    }
}