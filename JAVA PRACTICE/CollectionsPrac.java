import java.util.*;

class Employee implements Comparable<Employee>{
    int id;
    String name;
    int age;
    String department;

    Employee(int id, String name, int age, String department){
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + age + " " + department;
    }

    public int compareTo(Employee e){
        if(age==e.age)  
            return 0;  
        else if(age>e.age)  
            return 1;  
        else  
            return -1;  
    }
}

class EmpList{

    ArrayList<Employee> A1 = new ArrayList<>();

    public void addEmployee(Employee e){
        A1.add(e);
        System.out.println("Employee added.");
    }

    public void deleteEmployee(int id){
        Iterator<Employee> it = A1.iterator();
        while(it.hasNext()){
            Employee emp = (Employee)it.next();
            if(emp.id == id) it.remove();
        }
    }

    public void displayAllEmployees(){
        Collections.sort(A1);
        System.out.println(A1);
    }
}

class CollectionsPrac{
    public static void main(String[] args){
        EmpList obj = new EmpList();

        obj.addEmployee(new Employee(102, "Varma", 22, "IT"));
        obj.addEmployee(new Employee(103, "Aakash", 21, "IT"));
        obj.addEmployee(new Employee(101, "Nadimpalli", 20, "IT"));

        obj.displayAllEmployees();
    }
}