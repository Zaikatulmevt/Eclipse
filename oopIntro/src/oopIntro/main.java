package oopIntro;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB RAM");
		
		product1.id = 1;
		product1.detail = "16 GB RAM";
		product1.name = "Lenovo V14";
		product1.unitPrice = 15000;
		
		Product product2 = new Product();
		product2.id = 2;
		product2.detail = "32 GB RAM";
		product2.name = "Lenovo V15";
		product2.unitPrice = 16.000;
		
		Product[] products = {
				product1,
				product2
		};
		
		for (Product product : products) {
			System.out.println(product.name);
		}
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
	}

}
