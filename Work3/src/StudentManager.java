
public class StudentManager {
	
	public void completeThisLesson(Student student) {
		System.out.println("Tebrikler sayýn "+ student.getFirstName()+ " "+ student.getLastName() +". Dersi baþarýyla tamamladýnýz.");
	}
	
	public void takeAttendance(Student student) {
		System.out.println("Yoklamanýz Baþarýyla Alýnmýþtýr. Derse dönebilirsiniz");
	}

}
