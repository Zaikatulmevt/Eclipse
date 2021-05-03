package oopIntro;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB RAM", 10, 13500);
	 

		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB RAM");
		product2.setDiscount(10);
		product2.setUnitPrice(16.000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		

		
		
	}

}
