
public class StudentManager {
	
	public void completeThisLesson(Student student) {
		System.out.println("Tebrikler say�n "+ student.getFirstName()+ " "+ student.getLastName() +". Dersi ba�ar�yla tamamlad�n�z.");
	}
	
	public void takeAttendance(Student student) {
		System.out.println("Yoklaman�z Ba�ar�yla Al�nm��t�r. Derse d�nebilirsiniz");
	}

}
