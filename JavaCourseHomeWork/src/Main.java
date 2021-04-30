
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
		Instructor instructor1 = new Instructor(1, "Engin Demiroğ");
		Instructor[] instructors = {instructor1};
		for (Instructor instructor : instructors) {
			System.out.println( "Eğitmen: "+ instructor.id +" "+ instructor.name);
		}
		
	}

}
