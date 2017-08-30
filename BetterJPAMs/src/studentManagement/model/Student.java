
package studentManagement.model;

public class Student
{
	boolean isCurrentStudent;
	int gradeLevel;
	int idNumber;
	String name;
	String gender;
	int age;
	double gpa;
	
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
