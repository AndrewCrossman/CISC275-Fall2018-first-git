abstract class Animal implements Comparable<Animal> {
	int legs;
	String name;
	public Animal(String name, int legs){
		this.name=name;
		this.legs=legs;
	}
	public int getLegs(){
		return legs;
	}
	public int compareTo(Animal a){
		return this.legs-a.legs;
	}
	public String toString(){
		return name+" with "+legs+" legs";
	}
}