

// [INTERFACE]- It is a block same like abstract class, where every method will be abstract. 
// I.e. There is no defined method in interface



interface Abc
{
    // methods in interfaces are by default abstract, so you donot have to mention, public abstract void show()
    void show();
}
class AbcImpl implements Abc
{
    public void show()
    {
        System.out.println("in show");
    }
}

class Interface{

    public static void main(String[] srgs){
        Abc obj = new AbcImpl();
        obj.show();
    }
}

// OR by using ANONYMOUS CLASSES

interface Abc
{
    // methods in interfaces are by default abstract, so you donot have to mention, public abstract void show()
    void show();
}
class Interface{

    public static void main(String[] srgs){
        Abc obj = new Abc()
        {
            public void show()
            {
                System.out.println("in show");
            }
        };
        obj.show();
    }
}














