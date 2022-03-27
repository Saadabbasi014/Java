public class CircleTest{
	public static void main(String [] args){
		Circle c1 = new Circle(5.5);
		Circle c2 = new Circle(6.9);
		System.out.printf("Area %s",c1.getArea());
		System.out.printf("%n");
		System.out.printf("Circumference: %s ",c2.getCircleference());
	}
}