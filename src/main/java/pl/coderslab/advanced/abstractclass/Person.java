package pl.coderslab.advanced.abstractclass;

public class Person implements Comparable<Person> {

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int compareTo(Person person2){
		return this.lastName.compareTo(person2.getLastName());
	}

	String firstName;
	String lastName;

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

	@Override
	public String toString() {
		return "lastName= " + lastName + " firstName, = " + firstName ;
	}
	


}
