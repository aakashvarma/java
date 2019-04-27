import java.util.*;
import java.io.*;

class Prog1{
    int count = 0;
    char searchChar;
    String fileName;

    public void countChar() throws IOException{
            File inputFile = new File(fileName);
            FileReader in = new FileReader(inputFile);
            int c;
            while((c= in.read())!=-1){
                if(Character.toLowerCase((char)c) == Character.toLowerCase(searchChar))
                    count++;
                // System.out.println((char)c);
            }
            in.close();
            System.out.println("File " + fileName + " has " + count + " instances of letter " + searchChar + "."); 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Prog1 obj = new Prog1();

        System.out.println("Enter the file name");
        obj.fileName = sc.nextLine();
        System.out.println("Enter the character to be counted");
        obj.searchChar = sc.next().charAt(0);

        try{
            obj.countChar();
        }catch(IOException e){
            System.out.println("No file found.");
        }
        
    }
}