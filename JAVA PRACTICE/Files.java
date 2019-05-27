import java.util.*;
import java.io.*;


class Files implements java.io.Serializable{
    String name;
    int number;
    public static void main(String[] args){
        Files e = new Files();
        e.name = "Aakash";
        e.number = 76600;

        try{
            FileOutputStream file = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(e);
            out.close();
            file.close();
            System.out.println("Serialized data saved.");
        }catch(IOException exc){
            System.out.println(exc);
        }
    }
    
}