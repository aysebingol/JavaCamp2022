package polymorphismDemo;

public class CustomerManager {
	//temel nesne
	private BaseLogger logger;
	
	public CustomerManager() {
	}

	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}


	public void add() {
		System.out.println("müþteri eklendi");
		this.logger.log("log mesajý");
		
	}

}
