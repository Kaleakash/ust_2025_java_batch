package singletone;

public class Employee {

	private Employee() {
	System.out.println("object created..");
	}
	public void display() {
		System.out.println("Employee class method");
	}
	private static Employee emp = new Employee();
	public static Employee getInstance() {
		return emp;
	}
}
