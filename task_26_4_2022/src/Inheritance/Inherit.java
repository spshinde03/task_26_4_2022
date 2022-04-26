package Inheritance;

class Fruit {
	String name;

	public void eat() {
		System.out.println("Mango is fav fruit");
	}
}

// inherit from Fruit
class Abc extends Fruit {

	// new method in subclass
	public void display() {
		System.out.println("My name is " + name);
	}
}

class Inherit {
	public static void main(String[] args) {
		Abc la = new Abc();
		la.name = "Prajakta";
		la.display();
		la.eat();

	}
}