class Prog2{
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);

        System.out.println("Given number :" + a);
        System.out.println("Binary equivalent :" + Integer.toBinaryString(a));
        System.out.println("Octal equivalent :" + Integer.toOctalString(a));
        System.out.println("Hexadecimal equivalent :" + Integer.toHexString(a));
    }
}