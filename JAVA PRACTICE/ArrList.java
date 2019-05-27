import java.util.*;

class Employee{
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    Employee(int empId, String empName, String email, String gender, float salary){
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    void GetEmployeeDetails(){

    }
}

class EmployeeDB{
    ArrayList<Employee> A1 = new ArrayList<>();
    

    boolean addEmployeeList(Employee e){
        A1.add(e);
        return true;
    }

    void deleteEmployee(int empId){
        Iterator<Employee> i = A1.iterator();
        while(i.hasNext()){
            Employee emp = (Employee)i.next();
            if(emp.empId == empId){
                i.remove();
            }
            // else System.out.println("Emp ID doesnot exist.");
        }
    }

    String showPaySlip(int empId){
        Iterator<Employee> i = A1.iterator();
        String paySlip = "No employee with the employee ID exists";
        while(i.hasNext()){
            Employee emp = (Employee)i.next();
            if(emp.empId == empId){
                paySlip = "Employee salary with EmpID: "+emp.empId+" is "+emp.salary;
            }
        }
        return paySlip;
    }
}

class ArrList{
    public static void main(String[] args){
        EmployeeDB empDb = new EmployeeDB();
        empDb.addEmployeeList(new Employee(101, "Aakash", "aakash@email.com", "Male", 1200000));
        empDb.addEmployeeList(new Employee(102, "Varma", "varma@email.com", "Male", 1200000));
        empDb.addEmployeeList(new Employee(103, "Name", "name@email.com", "Female", 600000));
        System.out.println(empDb.A1);

        empDb.deleteEmployee(103);
        System.out.println(empDb.A1);

        System.out.println(empDb.showPaySlip(101));
        System.out.println(empDb.showPaySlip(102));
        System.out.println(empDb.showPaySlip(103));
    }
}