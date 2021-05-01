
public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(50,"C#","Kamp","Engin Demiro�");
		Course course2 = new Course(60, "Java","Kamp", "Engin Demiro�");
		Course[] courses = {course1,course2};
		for (Course course : courses) {
			System.out.println(course.name);
		}
		CourseManager courseManager = new CourseManager();
		courseManager.courseTaken(course1);
		courseManager.courseTaken(course2);
		User �nstUser = new Instructor(1, "Engin", "Demiro�", 4000, "Yaz�l�m geli�tiricisi");
		UserManager userManager = new InstructorManager();
		userManager.add(�nstUser);
		userManager.deleted(�nstUser);
		User stUser = new Student(1, "Yunus Emre", "�zt�rk", 49, 90);
		UserManager usManager = new StudentManager();
		usManager.add(stUser);
		usManager.deleted(stUser);
	}
}
