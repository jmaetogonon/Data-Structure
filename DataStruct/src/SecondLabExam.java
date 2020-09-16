import javax.swing.JOptionPane;

public class SecondLabExam {
	

	private static int arr[];
	private static int top;
	private static int capacity;
	private static String bin[];
	public static void displayData() {
		decToBin();
		String hold="";
		String temp = "";
		for (int i = 0; i < arr.length; i++) {
			hold+=arr[i]+" | ";
			temp+=bin[i]+" | ";
		}
		JOptionPane.showMessageDialog(null,"Stack: \n" +hold + "\n\nBinary Equivalent:\n" + temp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String menuChoice = "";
    	int input, limit;
    	 
    		try   {  
    			limit = Integer.parseInt(JOptionPane.showInputDialog("Enter the limit: "));  
    			arr=new int[limit];  
    			capacity = limit;
    			top = -1;
    		}   
    		catch(Exception e) {
    			JOptionPane.showMessageDialog(null, e.getMessage());
    		}  
    	
    	do {
    		
        	displayData();
        	
        	
    		menuChoice = JOptionPane.showInputDialog("Menu:\n[A] - Push \n[B] - Pop \n[C] - Peek \n[D] - Exit").toLowerCase();
    	
    		
    		switch(menuChoice) {
    		case "a": 
    			input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Value to push"));
    			push(input);
    			break;
    		case "b": 
    			if (!isEmpty()) {
        			pop();
    				} else {
    					JOptionPane.showMessageDialog(null, "Warning! Stack Underflow.");
    				}
    			break;
    		case "c": 
    			peek();
    			break; 
    		case "d": 
	  			menuChoice = "d";
    			break;
    			default:
					JOptionPane.showMessageDialog(null, "Try Again", "Wrong choice", JOptionPane.ERROR_MESSAGE);
    		}
    	}
    	while (menuChoice != "d");
	}
	public static void push(int input) {
		if (isFull()) {
			JOptionPane.showMessageDialog(null,"Warning! Stack OverFlow");
		}
		else {
			String holdBin="";
			int count=0,a;
			int x=input;
			if (isFull()) {
				JOptionPane.showMessageDialog(null,"Warning! Stack OverFlow");
			}
			else {
				while( x > 0) {
					a = x%2;
					if(a ==1) {
						count++;
					}
					holdBin = a + "" +holdBin;
					x=x/2;
				}
				JOptionPane.showMessageDialog(null,"INSERTING\n\nDecimal: " + input + "\nBinary: "+ holdBin);
				arr[++top] = input;
			}
		}
	}
	public static int pop() {
		if (isEmpty()) {
			JOptionPane.showMessageDialog(null,"Warning! Stack UnderFlow");
		}
		else {
			JOptionPane.showMessageDialog(null,"Pop " + arr[top] + " was remove from the stack.");
			arr[top] = 0;
		}
	return arr[top--];        
	}
	public static int peek() {
		if (!isEmpty()) {
			JOptionPane.showMessageDialog(null, "Peek :"+ arr[top]);
			return arr[top];
		}
		else 
			JOptionPane.showMessageDialog(null, "No peek. Stack is Empty");
	return -1;
	}
	public static int size() {
		return top + 1;
	}
	public static Boolean isEmpty() {
		return top == -1; 
	}
	public static Boolean isFull() {
		return top == capacity - 1; 
	}
	public static void decToBin() {
		int n = 0,a = 0;
		bin = new String[arr.length];
		String hold = "";
		for (int i = 0; i < bin.length; i++) {
			n=arr[i];
			if (n==0) {
				bin[i] = "0";
			}
	       else {
	    	   while(n > 0) {        
	           a = n % 2;
	           hold = a + hold;
	           n = n / 2;
	    	   }
	    	   bin[i] = hold;
	    	   hold="";
	       }
		}
	}
}
