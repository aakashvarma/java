class Employee implements Cloneable{
    int id;
    String name;
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void display(){
        System.out.println(id + " " + name);
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class Clone{
    public static void main(String[] args){
        Employee obj1 = new Employee(101, "Varma");
        try{
            Employee obj2 = (Employee)obj1.clone();
            obj1.display();
            obj2.display();
            System.out.println(obj1.equals(obj2));
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}