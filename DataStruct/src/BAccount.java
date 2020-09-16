import java.util.Scanner;

import javax.swing.JOptionPane;

public class BAccount {

	static Scanner console = new Scanner(System.in);
	static float Current_Balance = 0;
    public static void Deposit(float Amount) { Current_Balance = Current_Balance + Amount; }
    public static void Withdraw(float Amount) { Current_Balance = Current_Balance - Amount; }
    public static float Current_Balance() { return Current_Balance; }
	public static boolean equalLimit() { if (Current_Balance == 20000)  return true; else return false;   }
	public static boolean zeroBalance() { if (Current_Balance == 0.00)  return true; else return false;   }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float amount;
		String choice="";
		
		do {
			
			choice = JOptionPane.showInputDialog(null, "Account Balance Maximum Capacity: 20,000 \n"
					+ "Current Balance: " + Current_Balance() + "\n"
					+ "Bank Account Empty: " + zeroBalance() + "\n"
					+ "Bank Accout Full: " + equalLimit() + "\n\n"
							+ "-Menu Options-\n"
							+ "[1] Deposit Amount\n"
							+ "[2] Withdraw Amount\n"
							+ "[3] isFull\n"
							+ "[4] isEmpty\n"
							+ "[5] Exit");
			
			
			
			switch(choice) {
			
				case "1": //DEPOSIT
					amount = Float.parseFloat(JOptionPane.showInputDialog("Current Balance: " + Current_Balance() + "\nEnter Amount to Deposit: "));
				if(amount+Current_Balance() > 20000) {
						JOptionPane.showMessageDialog(null, "Max amount reached.","Sorry",JOptionPane.ERROR_MESSAGE);
					}
				else {
					Deposit(amount);
					JOptionPane.showMessageDialog(null, amount + " has been deposited");
				}
					break;
				
				case "2": //WITHDRAW
					amount = Float.parseFloat(JOptionPane.showInputDialog("Current Balance: " + Current_Balance() + "\nEnter Amount to Withdraw: "));
					if(Current_Balance()-amount < 0) {
							JOptionPane.showMessageDialog(null, "Not enough balance.","Sorry",JOptionPane.ERROR_MESSAGE);
						}
					else {
						Withdraw(amount);
						JOptionPane.showMessageDialog(null, amount + " has been withdraw. ");
					}
					
					break;
				
				case "3": //FULL
					JOptionPane.showMessageDialog(null, "Current Balance is Full?: " + equalLimit());
					break;
				case "4": //EMPTY
					JOptionPane.showMessageDialog(null, "Current Balance is Empty?: " + zeroBalance());
					break;
				
				case "5": //EXIT
					JOptionPane.showMessageDialog(null, "Thank you.");
					choice = "5";
					break;
				default: 
					JOptionPane.showMessageDialog(null, "Out of bounds, please try again!", "OOB", JOptionPane.ERROR_MESSAGE);
			}
			
		} while (choice != "5");
	}

}
