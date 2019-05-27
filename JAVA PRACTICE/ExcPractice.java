class UnderAgeException extends Exception{
    private static final long serialVersionUID = 1L;

    public UnderAgeException(String msg){
        super(msg);
    }
}

class CheckVote{
    int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void vote() throws UnderAgeException{
        if(age < 18){
            throw new UnderAgeException("Age cant be less than 18");
        }
        else{
            System.out.println("Your are eligible to vote.");
        }
    }
}

class ExcPractice{
    public static void main(String[] args){
        CheckVote obj = new CheckVote();
        try{
            obj.setAge(20);
            obj.vote();
            obj.setAge(10);
            obj.vote();
            obj.setAge(40);
            obj.vote();
        }catch(UnderAgeException e){
            System.out.println(e);
        }
    }
}