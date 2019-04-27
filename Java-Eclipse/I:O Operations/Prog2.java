import java.util.*;
import java.io.*;

class Prog2{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input file name");
        String input_file = sc.nextLine();
        System.out.println("Enter the output file name");
        String output_file = sc.nextLine();
        try{
            File inputFile = new File(input_file);
            File outputFile = new File(output_file);
            FileReader in = new FileReader(inputFile);
            FileWriter out = new FileWriter(outputFile);
            int c;
            while((c = in.read())!=-1)
                out.write(c);

            in.close();
            out.close();
            System.out.println("File is copied.");
        }catch(IOException e){
            System.out.println("No file found.");
        }
    }
}