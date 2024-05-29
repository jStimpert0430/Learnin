package javaClassesRefresher;

public class HumanClass {
	//member variables
	private String name;
	private int age;
	
	//Default Constructor
	public HumanClass(){
		name = "";
		age = 0;
	}
	//Full arg constructor
	public HumanClass(String newName, int newAge){
		name = newName;
		age = newAge;
	}
	//Mutator methods
	public void SetAge(int newAge){
		if(newAge > 0)
			age = newAge;
		else 
			age = 0;
	}
	
	public void SetName(String newName){
		name = newName;
	}
	
	//accessor methods
	public int GetAge(){
		return age;
	}
	
	public String GetName(){
		return name;
	}
	
	//Custom methods
	public void Birthday(){
		System.out.println("I am " + name + " and my birthday is today. Previously I was " + age + " years old");
		age++;
		System.out.println("Now I am " + age + "years old! Happy birthday!");
	}
	
	//toString overload
	public String toString(){
		return "Hello! I am a human and my name is " + name + " and I am " + age + "years old.";
	}
	
	
}
