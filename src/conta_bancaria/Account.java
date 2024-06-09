package conta_bancaria;

public class Account {
	
	private static final int MAX_LENGTH = 20;
	
	private String ag;
	private String cc;
	private String name;
	
	private double balance;
	
	private Log logger;
	
	public Account(String ag, String cc, String name) {
		this.ag = ag;
		this.cc = cc;
		setName(name);
		logger = new Log();
	}

	public void setName(String name) {
		if(name.length() > MAX_LENGTH) {
			this.name = name.substring(0, MAX_LENGTH);
		} else {
			this.name=name;
		}
		//System.out.println(this.name);
	}
	// deposit
	public void deposit(double value) {
		balance = balance + value;
		logger.out("DEPOSITO - R$"+ value + " Saldo total é de R$" + balance);
	}
	
	// withDraw
	public boolean withDraw(double value) {
		if (balance < value) {
			logger.out("SAQUE - R$" + value +  " Seu saldo atual é de R$" + balance);
			return false;
		} 
		balance = balance - value;
		logger.out("SAQUE - R$" + value + " Saldo total é de R$" + balance);
		return true;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	@Override
	public String toString() {
		return "A conta " + this.name + " " + this.ag + "/" + this.cc + " possui: R$" + balance;
		
	}
	
	
}
