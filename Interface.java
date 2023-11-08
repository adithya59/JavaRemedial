/***********************************************************************************************
 * Name				:Interface.java
 * Description		:a Java program to create a Animal interface with a method called bark() that takes no arguments and returns void. Create a Dog class that implements Animal and overrides speak() to print "Dog is barking".
 * Author			:Adithya P Binu
 * Version			:1.0
 * Date				:08/11/2023
 * *********************************************************************************************/public class Interface {
public static void main(String args[]) {
		Dog a = new Dog();
		a.speak(); 
	}
}
interface Animal {
	void bark();
	void speak();
}
class Dog implements Animal {
	public void bark() {
		
	}
	public void speak() {
		System.out.println("Bark Bark");
	}
}