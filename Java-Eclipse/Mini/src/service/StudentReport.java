package service;

import bean.Student;
//import exception.*;

public class StudentReport {
	
	public String findGrade(Student studentObject) {
		String grade = "none";
		int sum = 0;
		int length = studentObject.marks.length;
		for(int i = 0; i < length; i++)
		{
			if(studentObject.marks[i] < 35) {
				grade = "F";
			}
			else {
				break;
			}
		}
		for(int j = 0; j < length; j++)
		{
			sum = sum + studentObject.marks[j];
		}
		if(sum <= 150) grade = "D";
		else if(sum > 150 && sum <= 200) grade = "C";
		else if(sum > 200 && sum <= 250) grade = "B";
		else if(sum > 250 && sum <= 300) grade = "A";
		return grade;
	}
	
	public String validate(Student studentObject) {
		
		
		StudentReport obj = new StudentReport();
		return obj.findGrade(studentObject);
	}
}
