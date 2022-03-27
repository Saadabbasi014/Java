public class StudentTest{
	public static void main(String [] args){
		Student std = new Student();
		std.id = 23;
		std.name = "Hania";
		std.marks1 = 58;
		std.marks2 = 87;
		std.student();
		std.mobileNumber = "0322 3456434";
		boolean average = std.isPass();
		System.out.println("Id" + " " +  std.id);
		System.out.println("Name" + " " + std.name);
		System.out.println("Marks" + " " + std.marks1);
		System.out.println("Marks" + " " + std.marks2);
		System.out.println("marks" + " " + average);
		System.out.println("mobileNumber" + " " + student());

	}

} 	