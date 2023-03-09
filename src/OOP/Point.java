package OOP;
import java.lang.Math;
public class Point {
	private int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	//overloading: cung ten khac tham so
	//overwriting: cung ten cung tham so
	public Point() {
		x = 0;
		y = 0;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//Ham khoi tao sao chep
	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	/**
	 * Khoang cach toi goc toa do O(0,0)
	 * @return Khoang cach d(P,O)
	 */
	public double Distance() {
		return Math.sqrt(x*x + y*y);
	}
	/**
	 * Khoang cach toi diem P(x,y)
	 * @param p Toa do P
	 * @return Khoang cach  d(Q,P)
	 */
	public double Distance2(Point p) {
		return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
	}
	public static double Distance3(Point a, Point b) {
//		return Math.sqrt(Math.pow(a.x-b.x, 2) + Math.pow(a.y-b.y, 2));
		return a.Distance2(b);
	}
	@Override
	public String toString() {
		return String.format("(%d,%d)", x, y);
	}
}
