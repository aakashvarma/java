package interestCalculator;


public class SBaccount  {
	private String type;
private	int amount;
	
SBaccount(){
	
}

public SBaccount setType(String type) {
	this.type=type;
	return this;
}
public SBaccount setAmount(int amount) {
	this.amount=amount;
	return this;
}

public double build() {
	SBaccount ob1=new SBaccount();
	return ob1.calSB(this.type, this.amount);
}
	
	
	
	


public double calSB(String type,int amount) {
	
	
		double interest=0;
		if(type.equals("NRI"))
		{
			interest=amount*0.06;
		
		}
		else if(type.equals("NORMAL")){
			interest=amount*0.04;
			
		}
		else {
			
		}
		return interest;
		
		
	}
	

}
