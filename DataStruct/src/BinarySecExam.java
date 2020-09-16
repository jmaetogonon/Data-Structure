import javax.swing.JOptionPane;

public class BinarySecExam {
	

	private static int arr[];
	private static String binary[];
	private static int top;
	private static int capacity;
	
	BinarySecExam(int size)
	{
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	public void push(int y) {
		if (isFull()) {
			JOptionPane.showMessageDialog(null," Stack OverFlow","StackOverflow",JOptionPane.WARNING_MESSAGE);
		}
		else {
			String holdBin="";
			int count=0,a;
			int x=y;
			if (isFull()) {
				JOptionPane.showMessageDialog(null," Stack OverFlow","StackOverflow",JOptionPane.WARNING_MESSAGE);
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
				JOptionPane.showMessageDialog(null,"Inserting " + y + 
						"\n\nBinary Value of "+ y +" : "+ holdBin);
				arr[++top] = y;
			}
		}
	}
	
	public int pop() {
		if (isEmpty()) {
			JOptionPane.showMessageDialog(null," Stack Underflow","StackUnderflow",JOptionPane.WARNING_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null,"Pop " + arr[top] + " was remove from the stack.\n");
			arr[top] = 0;
		}
	return arr[top--];        
	}

	public int peek() {
		if (!isEmpty()) {
			JOptionPane.showMessageDialog(null, "Peek "+ arr[top] + " is at the top of the stack.");
			return arr[top];
		}
		else 
			JOptionPane.showMessageDialog(null," Stack is Empty","Warning",JOptionPane.WARNING_MESSAGE);
			
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
	
	public static void display() {
		decToBin();
		String hold="";
		String temp = "";
		for (int i = 0; i < arr.length; i++) {
			hold+=arr[i]+" | ";
			temp+=binary[i]+" |";
		}
		JOptionPane.showMessageDialog(null,"Elements of Stack: \n\n" +hold + 
				"\n\nElement of Stack in Binary: \n\n" + temp);
	}
	
	public static void decToBin() {
		int n = 0,a = 0;
		binary = new String[arr.length];
		String hold = "";

		for (int i = 0; i < binary.length; i++) {
			n=arr[i];
			if (n==0) {
				binary[i] = " _";
			}
	       else {
	    	   while(n > 0) {        
	           a = n % 2;
	           hold = a + hold;
	           n = n / 2;
	    	   }
	    	   binary[i] = hold;
	    	   hold="";
	       }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String choice = "";
    	int value;
    	int limit;
    	
    	limit = Integer.parseInt(JOptionPane.showInputDialog("Enter limit of stack"));

    	
    	BinarySecExam stack = new BinarySecExam(limit);
    	do {
    		
        	display();
    		choice = JOptionPane.showInputDialog("[1] Push \n"
    				+ "[2] Pop \n"
    				+ "[3] Peek \n"
    				+ "[4] Exit");
    	
    		switch(choice) {
    		
    		case "1": 
    			value = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Value to push"));
    			stack.push(value);
    			break;
    		case "2": 
    			if (!isEmpty()) {
        			stack.pop();
    				} else {
    					JOptionPane.showMessageDialog(null," Stack Underflow","StackUnderflow",JOptionPane.WARNING_MESSAGE);
    				}
    			break;
    		case "3": 
    			stack.peek();
    			break; 
    		case "4": 
    			if(JOptionPane.showConfirmDialog(null, "Do you really want to exit?", "Warning!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
	  					choice = "4";
					}
					else {
					continue;
				}
    			break;
    		default:
					JOptionPane.showMessageDialog(null, "Out of bounds, please try again!", "Stack", JOptionPane.ERROR_MESSAGE);
    		}
    	}
    	while (choice != "4");
         
	}

}
