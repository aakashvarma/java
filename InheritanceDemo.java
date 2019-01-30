class Calc{                 //Super, Parent, Base class
    public int add(int i, int j){
        return i+j;
    }
}

class CalcAdv extends Calc{ //Sub, Child, Derived class

    public int sub(int i, int j){
        return i-j;
    }
}

class CalcVeryAdv extends CalcAdv{ //Multilevel inheritance [NOTE: JAVA DOESNOT SUPPORT MULTIPLE INHERITANCE]
    public int mul(int i, int j){
        return i*j;
    }
}

public class InheritanceDemo{
    public static void main(String[] args){
        CalcVeryAdv c1 = new CalcVeryAdv();
        System.out.println(c1.add(3, 4));
        System.out.println(c1.sub(5, 2));
        System.out.println(c1.mul(3, 6));
    }
}













