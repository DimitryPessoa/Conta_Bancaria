package conta_bancaria;

public class App {
	
	public static void main(String[] args) {
				
		// create account (agency, account, name)
        // 		limite the name = 20 character
		Account account = new Account("001", "1234", "Usuario 1");
		
		//Account account2 = new Account("002", "1234", "Usuario 2");
	
		
		// withDraw value
		//  	no more than the total
		boolean succeed = account.withDraw(200.0);
		if(!succeed) {
			System.out.println("saldo insuficiente");
		}
		
		
		// 	deposit
		// inform the user of movement
	}

}
