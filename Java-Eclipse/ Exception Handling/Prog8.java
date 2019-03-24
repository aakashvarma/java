class AgeException extends Exception{
    AgeException(String s){
        super(s);
    }
}

class Prog8{
    public static void main(String[] args){
        try{
            int age = Integer.parseInt(args[0]);
            if(age>=18 && age<60){
                System.out.println("Valid age details.");
            }
            else throw new AgeException("Age detalis are invalid.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You have not given any age in the array.");
        }
        catch(NumberFormatException e){
            System.out.println("Numbers have to be given, where as you have given someother variable type as input.");
        }
        catch(AgeException e){
            System.out.println(e);
        }
    }
}