package singletone;

public class EmployeeTest {

	public static void main(String[] args) {
//	Employee emp1 = new Employee();
//	emp1.display();
//	Employee emp2 = new Employee();
//	emp1.display();
		
		Employee emp1  = Employee.getInstance();
		emp1.display();
		Employee emp2 = Employee.getInstance();
		emp2.display();
		Employee emp3 = Employee.getInstance();
		emp3.display();
	}

}
