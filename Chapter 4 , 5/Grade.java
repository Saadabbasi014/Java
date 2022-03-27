public class Grade{
	private String name;
	private int rollNumber;
	private int number;
	
	public Grade(String name,int rollNumber,int number){
		this.name = name;
		this.rollNumber = rollNumber;
		this.number = number;
	}
	
	public void setName(String name){
	//	if(name = String)
			this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setRollNumber(int rollNumber){
		if(rollNumber > 0)
			this.rollNumber = rollNumber;
	}
	
	public int getRollNumber(){
		return rollNumber;
	}
	public void setNumber(int number){
		this.number=number;
	}
	public int getNumber(){
		return number;
	}
	/*
	public int getPer(){
	///	if (number / 1000 * 100)
		   int per = per;
	}
	/*
	public double getGrade(){
		if(per >= 90)
		  String grade = "A";
	    else
			if(per >= 80)
                String grade = "B";	
        else
			 if(per >= 70)
				String grade = "C";
        else
			if(per >= 60)
				String grade = "D";
		else
			String grade = "Fail";
	*/	
}