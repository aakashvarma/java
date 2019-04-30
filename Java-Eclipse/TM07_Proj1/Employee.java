import java.util.*;
import java.io.*;

class Employee{
    HashSet<Employee> H1 = new HashSet<>();
    Iterator it;

    int id;
    String name;
    int age;
    int salary;

    Employee(){

    }

    Employee(int id, String name, int age, int salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void saveFile(HashSet<Employee> s){

    }

    public static void main(String[] args){
        try{

            Employee obj = new Employee();
            Scanner sc = new Scanner(System.in);
            File inputFile = new File("EmployeeDB.txt");
            FileWriter out = new FileWriter("EmployeeDB.txt");

            int optionSelected;
            do{
                System.out.println("Main Menu\n1.Add an Employee\n2.Display All\n3.Exit");
                optionSelected = sc.nextInt();
                switch(optionSelected)
                {
                    case 1: 
                        System.out.println("Enter Employee ID: ");
                        int idInput = sc.nextInt();
                        System.out.println("Enter Employee Name: ");
                        String nameInput = sc.nextLine();
                        sc.nextLine();
                        System.out.println("Enter Employee Age: ");
                        int ageInput = sc.nextInt();
                        System.out.println("Enter Employee Salary: ");
                        int salaryInput = sc.nextInt();

                        obj.H1.add(new Employee(idInput, nameInput, ageInput, salaryInput));
                        Iterator it = obj.H1.iterator();
                        while(it.hasNext()){
                            Employee emp = (Employee)it.next();
                            out.write(emp.id);
                            out.write(emp.name);
                            out.write(emp.age);
                            out.write(emp.salary);
                        }
                        break;
                    case 2:
                        it = obj.H1.iterator();
                        while(it.hasNext()){
                            Employee emp = (Employee)it.next();
                            System.out.println(emp.id + "\n" + emp.name + "\n" + emp.age + "\n" + emp.salary);
                        }
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Wrong option selected.");
                        break;
                }
            }while(optionSelected!=3);

        }catch(IOException e){
            System.out.println("Error");
        }
        
    }
}