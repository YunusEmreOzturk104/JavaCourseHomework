
public class StudentManager extends UserManager{
	public void add(User user) {
		System.out.println(user.firstName +" "+ user.lastName + " eklendi");
	}
	public void deleted(User user) {
		System.out.println(user.firstName +" "+ user.lastName + " silindi");
	}
}
