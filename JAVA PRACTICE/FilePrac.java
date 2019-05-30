import java.io.*;

class FilePrac{
    public static void main(String[] args) throws IOException{
        
        try{
            FileInputStream in = new FileInputStream("outtest.txt");
            BufferedInputStream bi = new BufferedInputStream(in);

            int c = bi.read();
            while(c!= -1){
                System.out.print((char)c);
                c = bi.read();
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}