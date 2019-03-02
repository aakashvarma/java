package main;

import service.StudentReport;
import bean.Student;
import exception.*;

public class StudentMain {
	
	static Student data[] = new Student[4];
	static {
		for(int i = 0; i < data.length; i++)
		{
			data[i] = new Student();
		}
			data [0] = new Student("Sekar", new int[] {35, 35, 35});
			data [1] = new Student(null, new int[] {11, 22, 33});
			data [2] = null;
			data [3] = new Student("Manoj", null);
		
		}
	
	public static void main(String[] args) {
		StudentReport studentReport = new StudentReport();
		System.out.println("Grades Calculation: ");
		
		String x = null;
		
		for(int i = 0; i < data.length; i++) {
			
			try
			{
				if(data[i] == null)
				{
					throw new NullStudentException("error");
				}
				else if(data[i].name == null)
				{
					throw new NullNameException("error");
				}
				else if(data[i].marks == null)
				{
					throw new NullMarksArrayException("error");
				}
				else
				{
					x = studentReport.validate(data[i]);
				}
			}
			catch(NullNameException e)
			{
				x = "NullNameException occurred";
				
			}
			catch(NullMarksArrayException e)
			{
				x = "NullMarksArrayException occurred";
				
			}
			catch(NullStudentException e)
			{
				x = "NullStudentException occurred";
			}
			
			System.out.println("Grade: " + x);
			
		}
		
	}
}
