public class Student1{
	private int id;
	String name;
	double marks;
	
	public void setId(int num){
		if(num > 0)
			id = num;
		else 
			System.out.print("Invalid number passed : ");
	}
	
		public int getId(){
			return id;
		   }	
		
}