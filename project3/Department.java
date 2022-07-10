package project3;

public class Department{
	int  id;
	String name;
	int quantity;
	
	Department(int id, String name, int quantity){
		this.id= id;
		this.name = name;
		this.quantity = quantity;
	}
	
	public String toString() {
		return "   " + id + "          " + name +"            " + quantity;
	}
	
}

