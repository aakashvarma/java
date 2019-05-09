package testing;

import java.util.*;

public class Employee {
	
	public ArrayList<String> A1 = new ArrayList<String>();
	
	public void addToList(String name)
	{
		A1.add(name);
		System.out.println("Added successfully.");
	}
	
	public String findName(ArrayList<String> employees,String name)
	{
		String result="";
		if(employees.contains(name))
		{
			result="FOUND";
		}
		else
		{
		    result="NOT FOUND";
		}
		return result;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.addToList("Varma");
	}
}
