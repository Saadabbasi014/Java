package exersise;
public class Employtest
{
	public static void main(String [] args)
	{
		Employ emp1 = new Employ("John", "Smith", 5000.00);
		Employ emp2 = new Employ("Jane", "Doe", 8000.00);
		System.out.printf("Yearly sallary of %s %s:%.2f\n", emp1.getFirstName(),
		 emp1.getLastName(), emp1.getYearlySallary());
		System.out.printf("Yearly sallary of %s %s:%.2f\n", emp2.getFirstName(),
		 emp2.getLastName(), emp2.getYearlySallary());
		System.out.println();
		System.out.println( "***** Giving 10% raise for each employee *****" );
		System.out.printf( "Yearly sallary of %s %s: %.2f\n", emp1.getFirstName(),
		 emp1.getLastName(), emp1.getRaiseSallary());
		System.out.printf( "Yearly sallary of %s %s: %.2f\n", emp2.getFirstName(),
   		 emp2.getLastName(), emp2.getRaiseSallary());

	}
}