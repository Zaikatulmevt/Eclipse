
public class CourseManager {
	public void add(Course course) {
		System.out.println(course.name + " kursu baþarýyla eklendi");
	}
	public void delete (Course course) {
		System.out.println(course.name + " baþarýyla silindi");
	}
	
	public void update (Course course) {
		System.out.println(course.name + " baþarýyla güncellendi");
	}
}