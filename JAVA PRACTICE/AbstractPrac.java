// abstract class Employee{
//     int id;
//     String name;
//     long salary;
//     Employee(int id, String name){
//         this.id = id;
//         this.name = name;
//     }
//     public abstract void setSalary();

//     public void display(){
//         System.out.println(id + " " + name + " " + salary);
//     }
// }

// class AbstractPrac extends Employee{
//     void getSalary(){
        
//     }
// }


// Random

import java.util.Random;

public class AbstractPrac{
    public static void main(String[] args){
        Random rand = new Random();

        int rand_int1 = rand.nextInt(30);
        double rand_double1 = rand.nextDouble();

        System.out.println(rand_int1);
        System.out.println(rand_double1);
    }
}