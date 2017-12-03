package oop;

class Person{
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
		
	}
	void email() {
		System.out.println(email);
		
	}
	void sleep() {
		System.out.println(name + " is sleeping");
		
	}
	
}
public class demo {

	public static void main(String[] args) {
		//Instantiating an object
		Person person1 = new Person();
		
		//Define some properties
		person1.name = "Joe";
		person1.email = "Joe@email.com";
		person1.phone = "51230066323";
		
		//Abstraction
		person1.walk();
		
		person1.sleep();
		
		
	}

}
