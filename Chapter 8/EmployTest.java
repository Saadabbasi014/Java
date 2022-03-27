public class EmployTest{
	
	public static void main(String[] args){
		
		Date birth = new Date(12, 7, 1949);
		Date hire = new Date(3, 12, 1988);
		Employ employ = new Employ("bob", "blue", birth, hire);
		
		System.out.println(employ);
	}
}