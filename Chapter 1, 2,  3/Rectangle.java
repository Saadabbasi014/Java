public class Rectangle{
	double heigth;
	double width;
	
	double calculateArea(){
	double area = heigth * width;
		return area;
	}
	
	double calculatePerimeter(){
		double perimeter = 2*(heigth + width);
		return perimeter;
	}
}