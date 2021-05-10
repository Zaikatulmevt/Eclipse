package Entities;

import Abstracts.BaseEntity;

public class Campaign implements BaseEntity {
	
	private int id;
	private String campaignName;
	private String definition;
	private double discount;
	
	
	public Campaign() {
		
	}


	public Campaign(int id, String campaignName, String definition, double discount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.definition = definition;
		this.discount = discount;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}


	public String getDefinition() {
		return definition;
	}


	public void setDefinition(String definition) {
		this.definition = definition;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}
	

}
