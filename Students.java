package week3.day1.assignments;

public class Students {

	public static void main(String[] args) {
		Students obj = new Students();
		
		obj.getStudentInfo(001);
		obj.getStudentInfo(001, "Guru");
		obj.getStudentInfo("guru@gmail.com", 2033124567);

	}
	
	public void getStudentInfo(int id) {
		System.out.println("Student ID: " + id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
	}
	
	public void getStudentInfo(String email, long phnnumber ) {
		System.out.println("Student Email: " + email);
		System.out.println("Student Phonenumber: " + phnnumber);
	}

}
