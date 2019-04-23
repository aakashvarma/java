import java.util.*;

class Employee{
    int empId;
    String empName;
    String email;
    String gender;
    double salary;

    Employee(int empId, String empName, String email, String gender, double salary){
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public void GetEmployeeDetails(){
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Email: " + email);
        System.out.println("Employee Gender: " + gender);
        System.out.println("Employee Salary: " + salary);
    }
}

class EmployeeDB{
    int removeEmp = -1;
    String name;

    ArrayList<Employee> list = new ArrayList<>();

    public void addEmployee(Employee e){
        list.add(e);
    }
    public void showList(){
        Iterator<Employee> it = list.iterator();
        while(it.hasNext()){
            Employee emp = it.next();
            System.out.println(emp);
        }
    }
    public void deleteEmployee(int empId){
        Iterator<Employee> it = list.iterator();
        while(it.hasNext()){
            Employee emp = it.next();
            if(empId == emp.empId){
                removeEmp = list.indexOf(emp);
                System.out.println("Employee deleted.");
            }
        }
        try {
            list.remove(removeEmp);
        } catch (Exception e) {
            System.out.println("EmployeeID not found in the database.");
        }
        
    }
    public String showPaySlip(int empId){
        Iterator<Employee> it = list.iterator();
        while(it.hasNext()){
            Employee emp = it.next();
            if(empId == emp.empId){
                name = emp.empName;
            }
        }
        return name;
    }
}

class Prog2{
    public static void main(String[] args){
        Employee obj1 = new Employee(12340, "Varma", "varma@email.com", "male", 12345.0);
        Employee obj2 = new Employee(13570, "Aakash", "aakash@email.com", "male", 23456.0);
        Employee obj3 = new Employee(14816, "wipro", "wipro@email.com", "female", 34567.0);

        EmployeeDB objdb = new EmployeeDB();

        objdb.addEmployee(obj1);
        objdb.addEmployee(obj2);
        objdb.addEmployee(obj3);

        objdb.showList();
        System.out.println("___________________________________");

        objdb.deleteEmployee(1416);
        System.out.println("___________________________________");

        objdb.showList();
    }
}