import java.util.*;

class Prog1{
    Set<String> H1 = new HashSet<String>();

    public String saveCountryNames(String CountryName){
        H1.add(CountryName);
        return CountryName;
    }
    public String getCountry(String CountryName){
        if(H1.contains(CountryName)){
            return CountryName;
        }
        else{
            return "Country doesnot exist.";
        }
    }
    public static void main(String[] args){
        Prog1 obj = new Prog1();
        obj.saveCountryNames("India");
        obj.saveCountryNames("Australia");
        obj.saveCountryNames("Brazil");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("China");

        System.out.println(obj.getCountry("India"));
        System.out.println(obj.getCountry("Japan"));
        
    }
}