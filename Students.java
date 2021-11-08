package assigmentoverloading;

public class Students {

	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID : " + id);
		System.out.println("Student Name : " + name);
	}

	public void getStudentInfo(String email) {
		System.out.println("Student e-mail ID : " + email);
	}

	public void getStudentInfo(long num) {
		System.out.println("Student Phone Number : " + num);
	}

	public static void main(String[] args) {
		Students si = new Students();
		si.getStudentInfo(01, "Dhanwanth Y");
		si.getStudentInfo("dhanusindhe@gmail.com");
		si.getStudentInfo(86820220111l);
	}
}
