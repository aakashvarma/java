interface LibraryUser{
    void registerAccount();
    void requestBook();
}

class KidUsers implements LibraryUser{
    int age;
    String bookType;

    public void registerAccount(){
        if(age < 12) System.out.println("You have successfully registered under a Kids Account.");
        else System.out.println("Sorry, Age must be less than 12 to register as a kid.");
    }
    public void requestBook(){
        if(bookType.equalsIgnoreCase("Kids")) System.out.println("Book Issued successfully, please return the book within 10 day.");
        else System.out.println("Oops, you are allowed to take only kids books.");
    }
}

class AdultUsers implements LibraryUser{
    int age;
    String bookType;

    public void registerAccount(){
        if(age > 12) System.out.println("You have successfully registered under an Adult Account.");
        else System.out.println("Sorry, Age must be greater than 12 to register as an adult.");
    }
    public void requestBook(){
        if(bookType.equalsIgnoreCase("Fiction")) System.out.println("Book Issued successfully, please return the book within 7 day.");
        else System.out.println("Oops, you are allowed to take only adult Fiction books.");
    }
}

class LibraryInterfaceDemo{
    public static void main(String[] args){

        KidUsers obj1 = new KidUsers();
        obj1.age = 11;
        obj1.bookType = "kids";
        obj1.registerAccount();
        obj1.requestBook();

        AdultUsers obj2 = new AdultUsers();
        obj2.age = 24;
        obj2.bookType = "Fiction";
        obj2.registerAccount();
        obj2.requestBook();
    }
}