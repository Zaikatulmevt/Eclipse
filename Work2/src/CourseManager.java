
public class CourseManager {
	public void add(Course course) {
		System.out.println(course.name + " kursu başarıyla eklendi");
	}
	public void delete (Course course) {
		System.out.println(course.name + " başarıyla silindi");
	}
	
	public void update (Course course) {
		System.out.println(course.name + " başarıyla güncellendi");
	}
}