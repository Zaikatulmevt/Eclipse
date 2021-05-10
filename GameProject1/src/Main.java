import Adapters.MernisServisAdapter;
import Concretes.GameManager;
import Concretes.SaleManager;
import Concretes.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		
		
		
		UserManager userManager = new UserManager(new MernisServisAdapter());
		
		userManager.add(new User(1, "Metehan Melih", " Yapan", "53455377234", 2002));
		
		
		GameManager gameManager = new GameManager();
		
		gameManager.add(new Game(1, "World Of Tanks", 0.0));
		
		SaleManager saleManager = new SaleManager();
		
		saleManager.campaignSale(new Game(1, " need for speed", 10.00), new User(6, "Halil", "Kalay", "11111111111", 2000), new Campaign(5, "Kara Cuma", "Kara Cuma kampanyasý ile tüm ürünlerde yüzde 34 indirim!!!", 34));
		

	}

}
