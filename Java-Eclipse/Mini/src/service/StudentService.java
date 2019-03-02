package service;

import bean.Student;

// WILL GIVE ERRORS - EXCEPTION HANDELING

public class StudentService {
	public int findNumberOfNullMarks(Student data[]) {
		int counter = 0;
		for(int i = 0; i < data.length; i++)
		{
			if(data[i] == null) break;
			else if(data[i].marks == null) {
				counter++;
			}
		}
		return counter;
	}
	public int findNumberOfNullNames(Student data[]) {
		int counter = 0;
		for(int i = 0; i < data.length; i++)
		{
			if(data[i] == null) break;
			else if(data[i].name == null) {
				counter++;
			}
		}
		return counter;
	}
	public int findNumberOfNullObjects(Student data[]) {
		int counter = 0;
		for(int i = 0; i < data.length; i++)
		{
			if(data[i] == null) counter++;
		}
		return counter;
	}
}
