public class AveGrade{
	private String name;
	private double average; 
	
	public AveGrade(String name, double average){
		this.name = name;
		if(average > 0.0)
			if(average < 100.0)
				this.average = average;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAverage(double average){
		if(average > 0.0)
			if(average < 100.0)
		        this.average = average;
	}
	
	public double getAverage(){
		return average;
	}
	
	public String getGrade(){
		String grade = " ";
	
	if(average > 90.0)
		grade = "A";
	else if(average > 80.0)
		grade = "B";
	else if(average > 70.0)
		grade = "C";
	else if(average > 60.0)
		grade = "D";
	else
		grade = "Fail";
	return grade;
	}
}