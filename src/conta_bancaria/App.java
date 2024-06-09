package conta_bancaria;

import java.util.Scanner;
import java.util.List;
public class App {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bank caixa = new Bank("001");
		// C = Create Count;
		// E = Exit
		while(true) {
			System.out.println("O que deseja fazer? C=Create Count, E = Sair do programa");
			String op = scanner.nextLine();
			
			if(op.equals("C")) {
				System.out.println("Digite o seu nome:");
				String name = scanner.nextLine();
				Account account = caixa.generateAccount(name);
				caixa.insertAccount(account);
				
				
				operateAccount(account);
			}else if (op.equals("E")) {
				break;
			} else {
				System.out.println("Comando inválido, tente novamente");
			}
		}
		
		List<Account> accountList = caixa.getAccounts();
		for(Account cc: accountList) {
			System.out.println(cc);
		}
		caixa.outputTotal();
		
		//Account account = new Account("001", "1234", "Usuario1");
				
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
	
	static void operateAccount(Account account) {
		Scanner scanner = new Scanner(System.in);
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
	}

}
