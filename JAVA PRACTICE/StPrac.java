// import java.util.*;
// import java.io.*;

// class Employee implements Serializable, Cloneable{
//     int id;
//     String name;

//     Employee(int id, String name){
//         this.id = id;
//         this.name = name;
//     }

//     public String toString(){
//         return id + " " + name;
//     }

//     protected Object clone() throws CloneNotSupportedException{
//         return super.clone();
//     }
// }

// class StPrac{
//     public static void main(String[] args){
//         try{

//             FileOutputStream fout = new FileOutputStream("output.ser");
//             ObjectOutputStream oout = new ObjectOutputStream(fout);

//             FileInputStream fin = new FileInputStream("output.ser");
//             ObjectInputStream oin = new ObjectInputStream(fin);

//             Employee obj1 = new Employee(101, "Aakash");

//             oout.writeObject(obj1);

//             Employee obj2 = (Employee)oin.readObject();
//             System.out.println(obj2);

//             Employee obj3 = (Employee)obj2.clone();
//             System.out.println(obj3);

//         }catch(FileNotFoundException e){
//             e.printStackTrace();
//         }catch(IOException e){
//             e.printStackTrace();
//         }catch(ClassNotFoundException e){
//             e.printStackTrace();
//         }catch(CloneNotSupportedException e){
//             e.printStackTrace();
//         }
//     }
// }

import java.util.*;

class StPrac{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        String str = "ashgdavdahedsahsskjakhdjahsuagbka";
        String[] arr = str.split("a", 0);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            sb.append(arr[i]);
        }
        System.out.println(String.valueOf(sb));
        System.out.println(String.valueOf(sb.reverse()));
    }
}