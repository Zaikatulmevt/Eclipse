
public class LogOperations {
	
	public void add(UserManager manager, User user, Logger logger) {
		
		System.out.println("Loglan�yor");
		
		manager.log�n(user);
		logger.log();
		System.out.println("--------");
		
	}
	
	
    public void add(UserManager manager, Student user, Logger logger) {
		
		System.out.println("Loglan�yor");
		
		manager.Update(user);
		logger.log();
		System.out.println("--------");
		
	}
    
    public void add(UserManager manager, Instructor user, Logger logger) {
		
		System.out.println("Loglan�yor");
		
		manager.Update(user);
		logger.log();
		System.out.println("--------");
		
	}
    public void update(UserManager manager, User user, Logger logger) {
		
		System.out.println("Loglan�yor");
		
		manager.Update(user);
		logger.log();
		System.out.println("--------");
		
	}
    public void update(UserManager manager, Instructor user, Logger logger) {
		
		System.out.println("Loglan�yor");
		
		manager.Update(user);
		logger.log();
		System.out.println("--------");
		
	}
    
    public void update(UserManager manager, Student user, Logger logger) {
		
		System.out.println("Loglan�yor");
		
		manager.Update(user);
		logger.log();
		System.out.println("--------");
		
	}
	
	

}
