
package studentManagement.model;

public class Student
{
private boolean isCurrentStudent;
private int gradeLevel;
private int idNumber;
private String name;
private String gender;
private int age;
private double gpa;

	
	public Student()
	{
		isCurrentStudent = false;
		gradeLevel = 0;
		idNumber = 00000;
		name = "John Doe";
		gender = "";
		age = 0;
		gpa = 0.0;
	}
		public String toString()
		{
			
		String str = "This Person is not a current student";
		if(isCurrentStudent)
		{
		str= "name:" + name + " " + idNumber + " gender: " + gender + " age: " + age + " gpa: " + gpa; 
		
		}
return str;
}
		
}
