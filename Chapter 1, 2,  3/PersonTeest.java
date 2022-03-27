public class PersonTeest{
	public static void main(String [] args){
		
		Person p1 = new Person();
		p1.name = "Saad Abbasi";
		p1.id = 37400000;
		p1.mobileNumber = "0322 0000000000";
		p1.adress = "Jamia Ashrafia";
		p1.email = "saadabbasi@gmail.com";
		personData(p1);
		
    }
	 public static void personData(Person p){
		System.out.println(p.name);
		System.out.println(p.id);
		System.out.println(p.mobileNumber);
		System.out.println(p.adress);
		System.out.println(p.email);

	 }
}