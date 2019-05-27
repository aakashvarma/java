import java.io.*;

class Employee implements Serializable{
    int empId;
    transient String empName;
    Employee(){

    }
    Employee(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }
}

class FilePrac{
    public static void main(String[] args) throws FileNotFoundException{
        try{
            FileOutputStream out = new FileOutputStream("serialize.ser");
            ObjectOutputStream objout = new ObjectOutputStream(out);

            Employee obj = new Employee(101, "Varma");

            objout.writeObject(obj);
            System.out.println("Object successfully written.");


            FileInputStream in = new FileInputStream("serialize.ser");
            ObjectInputStream objin = new ObjectInputStream(in);

            Employee obj1 = (Employee)objin.readObject();
            System.out.println(obj1.empId+ " "+obj1.empName);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}