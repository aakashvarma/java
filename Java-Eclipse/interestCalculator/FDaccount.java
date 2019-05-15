package interestCalculator;




public class FDaccount{

	
private  int amount;
private int days;
private int age;

public FDaccount setAmount(int amount) {
	this.amount = amount;
	return this;
}

public FDaccount setAge(int age) {
	this.age= age;
	return this;
}

public FDaccount setDays(int days) {
	this.days= days;
	return this;
}


public double build() {
	FDaccount account = new FDaccount();
	return account.calFD(this.amount, this.days, this.age);
}




public double calFD(int amount,int days,int age) {
	
	
	
	double interest = 0;
	
	if(amount<10000000)
	{
		if(age<60 && (days>=7 && days<=14)) {
			interest=amount*0.045;
		}
		if(age<60 && (days>=15 && days<=29)) {
			interest=amount*0.0475;
		}
		if(age<60 && (days>=30 && days<=45)) {
			interest=amount*0.055;
		}
		if(age<60 && (days>=46 && days<=60)) {
			interest=amount*0.07;
		}
		if(age<60 && (days>=61 && days<=184)) {
			interest=amount*0.075;
		}
		if(age<60 && (days>=185)) {
			interest=amount*0.08;
		}
		
		
		if(age>60 && (days>=7 && days<=14)) {
			interest=amount*0.05;
		}
		if(age>60 && (days>=15 && days<=29)) {
			interest=amount*0.052;
		}
		if(age<60 && (days>=30 && days<=45)) {
			interest=amount*0.06;
		}
		if(age>60 && (days>=46 && days<=60)) {
			interest=amount*0.075;
		}
		if(age>60 && (days>=61 && days<=184)) {
			interest=amount*0.08;
		}
		if(age>60 && (days>=185)) {
			interest=amount*0.085;
		}
		
		
		
		
		
	}
	else {
		if(days>=7 && days<=14){
			interest=amount*0.065;
		}
		if(days>=15 && days<=29) {
			interest=amount*0.0675;
		}
		if(days>=30 && days<=45) {
			interest=amount*0.0675;
		}
		if(days>=46 && days<=60) {
			interest=amount*0.08;
		}
		if(days>=61 && days<=184) {
			interest=amount*0.085;
		}
		if(days>=185) {
			interest=amount*0.10;
		}
		
	}
	return interest;
	
	
	
}
		

}
