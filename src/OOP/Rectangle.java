package OOP;

public class Rectangle {
	private double length;
	private double width;
	public Rectangle() {
		super();
		this.length = 1.0;
		this.width = 1.0;
	}
	public Rectangle(double length, double width, String color, boolean filled) {
		super();
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea() {
		return this.length * this.width;
	}
	public double getPerimeter() {
		return (this.length + this.width) * 2;
	}
	@Override
	public String toString() {
		return String.format("Rectangle[%s,width=%.2f,length=%.2f]",this.length, this.width);
	}
	
}
