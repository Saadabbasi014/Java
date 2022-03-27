public class PrintValues{
	public static void main(String [] args){
		System.out.println("Numbers\t\t\tSquare\t\t\tCube");
		for (int i=1; i<=10; i++){
			System.out.println(i+"\t\t\t\t"+(int)Math.pow(i,2)+"\t\t\t\t"+(int)Math.pow(i,3));
		}
	}
}