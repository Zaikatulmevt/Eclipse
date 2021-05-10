package Concretes;

import Abstracts.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, User user) {
		System.out.println(game.getGameName() + " oyunu," + game.getUnitPrice() + " TL karþýlýðýnda satýn alýndý");
		
	}

	@Override
	public void campaignSale(Game game, User user, Campaign campaign) {            //Yüzdelik iþlemi yapmaya çalýþýnca hata veriyor sebebini bulamadým  
		System.out.println(user.getFirstName() + game.getGameName() + " oyununu" +game.getUnitPrice()*campaign.getDiscount()/100 +" TL karþýlýðýnda satýn aldý");
		
	}

}
