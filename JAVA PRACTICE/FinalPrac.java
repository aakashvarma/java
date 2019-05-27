
class Employee{
    int empId;
    String empName;

    Employee(){

    }

    Employee(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }

    public final void display(){
        System.out.println(empId + " " + empName);
    }
}

class FinalPrac extends Employee{
    FinalPrac(){

    }

    FinalPrac(int empId, String empName){
        super(empId, empName);
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("This is from the second class.");
    }
    public static void main(String[] args){
        FinalPrac obj = new FinalPrac(101, "Varma");
        obj.display();
    }
}