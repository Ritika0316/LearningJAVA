package project1mainclass;
import shapes.*;
import shapes.circle;
import shapes.square;

public class mainclass123 {

	public static void main(String[] args) {
		square sq=new square(5);
		System.out.println("Area of square :"+sq.area());
		circle c=new circle(4);
		System.out.println("Area of circle :"+c.area());
		

	}

}
