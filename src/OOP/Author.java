package OOP;

public class Author {
	String name, email;
	char gender;
	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return String.format("Author[name=%s, email=%s, gender=%c]", this.name, this.email, this.gender);
	}
	
}
