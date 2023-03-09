package OOP;

public class Date {
	private int day,month,year;
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date() {
		this.day = 2;
		this.month = 3;
		this.year = 2000;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String newType(int x) {
		if(x < 10) {
			return String.format("0%d",x);
		}
		return String.format("%d",x);
	}
	@Override
	public String toString() {
		return String.format("%s/%s/%d",newType(this.day) , newType(this.month), this.year);
	}
	
	
}
