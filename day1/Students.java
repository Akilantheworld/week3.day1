package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println(id);

	}
	public void getStudentInfo(char name) {
		System.out.println(name);

	}
	public void getStudentInfo(String email) {
		System.out.println(email);

	}
	public void getStudentInfo(long phone) {
		System.out.println(phone);

	}
public static void main(String[] args) {
	Students stu=new Students();
	stu.getStudentInfo("7598460863");
	stu.getStudentInfo("Akilan. J");
	stu.getStudentInfo("6");
    stu.getStudentInfo("akilanjais@gmail.com");
}

}
