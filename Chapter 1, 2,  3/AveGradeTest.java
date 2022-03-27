public class AveGradeTest
{
	public static void main(String[] args)
	{
		AveGrade g1 = new AveGrade("Saad Abbasi", 93.5);
		AveGrade g2 = new AveGrade("Habib Noor", 73.4);
		System.out.printf("%s's grade is : %s%n", g1.getName(),g1.getGrade());
		System.out.printf("%s's grade is : %s%n", g2.getName(),g2.getGrade());
	}
}