import java.util.*;

class Prog1{

    HashMap<String, String> M1 = new HashMap<String, String>();

    public HashMap<String, String> saveCountryCapital(String CountryName, String capital){
        M1.put(CountryName, capital);
        return M1;
    }

    public String getCapital(String CountryName){
        return (String)M1.get(CountryName);
    }

    public String getCountry(String capitalName) {
		Set set = M1.entrySet();
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			
			if (me.getValue().equals(capitalName))
				return (String)me.getKey();
		}
		
		return null;
    }
    
    public HashMap<String, String> getSwapMap(){
        HashMap<String, String> M2 = new HashMap<String, String>();
        Set set = M1.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();
            M2.put((String)me.getValue(), (String)me.getKey());
        }
        return M2;
    }

    public ArrayList<String> getListCountries(){
        ArrayList<String> A1 = new ArrayList<String>();
        Set set = M1.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();
            A1.add((String)me.getKey());
        }
        return A1;
    }

    public static void main(String[] args){
        Prog1 obj = new Prog1();
        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");

        System.out.println(obj.getCapital("Japan"));
        System.out.println(obj.getSwapMap());
        System.out.println(obj.getListCountries());
    }
}