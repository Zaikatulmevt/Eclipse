package oopIntro;

public class Product {
	
	
	//Constructor
	
	public Product() {
		System.out.println("Ben �al��t�m");
	}
	
	
	
	public Product(int id, String name, double unitPrice, String detail) {
		
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		
		
	}
	
//	public Product
	
	
	
	int id;
	String name;
	double unitPrice;
	String detail;
}


