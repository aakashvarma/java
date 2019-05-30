import java.util.*;

class Employee{
    int id;
    String name;
    int age;

    Employee(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "[" + id + " " + name + " " + age + "]";
    }
}

class MakeMap{

    HashMap<Integer, Employee> M1 = new HashMap<>();

    public void addKeyValue(int key, Employee value){
        M1.put(key, value);
        System.out.println("Key and value has been added to the hashmap.");
    }

    public void getValue(int key){
        Employee value = (Employee)M1.get(key);
        System.out.println("The vlaue for the corresponding " + key + " is: " + value);
    }

    public void deleteValue(int key){
        M1.remove(key);
        System.out.println("Removed a value.");
    }

    public void displayAll(){
        Set s = M1.entrySet();
        Iterator it = s.iterator();
        while(it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();
            System.out.println("Key: " + me.getKey() + ", Value: " + me.getValue());
        }   
    }

}

class CollectionsPrac{
    public static void main(String[] args){
        MakeMap obj = new MakeMap();

        obj.addKeyValue(101, new Employee(101, "Aakash", 21));
        obj.addKeyValue(102, new Employee(102, "Varma", 21));
        obj.addKeyValue(103, new Employee(103, "Vamshi", 19));
        obj.addKeyValue(104, new Employee(104, "Yash", 22));
        obj.addKeyValue(105, new Employee(105, "Akhil", 20));

        obj.displayAll();
    }
}