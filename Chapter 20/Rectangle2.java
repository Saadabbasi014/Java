import java.util.*;
public class Rectangle2 implements Comparator<Rectangle2>{
	private int width;
	private int length;
	
	public Rectangle2(int width, int length){
		this.width = width;
		this.length = length;
	}
	
	public int getArea(){
		return length*width;
	}
	
	@Override
	public int compare(Rectangle2 r1,Rectangle2 r2){
		//if(this.area == r.getArea())
		 if(r1.getArea() == r2.getArea())
			return 0;
		//if(this.area > r.getArea())
		 if(r1.getArea() > r2.getArea())
			return 1;
		else
			return -1;
			// return r1.getArea().compareTo(r2.getArea());
	}
	
}