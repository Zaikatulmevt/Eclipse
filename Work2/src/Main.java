
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course course1 = new Course();
		
		course1.id = 1;
		course1.name = "C# kursu";
		course1.Instructor = "Engin demiro�";
		course1.percentageOfCompletion = "Veritaban�ndan bilgi al�n�r";
		
		
		Course course2 = new Course();
		course2.id = 2;
		course2.name = "Java Kursu";
		course2.Instructor = "Engin Demiro�";
		course2.percentageOfCompletion = "Veriler Kaynaktan al�n�r";
		
		Course course3 = new Course(3, "Python kursu", "Engin demiro�", "Veriler kaynaktan al�n�r");
		
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
