package Abstracts;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public interface SaleService {
	
	void sale(Game game, User user);
	void campaignSale(Game game, User user, Campaign campaign);

}
