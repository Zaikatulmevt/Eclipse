package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			return client.TCKimlikNoDogrula(
					Long.parseUnsignedLong(customer.getNationalityId()),
					customer.getFirstName(), 
					customer.getLastName(), 
					customer.getDateOfBirth());
		}catch (RemoteException e) {
			e.printStackTrace();
			return false;
		}
		
		
		
		// TODO Auto-generated method stub
		
	}

}
