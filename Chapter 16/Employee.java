import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Employee{
	
	private String name;
	private int ID;
	private double sallary;
	
	public Employee(String name, int ID, double sallary){
		
		this.name = name;
		this.ID = ID;
		this.sallary = sallary;
	}
	
	public String getName(){
		return name;
	}
	
	public int getID(){
		return ID;
	}
	
	public double getSallary(){
		return sallary;
	}
	
	@Override
	public String toString(){
		return String.format("Name%s%nID%d%nSallary%.2f%n", getName(), getID(), getSallary());
	}
}