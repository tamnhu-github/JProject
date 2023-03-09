package OOP;

public class Employee {
	int id;
	String firstName;
	String lastName;
	int salary;
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public String getName() {
		return String.format("%s %s", firstName, lastName);
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAnnualSalary() {
		return this.salary * 12;
	}
	public int raiseSalary(int percent) {
//		int raise = salary * percent / 100;
		return this.salary*(100+percent)/100;
	}
	@Override
	public String toString() {
		return String.format("Employee[id=%d,name=%s,salary=%d",id,getName(),getSalary());
	}
}
