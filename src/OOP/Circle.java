package OOP;

public class Circle {
	private double radius;
	public Circle(){
		this.radius = 1.0;
	}
	public Circle(double r) {
		this.radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	public double getCircumference() {
		return 2 * Math.PI * this.radius;
	}
	@Override
	public String toString() {
		return String.format("Circle[radius=%.2f]",this.radius);
	}
}
