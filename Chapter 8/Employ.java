public class Employ{
	
	private String firstName;
	private String lastName;
	private Date birthDay;
	private Date hireDay;
	
	public Employ(String firstName, String lastName, Date birthDay, Date hireDay){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.hireDay = hireDay;
	}
	public String toString(){
		
		return String.format("%s, %s Hired: %s Birthday: %s",
			firstName, lastName, birthDay, hireDay);
	}
}