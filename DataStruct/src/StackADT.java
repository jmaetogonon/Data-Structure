import java.util.*;

import javax.swing.JOptionPane;
public class StackADT {

	private static String[] StackArray;
	private int stackSize;
	private int topStack =-1;

	StackADT(int size){
    stackSize = size;
    StackArray = new String[size];
    Arrays.fill(StackArray, "-1");
   }
	
	public static void displayStack(){     //for(int i = 0; i<stackSize; i++){
    	StringBuilder builder = new StringBuilder(StackArray.length);
    	for (int j=0;j<StackArray.length;builder.append(StackArray[j++])) builder.append("|");{
    		JOptionPane.showMessageDialog(null, builder.toString(), "StackGUI", JOptionPane.INFORMATION_MESSAGE);
    	}
    	
    }
	public void push(String input){ 	//insert or push data into a stack

		if(topStack < stackSize-1){
			topStack++;
			StackArray[topStack]=input;
		}
		else
			JOptionPane.showMessageDialog(null, "Sorry but the stack is full");
        //System.out.println("Sorry but the stack is full"); 
	}

	public String pop(){ 	//pop or remove data from a stack
		if(topStack >= 0){
			JOptionPane.showMessageDialog(null, "Pop "+StackArray[topStack]+" was removed from the stack");
			//System.out.println("\nPop "+ StackArray[topStack]+ " was remove from the stack.\n");
			StackArray[topStack] = "-1";
			return StackArray[topStack--];
       }
		else
		{
        JOptionPane.showMessageDialog(null, "Sorry but the stack is empty");
        //System.out.println("Sorry but the stack is empty.");
        return "-1";
		}
	}
    
    public String peek(){     //display the top element in a stack
    	if(topStack >= 0) {
        JOptionPane.showMessageDialog(null, "Peek "+StackArray[topStack]+ " is at the top of the stack.");
       // System.out.println("Peek "+ StackArray[topStack]+ " is at the top of the stack.");
        return StackArray[topStack];
    	}
    	else {
    		JOptionPane.showMessageDialog(null, "Sorry but the stack is Empty");
    		return "-1";
    	}
    }

    public void pushMany(String MultipleValues){     //push several data into a stack
        String[] tempString = MultipleValues.split(" ");
        for(int i = 0; i<tempString.length; i++){
            push(tempString[i]);
          
        }
    }
        public void popAll(){         //remove all elements in a stack
            for(int i = topStack; i>=0; i--){
                pop();
               
            }   
        }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
    	String menu = "";
    	String input;

        StackADT stack = new StackADT(10);
    	do {
    		
        	displayStack();
    		menu = JOptionPane.showInputDialog("---Menu---\n"
    				+ "[1] Push \n"
    				+ "[2] Pop \n"
    				+ "[3] Peek \n"
    				+ "[4] pushMany \n"
    				+ "[5] popAll \n"
    				+ "[6] Exit");
    	
    		switch(menu) {
    		
    		case "1": //PUSH
    			input = JOptionPane.showInputDialog(null, "Enter Value to push");
    			stack.push(input);
    			
    			break;
    			
    		case "2": //POP
    			stack.pop();
    			break;
    			
    		case "3": //peek
    			stack.peek();
    			break; 
    			
    		case "4": //Pushmany
    			input = JOptionPane.showInputDialog(null, "Enter Values to push.\nSeparated by SPACE");
    			stack.pushMany(input);
    			break;
    			
    		case "5": //popall
    			stack.popAll();
    			break; 
    			
    		case "6": //exit
    			if(JOptionPane.showConfirmDialog(null, "Do you really want to exit?", "Y/N", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {    				 
        			menu = "6";
		}
    			break;
    		
    		default:
    			JOptionPane.showMessageDialog(null, "Out of bounds. Try again.","StackGui",JOptionPane.ERROR_MESSAGE);	
    		}
    	}
    	while (menu != "6");
         }
}
