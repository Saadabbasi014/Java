// Fig. 10.4: Employee.java
// Employee abstract superclass.

public abstract class Employee
{
	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private final String birthDay;
	
	public Employee(String firstName, String lastName, String socialSecurityNumber,){
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getSocialSecurityNumber(){
		return socialSecurityNumber;
	}
	
	public String setBirthDay(String birthDay){
		this.birthDay = birthDay;
	}
	
	public String getBirthDay(){
		return birthDay;
	}
	
	@Override
	public String toString(){
	return String.format("%s %s%nsocial security number: %s", 
	getFirstName(), getLastName(), getSocialSecurityNumber());
	}
	
	
	public abstract double earnings();
} 