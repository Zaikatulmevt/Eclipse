
public class StudentManager {
	
	public void completeThisLesson(Student student) {
		System.out.println("Tebrikler sayın "+ student.getFirstName()+ " "+ student.getLastName() +". Dersi başarıyla tamamladınız.");
	}
	
	public void takeAttendance(Student student) {
		System.out.println("Yoklamanız Başarıyla Alınmıştır. Derse dönebilirsiniz");
	}

}
