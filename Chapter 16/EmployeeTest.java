public class EmployeeTest
 {
	
	public static void main(String[] args){

		ArrayList<Employee> employee = new ArrayList<Employee>();
		employee.add(new emp1("Saad", 1325, 550.45));
		employee.add(new emp2("Fahad", 2133, 540.80));
		
		
		// Employee emp1 = new Employee("Saad", 1325, 550.45);
		// Employee emp2 = new Employee("Fahad", 2133, 540.80);
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		
		}
	}
}