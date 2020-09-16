import javax.swing.JOptionPane;

public class Queue {
	
	static int a[];  
	static int i,n,item;
	static int front,rear,count=0;
	 
      public static void main(String args[])  {
  		String ch="";
  		getdata();
  		
  		
  		do {
  			
  			ch = JOptionPane.showInputDialog(null, "Enter Choice: \n\n[A] Enqueue\n[B] Dequeue\n[C] Display\n[D] Destroy\n[E] Exit").toLowerCase();
  				
  			
  			switch(ch) {
  			
  				case "a": 
  					enqueue();
  					break;
  				
  				case "b": 
  					dequeue();
   					break;
  				
  				case "c": 
  					display();
  					break;
  					
  					
  				case "d": 
  					destroy();
  					break;
  					
  				case "f": 
  					JOptionPane.showMessageDialog(null, "Empty?: "+isEmpty());
  					break;
  
  				case "e": 
  					JOptionPane.showMessageDialog(null, "Thank you!");
  					ch = "e";
  					break;
  					
  					
  				default: 
  					JOptionPane.showMessageDialog(null, "Wrong choice.", "A-E only", JOptionPane.ERROR_MESSAGE);
  			}
  			
  		} while (ch != "e"); 
  		
  		}
      static void getdata() {  
    	  
  		try   {  
  			n = Integer.parseInt(JOptionPane.showInputDialog("Enter limit: "));  
  			a=new int[n];  
  		}   
  		catch(Exception e) {
  			JOptionPane.showMessageDialog(null, e.getMessage());
  		}  
  	 }  
  	
  	 static void enqueue() {  
  		 try {  
  			 if(count<n) {  
  				 item = Integer.parseInt(JOptionPane.showInputDialog("Enter data to insert:"));  
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
  		 		JOptionPane.showMessageDialog(null, "Data deleted: "+a[front%n]);
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
  	   String print = "";
  	   if(count==0)  {
  		   JOptionPane.showMessageDialog(null, "Queue is Empty");

  	   }
  	   else     {  
  		   for(i=front;m<count;i++,m++) {
  			  print  += " " + a[i%n];
  		   }
  			   JOptionPane.showMessageDialog(null, "The Elements of Queue are: \n\n" + print);
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
  		  JOptionPane.showMessageDialog(null, "Queue is destroyed");
  	  
  	  }
  	  static boolean isEmpty() {
  		  if(front == 0) {
  			  return true;
  		  }
  		  else {
			return false;
		}
  	  }

}

    
