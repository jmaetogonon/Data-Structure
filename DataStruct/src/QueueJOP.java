import javax.swing.JOptionPane;

public class QueueJOP {
	
	static int a[];  
	static int i;
	static int front=0;
	static int rear=0;
	static int n;
	static int item;
	static int count=0;  
	
	///////////
	static void getdata() {  
		try   {  
			n = Integer.parseInt(JOptionPane.showInputDialog("Enter the limit: "));  
			a=new int[n];  
		}   
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}  
	 }  
	
	 static void enqueue() {  
		 try {  
			 if(count<n) {  
				 item = Integer.parseInt(JOptionPane.showInputDialog("Enter the element to be added:"));  
				 a[rear]=item;  
				 rear++;  
				 count++;  
			 }  
			 else {
				 JOptionPane.showMessageDialog(null, "Queue Overflow");
			 }
			 if(rear==n) { 
			 		rear=rear%n;  
			 	}
		 }  
		 catch(Exception e) {  
			 JOptionPane.showMessageDialog(null, e.getMessage());
	  		}  
	  	}  
	 static void dequeue() {  
		 	if(count!=0) {  
		 		JOptionPane.showMessageDialog(null, "The item deleted is: "+a[front%n]);
		 		front++;  
		 		count--;  
		 	}  
		 	else {
		 		JOptionPane.showMessageDialog(null, "Queue Underflow");
		 	}
		 	if(rear==n) { 
		 		rear=rear%n;  
		 	}
	  }  

	  static void display()    {  
	   int m=0;  
	   String disp = "";
	   if(count==0)  {
		   JOptionPane.showMessageDialog(null, "Sorry, Queue is Empty");

	   }
	   else     {  
		   for(i=front;m<count;i++,m++) {
			  disp  += " " + a[i%n];
		   }
			   JOptionPane.showMessageDialog(null, "Elements of Queue : \n\n" + disp);
	   }  
	  }
	  static void destroy() {
		  while(count!=0) {
			  front++;  
		 		count--;  
		  }
		  if(rear==n)  {
		 		rear=rear%n;  
		  } 
		  JOptionPane.showMessageDialog(null, "Queue Destroyed!");
	  
	  }

	   
     
      public static void main(String args[])  {
    	  ///////////////////MAIN METHOD //////////////////////////
  		String choice="";
  		
  		getdata();
  		do {
  			
  			choice = JOptionPane.showInputDialog(null, "-Menu Options-\n"
  							+ "[1] Enqueue\n"
  							+ "[2] Dequeue\n"
  							+ "[3] Display\n"
  							+ "[4] Destroy\n"
  							+ "[5] Exit");
  			
  			switch(choice) {
  			
  				case "1": //ENQUEUE
  					enqueue();
  					break;
  				
  				case "2": //DEQUEUE
  					dequeue();
   					break;
  				
  				case "3": //DISPLAY
  					display();
  					break;
  					
  				case "4": //DISPLAY
  					destroy();
  					break;
  
  				case "5": //EXIT
  					if(JOptionPane.showConfirmDialog(null, "Do you really want to exit?", "Warning!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
  	  					choice = "5";
  					}
  					else {
						continue;
					}
  					break;
  				default: 
  					JOptionPane.showMessageDialog(null, "Out of bounds, please try again!", "OOB", JOptionPane.ERROR_MESSAGE);
  			}
  			
  		} while (choice != "5"); 
  		}//end main
}//end CircularQueue

    
