package Encapsulation;

class Dog{
	
	private String name;
	private int cost;
	private String breed;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Dog() {
		this.name="Sheru";
		this.cost=10000;
		this.breed="German Shephard";
	}
}


public class launceEncapgettersetter {
	public static void main(String [] args) {
		
		Dog d1=new Dog();
		
		d1.setName("Rocky");
		d1.setCost(999);
		d1.setBreed("German Dashen");
		System.out.println("The Dog Name is "+d1.getName()+ " "+", Cost is "+d1.getCost()+" "+" & Dog Breed is "+d1.getBreed());
		Dog d2=new Dog();
		System.out.println(d2.getName() + " " + d2.getCost() + " " + d2.getBreed());
	}

}
