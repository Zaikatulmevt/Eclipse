
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course course1 = new Course();
		
		course1.id = 1;
		course1.name = "C# kursu";
		course1.Instructor = "Engin demiroğ";
		course1.percentageOfCompletion = "Veritabanından bilgi alınır";
		
		
		Course course2 = new Course();
		course2.id = 2;
		course2.name = "Java Kursu";
		course2.Instructor = "Engin Demiroğ";
		course2.percentageOfCompletion = "Veriler Kaynaktan alınır";
		
		Course course3 = new Course(3, "Python kursu", "Engin demiroğ", "Veriler kaynaktan alınır");
		
		Course[] courses = {course1, course2, course3};
		
		for(Course course : courses) {
			System.out.println(course.id);
			System.out.println(course.name);
			System.out.println(course.Instructor);
			System.out.println(course.percentageOfCompletion);
			
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course1);
		courseManager.update(course1);
		courseManager.add(course2);
		courseManager.delete(course2);
		courseManager.update(course2);
		courseManager.add(course3);
		courseManager.delete(course3);
		courseManager.update(course3);

	}

}
