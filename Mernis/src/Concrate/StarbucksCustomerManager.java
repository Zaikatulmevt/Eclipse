package Concrate;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Adapters.MernisServiceAdapter;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements ICustomerCheckService{
	
	private ICustomerService iCustomerService;
	
	private ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(MernisServiceAdapter mernisServiceAdapter) {
		super();
		this.iCustomerService = (ICustomerService) mernisServiceAdapter;
	}

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void save(Customer customer) {
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			
			System.out.println("Veritabanýna kaydedildi " + customer.getFirstName());
			
		}else{
			System.out.println("Not a valid person");
		}
	}
}
