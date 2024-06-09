package conta_bancaria;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Account account = new Account("001", "1234", "Usuario1");
		// D = Deposit
		// W = withDraw
		// E = exit
		while(true) {
			System.out.println("O que deseja fazer? D =Deposit, W=withDraw, E = exit");			
			String op = scanner.nextLine();
			
			if(op.equals("D")) {
				System.out.println("Qual valor deseja depositar?");
				double value = scanner.nextDouble();
				account.deposit(value);
			} else if(op.equals("W")) {
				System.out.println("Qual valor deseja sacar?");
				double value = scanner.nextDouble();
				if(!account.withDraw(value)) {
					System.out.println("Ops! Não foi possível sacar o valor R$" + value);
				}
			}else if (op.equals("E")) {
				break;
			} else {
				System.out.println("Comando inválido, tente novamente.");
			}
			scanner = new Scanner(System.in);
		}
		
		// Deposit, withDraw, out
		
		
		
		// Abaixo temos uma primeira versao que irei apenas comentar
		// create account (agency, account, name)
        // 		limite the name = 20 character
		
		
		//Account account2 = new Account("002", "1234", "Usuario 2");
	
		
		// withDraw value
		//  	no more than the total
		//boolean succeed = account.withDraw(200.0);
		//if(!succeed) {
		//	System.out.println("saldo insuficiente");
		//}
		
		//	 	deposit
		
		
		//account.deposit(100.0);
		//account.deposit(50.0);
		//account.deposit(100.0);
				
		//if (!account.withDraw(200.00)) {
		//	System.out.println("saldo insuficiente");
		//} 
		
		//if (!account.withDraw(200.00)) {
		//	System.out.println("saldo insuficiente");
		//} 
		
		// inform the user of movement
		//System.out.println(account);
				
		
	}

}
