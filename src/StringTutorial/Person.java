package StringTutorial;

import java.util.ArrayList;

public class Person {
	private static final Person NULL = null;
	private String id, firstName, lastName, dob, pob, hometown;
	private EGender gender; //m, f, n
	public Person(String id, String lastName, String firstName,
			String dob, String pob, EGender gender, String hometown) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.dob = dob;
		this.pob = pob;
		this.gender = gender;
		this.hometown = hometown;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPob() {
		return pob;
	}
	public void setPob(String pob) {
		this.pob = pob;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public EGender getGender() {
		return gender;
	}
	public void setGender(EGender gender) {
		this.gender = gender;
	}
	public static Person parse(String str) {
		String[] rs = str.split("\\|"); //split la ham thanh vien, dc goi thong qua str
		//neu do dai mang = 7 moi xu ly
		if(rs.length == 7) {
			EGender gender = EGender.parse(rs[5]);
			Person p = new Person(rs[0], rs[2], rs[1], rs[3], rs[4], gender, rs[6]);
			return p;
		}
		return null;
	}
	public static ArrayList<Person> parse(ArrayList<String> ls) {
		ArrayList<Person> rs = new ArrayList<> ();
		for (String str: ls) {
			Person p = Person.parse(str);
			if (p!= NULL) {
				rs.add(p);
			}
			rs.add(Person.parse(str));
			
		}
		return rs;
	}
	@Override
	public String toString() {
		return String.format("Person=[id=%s,FN=%s %s]",id, firstName, lastName);
	}

	
}
