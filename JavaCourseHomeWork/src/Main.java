
public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(50,"C#","Kamp","Engin Demiroğ");
		Course course2 = new Course(60, "Java","Kamp", "Engin Demiroğ");
		Course[] courses = {course1,course2};
		for (Course course : courses) {
			System.out.println(course.name);
		}
		CourseManager courseManager = new CourseManager();
		courseManager.courseTaken(course1);
		courseManager.courseTaken(course2);
		User ınstUser = new Instructor(1, "Engin", "Demiroğ", 4000, "Yazılım geliştiricisi");
		UserManager userManager = new InstructorManager();
		userManager.add(ınstUser);
		userManager.deleted(ınstUser);
		User stUser = new Student(1, "Yunus Emre", "Öztürk", 49, 90);
		UserManager usManager = new StudentManager();
		usManager.add(stUser);
		usManager.deleted(stUser);
	}
}
