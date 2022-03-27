

public class Salaah{
	
	private String SalaahName;
	private int [][] grades;
	
	public Salaah(String SalaahName, int[][] grades){
		this.SalaahName = SalaahName;
		this.grades = grades;
	}
	
	public void setSalaahName(String SalaahName){
		this.SalaahName = SalaahName;
	}
	
	public String getSalaahName(){
		return SalaahName;
	}
	
    public void processSalaah(){
		outputGrades();
		
	}
	
	public double getAverage(int[] setOfGrades){
		
		int total = 0; 	
		for(int grades : setOfGrades)
			total += grades;
		return (double)total / setOfGrades.length;
		
	}
	
	
	public void outputGrades(){
		
		System.out.printf("The average of Sallah are : %n%n");
		System.out.print("            ");
		
		//for(int Salaah = 0; Salaah < grades[0].length; Salaah++)
			
			System.out.printf("%s%s%s%s%s","	Fajar","	  Zohar","	    Asar","    Maghrib","	Isha");
		System.out.println("   Average"); 
		
		for(int Numazi = 0; Numazi < grades.length; Numazi++){
			
			System.out.printf("Numazi %2d", Numazi + 1);
			 
			for(int Salaah : grades[Numazi])
				System.out.printf("%10d", Salaah);
			
			double average = getAverage(grades[Numazi]);
			
			System.out.printf("%9.2f%n", average);
		}	
	}	
}