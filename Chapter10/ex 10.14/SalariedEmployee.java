// Fig. 10.5: SalariedEmployee.java
// SalariedEmployee concrete class extends abstract class Employee.

public class SalariedEmployee extends Employee{
	
	private double weeklySalary;
	
	public SalariedEmployee(String firstName, String lastName, 
	String socialSecurityNumber, double weeklySalary){
	 
	super(firstName, lastName, socialSecurityNumber); 

	if (weeklySalary < 0.0)
		throw new IllegalArgumentException(
		"Weekly salary must be >= 0.0");

		this.weeklySalary = weeklySalary;
	}

	 // set salary
	public void setWeeklySalary(double weeklySalary)
	 {
	if (weeklySalary < 0.0)
		throw new IllegalArgumentException(
		"Weekly salary must be >= 0.0");

		this.weeklySalary = weeklySalary;
	} 

	 // return salary
	public double getWeeklySalary(){
		return weeklySalary;
	} 
		
	@Override 
	public double earnings() { 
		return getWeeklySalary();
	}
	
	@Override 
	public String toString() { 
		return String.format("salaried employee: %s%n%s: $%,.2f",
		super.toString(), "weekly salary", getWeeklySalary());
	}	
	
}