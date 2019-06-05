class Employee{
    protected int id;
    protected String name;

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    private void display(Employee e){
        System.out.println(e);
    }

    @Override
    public String toString(){
        return id + " " + name;
    }
}

class Student extends Employee{
    int standard;
    Student(int id, String name, int standard){
        super(id, name);
        this.standard = standard;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + standard;
    }
    
}

class Inheritance{
    public static void main(String[] args){
        Student obj = new Student(101, "Aakash", 10);
        obj.display(obj);
    }
}