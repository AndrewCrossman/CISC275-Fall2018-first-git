abstract class Animal{
	int legs;
	String name;
	public Animal(String name, int legs){
		this.name=name;
		this.legs=legs;
	}
	public int getLegs(){
		return legs;
	}
}