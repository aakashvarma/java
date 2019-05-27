class A{
    int y = 10;
    public int display(){
        // System.out.println("Class A");
        // int x =10;
        return y;
    }
}

class B extends A{
    int y = 20;
    @Override
    public int display(){
        // System.out.println("Class B");
        // int x = 20;
        return y;

    }
}

class Practice{
    public static void main(String[] args){
        A ref;
        ref = new B();
        System.out.println(ref instanceof B);
        System.out.println(ref instanceof A);
    }
}