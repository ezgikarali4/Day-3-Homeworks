package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		
		//extend etti�imiz i�in array olarak yazabiliyoruz �ocuklar�
		/*
		 * BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(),
		 * new DatabaseLogger(), new ConsoleLogger()}; for (BaseLogger logger: loggers)
		 * { logger.Log("Log mesaj�"); }
		 */
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
	}
	
}
