package week3.day1;

public class Employee {
	private static final String Akilan = null;
	private static final boolean Permanent = false;
	int empId;
	String empName;
	boolean empStatus;
	
	Employee(){
		System.out.println("Default Constructor");
	}
	
	Employee (int id, String name, boolean status){
			System.out.println("Parameterised Constructor");
			empId = 65465123;
			empName = Akilan;		
			empStatus = Permanent;
	}

	
	public static void main(String[] args) {

		Employee emp = new Employee();
		
		System.out.println(emp.empId);
		System.out.println(emp.empName);
		System.out.println(emp.empStatus);
		
	}

}
