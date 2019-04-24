import java.util.*;

class Prog2{
    Set<String> H1 = new HashSet<String>();

    public void addEmployee(String empName){
        H1.add(empName);
    }
    public Set getEmpList(){
        return H1;
    }
    public String getItrEmp(){
        String send = "None returned";
        Iterator<String> it = H1.iterator();
        while(it.hasNext()){
            send = it.next();
        }
        return send;
    }
    public static void main(String[] args){
        
        Prog2 obj = new Prog2();
        obj.addEmployee("Aakash");
        obj.addEmployee("Varma");

        obj.getItrEmp();
    }
}