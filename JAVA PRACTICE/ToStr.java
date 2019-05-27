class ToStr{
    int id;
    String name;
    String collegeName;
    long number;

    ToStr(){

    }

    ToStr(int id, String name, String collegeName, long number){
        this.id = id;
        this.name = name;
        this.collegeName = collegeName;
        this.number = number;
    }

    public void displayObj(ToStr obj){
        System.out.println(obj);
        System.out.println(obj.toString());
    }

    @Override
    public String toString(){
        return id +" "+ name +" "+ collegeName +" "+ number;
    }

    public static void main(String[] args){
        ToStr e = new ToStr(101, "Aakash", "VIT", 12345);
        e.displayObj(e);
    }
}