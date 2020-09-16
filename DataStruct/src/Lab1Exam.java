import javax.swing.JOptionPane;

public class Lab1Exam {
	
	//perimeter
	public static float Square_Perimeter(float S) { return 4* S; }
	public static float Rectangle_Perimeter(float L, float W) { return 2*L + 2*W; }
	public static float Circle_Perimeter(float Pi, float R) { return 2*Pi*R; }
	//Area
	public static float Square_Area(float S) { return S*S; }
	public static float Rectangle_Area(float L, float W) { return L*W; }
	public static float Cirle_Area(float Pi, float R) { return Pi*R*R; }
	//reset
	public float reset() { return (float) 0.0; }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String areaMenu, mainMenu= "", periMenu;
		 
		 while(mainMenu != "3") { //MAin Menu
			 mainMenu = JOptionPane.showInputDialog("[1] Area \n"
			 		+ "[2] Perimeter \n"
			 		+ "[3] Exit");
			 switch(mainMenu) { 
			 
			 case "1": //AREA MENU
				 areaMenu ="";
				 while(areaMenu != "4") {
					 areaMenu = JOptionPane.showInputDialog("[1] Area of Square \n"
					 		+ "[2] Area of Rectangle\n"
					 		+ "[3] Area of Circle \n"
					 		+ "[4] Reset");
					 switch(areaMenu) {
					 case "1": //SQUARE
						float s = Float.parseFloat(JOptionPane.showInputDialog("Enter the number of sides"));
						JOptionPane.showMessageDialog(null, "Sides= " + s + ". \nArea = " + Square_Area(s),"Area of Square",JOptionPane.INFORMATION_MESSAGE);
						break;
						
					 case "2": //RECTANGLE
							float l = Float.parseFloat(JOptionPane.showInputDialog("Enter length"));
							float w = Float.parseFloat(JOptionPane.showInputDialog("Enter width"));
							JOptionPane.showMessageDialog(null, "Length = " + l + " , Width = " + w + " \nArea = " + Rectangle_Area(l, w), "Area of Rectangle",JOptionPane.INFORMATION_MESSAGE);
							break;
							
					 case "3": //CIRCLE
							float r = Float.parseFloat(JOptionPane.showInputDialog("Enter radius"));
							float pi = (float) 3.1416 ;
						 	JOptionPane.showMessageDialog(null, String.format("Radius = " + r + " \nArea = %.2f", Cirle_Area(pi, r)), "Area of Circle",JOptionPane.INFORMATION_MESSAGE);
							break;
					
					 case "4": //Back to MainMenu
						 	areaMenu = "4";
						 	break;
					 default:
							JOptionPane.showMessageDialog(null, "Out of bounds, please try again!", "OOB", JOptionPane.ERROR_MESSAGE);
					 }
				 }
				 break;
				 
			 case "2": //PERIMETEEEEEEEEEER
				 periMenu ="";
				 while(periMenu != "4") {
				 periMenu = JOptionPane.showInputDialog("[1] Perimeter of Square \n"
				 		+ "[2] Perimeter of Rectangle \n"
				 		+ "[3] Circumference of Circle \n"
				 		+ "[4] Reset");
				 	switch (periMenu) {
				 		case "1": //SQUARE
							float s = Float.parseFloat(JOptionPane.showInputDialog("Enter the number of sides"));
							JOptionPane.showMessageDialog(null, "Sides= " + s + ". \nPerimeter = " + Square_Perimeter(s),"Perimeter of Square",JOptionPane.INFORMATION_MESSAGE);
				 			break;
				 			
				 		case "2": //RECTANGLE
				 			float l = Float.parseFloat(JOptionPane.showInputDialog("Enter length"));
							float w = Float.parseFloat(JOptionPane.showInputDialog("Enter width"));
							JOptionPane.showMessageDialog(null, "Length = " + l + " , Width = " + w + " \nPerimeter = " + Rectangle_Perimeter(l, w), "Perimeter of Rectangle",JOptionPane.INFORMATION_MESSAGE);
				 			break;
				 			
				 		case "3": //CIRCLEE
				 			float r = Float.parseFloat(JOptionPane.showInputDialog("Enter radius"));
							float pi = (float) 3.1416 ;
							JOptionPane.showMessageDialog(null, "Radius = " + r + " \nCircumference = " + String.format("%.2f",Circle_Perimeter(pi, r)), "Circumference of Circle",JOptionPane.INFORMATION_MESSAGE);
						 	break;
						 	
				 		case "4": //Back to MainMenu
						 	periMenu = "4";
						 	break;
				 		default:
				 			JOptionPane.showMessageDialog(null, "Out of bounds, please try again!", "OOB", JOptionPane.ERROR_MESSAGE);
				 	}
				 }
				 break;
				 
			 case "3": //EXIT
				 mainMenu = "3";
				 break;
		 	 	default:
		 	 		JOptionPane.showMessageDialog(null, "Out of bounds, please try again.","OOB",JOptionPane.ERROR_MESSAGE);
			 }
		 } 
	}

}
