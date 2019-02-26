import java.util.*;

class Main{

    public static void main(String[] args){
        System.out.println("Break statement.");
        for(int i = 0; i < 6; i++){
            if(i == 4){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Continue statement.");
        for( int j = 0; j<=7; j++){
            if(j == 3){
                continue;
            }
            System.out.println(j);
            System.out.println("continue");
        }
    }
}

   
 