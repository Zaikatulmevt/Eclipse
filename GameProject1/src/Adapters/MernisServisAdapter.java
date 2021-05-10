package Adapters;

import java.rmi.RemoteException;

import Abstracts.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServisAdapter implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(User user) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			
			return client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getYearOfBirth());
			
		}catch(RemoteException e) {
			e.printStackTrace();
		}
		
		return false;

	}

}
