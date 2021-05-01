
public class Student extends User {
	int no;
	int point;
	public Student(int id, String firstName, String lastName, int no, int point) {
		super(id, firstName, lastName);
		this.no = no;
		this.point = point;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
}
