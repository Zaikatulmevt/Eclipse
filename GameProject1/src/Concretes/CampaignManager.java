package Concretes;

import Abstracts.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyası başarıyla eklendi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + "kampanyası başarıyla güncellendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + "kampanyası başarıyla kaldırıldı");
		
	}

}
