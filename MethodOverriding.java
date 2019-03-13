class A{
    int a, b;
    A(int a, int b){
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println("a and b are: " + a + " " + b);
    }
    void show(){
        System.out.println("This is a test message.");
    }
}

class B extends A{
    int c;
    B(int m, int n, int o){
        super(m, n);
        c = o;
    }
    void display(){
        
        System.out.println("c is: " + c);
        super.display();
        super.show();
    }
}

class MethodOverriding{
    public static void main(String[] args){
        B obj = new B(12, 4, 67);
        obj.display();
    }
}