
public class Instructor extends User  {
	int salary;
	String title; 
	public Instructor(int id, String firstName, String lastName, int salary, String title) {
		super(id, firstName, lastName);
		this.salary = salary;
		this.title = title;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
