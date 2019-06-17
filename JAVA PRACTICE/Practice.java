import java.util.*;
import java.io.*;

class Employee implements Cloneable, Serializable{
    String name;
    int id;

    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void display(Employee e){
        System.out.println(e);
    }

    @Override
    public String toString(){
        return id + " " + name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

class Practice{
    public static void main(String[] args){
        HashMap<Integer, Employee> H1 = new HashMap<>();

        H1.put(1, new Employee("Varma", 101));
        H1.put(2, new Employee("Aakash", 102));
        H1.put(3, new Employee("Abcd", 103));
    }
}