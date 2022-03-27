import java.util.*;
//import java.util.Collection;
public class Rectangle{
	private int width;
	private int length;
	
	public Rectangle(int width, int length){
		this.width = width;
		this.length = length;
	}
	
	public int getArea(){
		return length*width;
	}
	public String toString()
	{
		return String.format("\nArea of Rectangle :%d%n", getArea());
	}
}

class AreaComparator implements Comparator<Rectangle> {
@Override
	public int compare(Rectangle r1,Rectangle r2){
		
		int areaDifference = r1.getArea() - r2.getArea();

		if (areaDifference != 0){
		// return areaCompare;
		return areaDifference;
		}
	}	
}