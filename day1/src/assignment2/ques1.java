package assignment2;
import java.lang.Math;

class NegativeRadius extends Exception{

	private static final long serialVersionUID = 1L;
	NegativeRadius(String msg){
		super(msg);
	}
	
}

class Circle{
	private double radius;
	private String color;
	Circle(){
		radius = 2.0;
		color = "red";
	}
	Circle(double radius) throws NegativeRadius{
			if(radius < 0) {
				throw new NegativeRadius("Cant have negative radius");
			}
			this.radius = radius;
		color = "red";
	}
	Circle(double radius, String color) throws NegativeRadius{
		if(radius < 0) {
			throw new NegativeRadius("Cant have negative radius");
		}
		this.radius = radius;
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	public double getArea() {
		return 2*Math.PI*radius;
	}
}
public class ques1 {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("Radius of first circle " + c1.getRadius());
		Circle c2, c3;
		try {
			c2 = new Circle(-5.0);
			System.out.println("Color of second circle " + c2.getColor());
		} catch (NegativeRadius e) {
			e.printStackTrace();
		}
		try {
			c3 = new Circle(5, "blue");
			System.out.println("Area of first circle " + c3.getArea());
		} catch (NegativeRadius e) {
			e.printStackTrace();
		}
		
	}
}
