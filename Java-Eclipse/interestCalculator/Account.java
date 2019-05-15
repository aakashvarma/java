package interestCalculator;

import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		
		System.out.println("MAIN MENU");
		System.out.println("------------");
		System.out.println("1.Interest Calculator-SB");
		System.out.println("2.Interest Calculator-FD");
		System.out.println("3.Interest Calculator-RD");
		
		Scanner e=new Scanner(System.in);
		int t=e.nextInt();
		
		if(t==2) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Amount=");
			int amount=sc.nextInt();
			System.out.println("Enter Days=");
			int days=sc.nextInt();
			System.out.println("Enter Age=");
			int age=sc.nextInt();
			FDaccount ob1=new FDaccount();
			double f=ob1.calFD(amount,days,age);
			System.out.print(f);
		}
		else if(t==3) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter age=");
			
			double age=sc.nextDouble();
			System.out.println("Enter Amount=");
			double amount=sc.nextDouble();
			System.out.println("Enter number of months=");
			int months=sc.nextInt();
			RDaccount ob2=new RDaccount();
			double RD=ob2.interest(amount,age,months);
			System.out.print(RD);
		}
		else if(t==1) {
			Scanner sc=new Scanner(System.in);
			System.out.println("type of account=");
			String type=sc.nextLine();
			System.out.println("Enter Amount=");
			int amount=sc.nextInt();
			SBaccount ob3=new SBaccount();
			double res=ob3.calSB(type, amount);
			System.out.print(res);
		}
		else {
			System.out.print("ERROR");
			
		}
		

	}
}
