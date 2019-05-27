abstract class Employee{
    int id;
    String name;
    long salary;
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    public abstract void setSalary();

    public void display(){
        System.out.println(id + " " + name + " " + salary);
    }
}

class AbstractPrac extends Employee{
    void getSalary(){
        
    }
}