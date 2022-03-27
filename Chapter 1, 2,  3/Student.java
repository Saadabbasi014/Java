public class Student{
	int id;
	String name;
	double marks1;
	double marks2;
    private String mobileNumber;
	
	private double calculateAverage(){
		double sum = marks1 + marks2;
		return sum / 2.0;
	}
	public boolean isPass(){
		if(calculateAverage() > 50){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void student(){
		System.out.println(mobileNumber);
		
	}
}