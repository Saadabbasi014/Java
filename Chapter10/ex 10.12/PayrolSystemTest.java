public class PayrolSystemTest{
	
	public static void main(String[] args){
		
		
			
	// create subclass objects 
	SalariedEmployee salariedEmployee = 
	 new SalariedEmployee("John", "Smith", "111-11-1111", 800.00); 
	HourlyEmployee hourlyEmployee = 
	 new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
	ComissionEmployee comissionEmployee = 
	 new ComissionEmployee( 
	 "Sue", "Jones", "333-33-3333", 10000, .06); 
	BasePlusComissionEmployee basePlusCommissionEmployee = 
	 new BasePlusComissionEmployee( 
	 "Bob", "Lewis", "444-44-4444", 5000, .04, 300);
	PieceWorker pieceWorker = new PieceWorker("John", "Abhram", "555-55-555", 20, 50);
	 
	 
	System.out.println("Employees processed individually:");

	System.out.printf("%n%s%n%s: $%,.2f%n%n", 
	salariedEmployee, "earned", salariedEmployee.earnings());
	System.out.printf("%s%n%s: $%,.2f%n%n",
	hourlyEmployee, "earned", hourlyEmployee.earnings());
	System.out.printf("%s%n%s: $%,.2f%n%n",
	comissionEmployee, "earned", comissionEmployee.earnings());
	System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, 
	"earned", basePlusCommissionEmployee.earnings());
	System.out.printf("%s%n%s: $%,.2f%n%n", pieceWorker, "earned", pieceWorker.earnings());
	
	 
	Employee[] employees = new Employee[5];
	// initialize array with Employees 
	employees[0] = salariedEmployee; 
	employees[1] = hourlyEmployee; 
	employees[2] = comissionEmployee; 
	employees[3] = basePlusCommissionEmployee;
	employees[4] = pieceWorker;
	
	System.out.printf("Employees processed polymorphically:%n%n");

	 // generically process each element in array employees
	for (Employee currentEmployee : employees) 
	{
	System.out.println(currentEmployee); // invokes toString
	 
	 
	if (currentEmployee instanceof BasePlusComissionEmployee)
	{
	BasePlusComissionEmployee empl = (BasePlusComissionEmployee) currentEmployee;
	
	empl.setBaseSalary(1.10 * empl.getBaseSalary());
	
	System.out.printf(
	 "new base salary with 10%% increase is: $%,.2f%n",
	empl.getBaseSalary());
	} // end if

	System.out.printf("earned $%,.2f%n%n",  currentEmployee.earnings());

	}
	// get type name of each object in employees array
	for (int j = 0; j < employees.length; j++) 
	System.out.printf("Employee %d is a %s%n", j, 
	employees[j].getClass().getName()); 
	
	}
}