package io.java;


class Bird{
	
	Bird() {
		this.rooster = new Rooster();
	}
	public void sing() {
		rooster.sing();
	}
	
	private Rooster rooster;
	
	
}

class Rooster{
	public void sing() {
		System.out.println("Rooster singing");
	}
}

class Duck extends Bird{

	public void sing() {
		System.out.println("Duck singing");
		
	}
	
}



public class PolymorphismTest {
	public static void main(String[] args) {
		Bird duck = new Duck();
		duck.sing();
		
		Bird bird = new Bird();
		bird.sing();
		
	}
}
