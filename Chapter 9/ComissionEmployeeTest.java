public class ComissionEmployeeTest{
	
	public static void main(String[] args){
		
		ComissionEmployee employee = new ComissionEmployee("Saad", "Abbasi", "222-22-2222", 10000, .06);
		
		System.out.println("Employ information obtained by get methods: ");
		System.out.printf("%n%s %s%n", "First name is", employee.getFirstName());
		System.out.printf("%n%s %s%n", "Last name is", employee.getLastName());
		System.out.printf("%n%s %s%n", "Social Security Number is", employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSales());
		System.out.printf("%s %.2f%n", "Commission rate is", employee.getComissionRate());
		
		employee.setGrossSales(5000);
		employee.setComissionRate(.1);
		
		System.out.printf("%n%s:%n%n %n", 
		"Updated employee information obtained by toString", employee);
	}
}