import java.rmi.RemoteException;
import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrate.NeroCustomerManager;
import Concrate.StarbucksCustomerManager;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method
		
		
		Customer customer = new Customer(1, "Metehan Melih", "Yapan", 2002, "53455377234");
		
		
		
		
		BaseCustomerManager customerManager = new  NeroCustomerManager();
		customerManager.save(customer);
		
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager2.save(new Customer(1, "Metehan Melih", "Yapan", 2002, "53455377234"));

	}

}
 