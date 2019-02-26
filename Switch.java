import java.util.*;

class Main{
    public char selectCase(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your grade: ");
        char grade = sc.next().charAt(0);
        return grade;
    }
    public void displayComment(char grade){
        switch(grade){
            case 'A' :
                System.out.println("Excellent");
                break;
            case 'B' :
                System.out.println("Good");
                break;
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You have passed");
                break;
            case 'F' :
                System.out.println("Fail");
                break;
            default:
                System.out.println("You have to select anything between A and F (excluding E grade)");
        }
    }
    public static void main(String[] args){
        Main obj = new Main();
        char grade = obj.selectCase();
        obj.displayComment(grade);
    }
}