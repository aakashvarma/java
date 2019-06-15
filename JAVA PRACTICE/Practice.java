import java.io.FileReader;
import java.io.IOException;
import java.lang.Math;

// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.ObjectInputStream;
// import java.io.ObjectOutputStream;
// import java.io.Serializable;

// class Employee implements Serializable{
//     int id;
//     String name;
//     Employee(int id, String name){
//         this.id = id;
//         this.name = name;
//     }

//     public void display(){
//         System.out.println(id +" " + name);
//     }
// }

// class Practice{
//     public static void main(String[] args){
//         try{
//             FileOutputStream out = new FileOutputStream("outfile.txt");
//             ObjectOutputStream objout = new ObjectOutputStream(out);

//             Employee obj1 = new Employee(101, "Aakash");

//             objout.writeObject(obj1);


//             FileInputStream in = new FileInputStream("outfile.txt");
//             ObjectInputStream objin = new ObjectInputStream(in);

//             Employee obj2 = (Employee)objin.readObject();

//             obj2.display();
//         }catch(FileNotFoundException e){
//             e.getMessage();
//         }catch(IOException e){
//             e.getMessage();
//         }catch(ClassNotFoundException e){
//             e.getMessage();
//         }
//     }
// }


// class Practice{
//     public static void main(String[] main) throws IOException{
//         String finalCount = "";
//         String text = "world wide web";
//         String words[] = text.split(" ", 0);
//         for(int i = 0; i < words.length; i++){
//             int wordLength = words[i].length();
//             int temp = 0;
//             if(wordLength%2 == 0){
//                 for(int j = 0; j < wordLength/2; j++){
//                     temp = Math.abs(((int)words[i].charAt(j) - 96) - ((int)words[i].charAt(wordLength - j - 1) - 96)) + temp;
//                     // System.out.println(words[i].charAt(j) + " " + words[i].charAt(wordLength - j - 1));
//                 }
//             }
//             else{
//                 for(int j = 0; j < wordLength/2; j++){
//                     temp = Math.abs(((int)words[i].charAt(j) - 96) - ((int)words[i].charAt(wordLength - j - 1) - 96)) + temp;
//                     // System.out.println(words[i].charAt(j) + " " + words[i].charAt(wordLength - j - 1));
//                 }
//                 temp = temp + (int)words[i].charAt(wordLength/2) - 96;
//                 // System.out.println(words[i].charAt(wordLength/2));
//             }
//             finalCount = finalCount + String.valueOf(temp);
//         }
//         // System.out.println(((int)'o'-96) - ((int)'l'-96));
//         System.out.println(finalCount);
//     }
// }


class Practice{
    public static void main(String[] args){
        int sum = 0;
		String strNum = String.valueOf(582109);
		for(int i = 0; i < strNum.length()-1; i++){
			int base = Character.getNumericValue(strNum.charAt(i));
            int power = Character.getNumericValue(strNum.charAt(i+1));
            double numVal = (int)Math.pow(base, power);
            sum = sum + (int)numVal;
            System.out.println(numVal+ " -> "+ i);
        }
        System.out.println(strNum.length());
		System.out.println(sum);
    }
}