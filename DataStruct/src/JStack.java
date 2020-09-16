import java.util.*;

import javax.swing.JOptionPane;
public class JStack {

	private static String[] StackArray;
	private int stackSize;
	private int topStack =-1;

	JStack(int size){
    stackSize = size;
    StackArray = new String[size];
    Arrays.fill(StackArray, "-1");
   }
	
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
    	String choice = "";
    	String value;

        JStack stack = new JStack(15);
    	do {
    		
        	displayStack();
    		choice = JOptionPane.showInputDialog("[A] Push \n[B] Pop \n[C] Peek \n[D] pushMany \n[E] popAll \n[F] Exit").toLowerCase();
    	
    		switch(choice) {
    		
    		case "a": 
    			value = JOptionPane.showInputDialog(null, "Enter Value to push");
    			stack.push(value);
    			break;
    		case "b": 
    			stack.pop();
    			break;
    		case "c": 
    			stack.peek();
    			break; 
    		case "d": 
    			value = JOptionPane.showInputDialog(null, "Enter values to push. Split by SPACE");
    			stack.pushMany(value);
    			break;
    		case "e": 
    			stack.popAll();
    			break; 
    		case "f": 
    			choice = "f";
    			break;
    		default:
    			JOptionPane.showMessageDialog(null, "Try again.","StackGui",JOptionPane.ERROR_MESSAGE);	
    		}
    	}
    	while (choice != "f");
         }
    
    public static void displayStack(){
    	StringBuilder builder = new StringBuilder(StackArray.length);
    	for (int j=0;j<StackArray.length;builder.append(StackArray[j++])) builder.append("|");{
    		JOptionPane.showMessageDialog(null, builder.toString(), "StackGUI", JOptionPane.INFORMATION_MESSAGE);
    	}
    	
    }
	public void push(String input){ 
		if(topStack < stackSize-1){
			topStack++;
			StackArray[topStack]=input;
		}
		else
			JOptionPane.showMessageDialog(null, "Sorry but the stack is full");
	}
	public String pop(){ 
		if(topStack >= 0){
			JOptionPane.showMessageDialog(null, "Pop "+StackArray[topStack]+" was removed from the stack");
			StackArray[topStack] = "-1";
			return StackArray[topStack--];
       }
		else
		{
        JOptionPane.showMessageDialog(null, "Sorry but the stack is empty");
        return "-1";
		}
	}
    public String peek(){ 
    	if(topStack >= 0) {
        JOptionPane.showMessageDialog(null, "Peek "+StackArray[topStack]+ " is at the top of the stack.");
        return StackArray[topStack];
    	}
    	else {
    		JOptionPane.showMessageDialog(null, "Sorry but the stack is Empty");
    		return "-1";
    	}
    }
    public void pushMany(String MultipleValues){  
    	String[] tempString = MultipleValues.split(" ");
        for(int i = 0; i<tempString.length; i++){
            push(tempString[i]);
        }
    }
        public void popAll() {
            for(int i = topStack; i>=0; i--){
                pop();
            }   
        }
}
