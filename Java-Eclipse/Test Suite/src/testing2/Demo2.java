package testing2;

public class Demo2 {
	public boolean palindromeCheck(String str) {
		
		String reverse = "";
        
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        
        if(str.equalsIgnoreCase(reverse))
        	return true;
        else 
       		return false;   
	}
}
