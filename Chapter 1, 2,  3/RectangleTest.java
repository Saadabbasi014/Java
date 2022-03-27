public class RectangleTest{
	public static void main(String [] args){
		Rectangle rect = new Rectangle();
		rect.heigth = 4;
		rect.width = 5;
		System.out.println(rect.calculateArea());
		System.out.print(rect.calculatePerimeter());

	}
}