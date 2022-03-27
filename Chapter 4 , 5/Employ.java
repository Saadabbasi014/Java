package exercise;
public class Employ
{
	private String firstName;
	private String lastName;
	private double monthlySallary;
	public Employ(String fname, String lname, double msallary)
	{
	   firstName = fname;
	   lastName = lname;
	   monthlySallary = msallary;
       if(msallary < 0.0)
		   monthlySallary = 0.0;
	   }
	public void setFirstName(String fname)
	{
		firstName = fname;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setLastName(String lname)
	{
		lastName = lname;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setMonthlySallary(double msallary)
	{
		monthlySallary = msallary;
	}
	public double getMonthlySallary()
	{
		return monthlySallary;
	}
	public double getYearlySallary()
	{
		double yearlySallary = monthlySallary * 12;
		return yearlySallary;
	}
	public double getRaiseSallary()
	{
		double raise = monthlySallary * 0.1;
		double raisrSallary = (monthlySallary + raise) * 12;
		return raisrSallary;
		}
}