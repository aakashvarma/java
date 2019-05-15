package interestCalculator;


public class RDaccount  {

		private int amount,age,months;
		RDaccount (){
			
		}
	public RDaccount setAmount(int amount) {
		this.amount=amount;
		return this;
		
	}
	public RDaccount setAge(int age) {
		this.age=age;
		return this;
	}
	
	public RDaccount setMonths(int months) {
		this.months=months;
		return this;
	}
	
	public double build() {
		RDaccount RD=new RDaccount();
		return RD.interest(this.amount, this.age, this.months);
	}
		

	double interest(double amount2,double age2,int months) {
	
		double interest=0;
		if(age2<60 ) {
			if(months==6) {
				interest=amount2* 0.075;
			}
			if(months==9) {
				interest=amount2*0.0775;
				
			}
			if(months==12) {
				interest=amount2*0.08;
				
			}
			if(months==15) {
				interest=amount2*0.0825;
			}
			if(months==18) {
				interest=amount2*0.085;
			}
			if(months==21) {
				interest=amount2*0.0875;
			}
		}
		else {
			if(months==6) {
				interest=amount2* 0.08;
			}
			if(months==9) {
				interest=amount2*0.0825;
				
			}
			if(months==12) {
				interest=amount2*0.085;
				
			}
			if(months==15) {
				interest=amount2*0.0875;
			}
			if(months==18) {
				interest=amount2*0.09;
			}
			if(months==21) {
				interest=amount2*0.0925;
			}
		}
		return interest;
	}

}
