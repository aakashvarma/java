
class InvalidCountryException extends Exception{

    InvalidCountryException(String s){
        super(s);
    }
    
}

class UserRegistration{
    String userName, userCountry;
    void registerUser(String userName, String userCountry) throws InvalidCountryException{
        if(userCountry.equalsIgnoreCase("india")) {
            this.userName = userName;
            this.userCountry = userCountry;
            System.out.println("User registration done successfully");
        }
        else throw new InvalidCountryException("User Outside India  cannot be registered");
    }
}

class Prog7{
    public static void main(String[] args){
        UserRegistration obj = new UserRegistration();
        try{
            obj.registerUser("Mickey", "US");
        }
        catch(InvalidCountryException e){
            System.out.println(e);
        }
    }
}