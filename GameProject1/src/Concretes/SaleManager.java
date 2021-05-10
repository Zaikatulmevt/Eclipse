package Concretes;

import Abstracts.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, User user) {
		System.out.println(game.getGameName() + " oyunu," + game.getUnitPrice() + " TL kar��l���nda sat�n al�nd�");
		
	}

	@Override
	public void campaignSale(Game game, User user, Campaign campaign) {            //Y�zdelik i�lemi yapmaya �al���nca hata veriyor sebebini bulamad�m  
		System.out.println(user.getFirstName() + game.getGameName() + " oyununu" +game.getUnitPrice()*campaign.getDiscount()/100 +" TL kar��l���nda sat�n ald�");
		
	}

}
