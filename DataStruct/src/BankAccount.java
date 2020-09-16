import java.util.Scanner;

public class BankAccount {
	
    static Scanner console = new Scanner(System.in);
	static float Current_Balance = 0;
	static float amount;
    public static void Deposit(float Amount) {  Current_Balance = Current_Balance + Amount;   }
    public static void Withdraw(float Amount) {  Current_Balance = Current_Balance - Amount;   }
    public static float Current_Balance() { return Current_Balance; }
	public static boolean equalLimit() {  if (Current_Balance == 50000)   return true;   else return false;   }
	public static boolean zeroBalance() {  if (Current_Balance == 0.00)   return true;   else return false;   }


    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String choice= "";
		
		do {
			
			System.out.println("Account Balance Maximum Capacity: 50,000 \n"
					+ "Current Balance: " + Current_Balance() + "\n"
					+ "Bank Account Empty : " + zeroBalance() + "\n"
					+ "Back Account Full: " + equalLimit() + "\n\n");
			
			System.out.println("MENJU OPTIONS\n"
					+ "[1] Deposit\n"
					+ "[2] Withdraw\n"
					+ "[3] Exit");
			System.out.print(">> ");
			choice = console.next();
			
			switch (choice) {
			case "1":
				System.out.println("Current Balance: " + Current_Balance() + "\n"
						+ "How much will you deposit?");
				System.out.print(">> ");
				amount = console.nextFloat();
				if (amount+Current_Balance > 50000) {
					System.out.println("Amount Exceed\n");
				}
				else {
					Deposit(amount);
				}
				break;

			case "2":
				System.out.println("Current Balance: " + Current_Balance() + "\n"
						+ "How much will you withdraw?");
				System.out.print(">> ");
				amount = console.nextFloat();
				if (Current_Balance-amount < 0) {
					System.out.println("Not enough balance\n");
				}
				else {
					Withdraw(amount);
				}
				break;
				
			case "3":
				System.out.println("Bye");
				System.exit(0);
				break;
			
			}
			
		} while (choice != "3");

		
		
	}

} 
