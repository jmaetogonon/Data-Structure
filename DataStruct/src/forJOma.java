import java.util.Arrays;

import javax.swing.JOptionPane;

public class forJOma {
	private String[] arr;
    private int top = -1;
    private int capacity;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        forJOma stk = new forJOma(20);

        while (stk.size() < 20) {
            int holder = 0;
            String str = "";

            int decimal = Integer.parseInt(JOptionPane.showInputDialog("Enter Decimal: "));
            holder = decimal;

            ////////////PUSH////////////////////
            JOptionPane.showMessageDialog(null, "Push binary numbers to the stack");

            while ((decimal > 0)) {
                int binary = decimal % 2;
                String r = String.valueOf(binary);
                stk.push(r);

                decimal = decimal / 2;
            }
            //////////////////////
            JOptionPane.showMessageDialog(null, "Stack: " + stk.disp());

//////////////////////////////POP??????????????????????
            JOptionPane.showMessageDialog(null, "Pop binary numbers from the stack in LIFO order");

            while (!(stk.isEmpty())) {
                JOptionPane.showMessageDialog(null,  "Removing " + stk.peek());
                str += (stk.peek());
                stk.pop();
                

            }
            ///////////ELEMENTS
            JOptionPane.showMessageDialog(null, "Decimal: " +holder
            		+"\n\nEquivalent Binary:" +str);

            if (stk.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Stack is empty\n\n " + stk.disp());                
            } else {
                JOptionPane.showMessageDialog(null, "Stack is not empty\n\n ");                
            }

        }

	}

	

    // Constructor to initialize stack
	forJOma(int size) {
        arr = new String[size];
        capacity = size;
        top = top;
        Arrays.fill(arr, " -- ");

    }

    // Utility function to add an element x in the stack
    public void push(String x) {

        if (isFull()) {
        	JOptionPane.showMessageDialog(null, "OverFlow\nProgram Terminated\n");
        }
    	JOptionPane.showMessageDialog(null, "Inserting " +x);
        arr[++top] = x;

    }

    // Utility function to pop top element from the stack
    public String pop() {

        // check for stack underflow
        if (isEmpty()) {
        	JOptionPane.showMessageDialog(null, "Undeflow\nProgram Terminated\n");
            System.exit(1);

        }

     
        arr[top] = " -- ";
        return arr[top--];
    }

    // Utility function to return top element in a stack
    public String peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.exit(1);
        }

        return " -- ";
    }

    // Utility function to return the size of the stack
    public int size() {
        return top + 1;
    }

    // Utility function to check if the stack is empty or not
    public Boolean isEmpty() {

        return top == -1;	// or return size() == 0;
    }

    // Utility function to check if the stack is full or not
    public Boolean isFull() {
        return top == capacity - 1;	// or return size() == capacity;
    }

    public String disp() {     //shows elements of the stack

        String showArray = "";
        int i = 0;
        while (i < arr.length) {
            showArray += ("| " + arr[i]);
            i++;
        }
        return showArray;

    }

}
