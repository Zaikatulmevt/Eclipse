
public class CourseManager {
	public void add(Course course) {
		System.out.println(course.name + " kursu ba�ar�yla eklendi");
	}
	public void delete (Course course) {
		System.out.println(course.name + " ba�ar�yla silindi");
	}
	
	public void update (Course course) {
		System.out.println(course.name + " ba�ar�yla g�ncellendi");
	}
}