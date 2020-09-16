import java.util.Scanner;

public class Lab1stExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console = new Scanner(System.in);
		
		String menu = "",areaMenu,perimeterMenu;
		float pi = (float) 3.1416 ;

		
		while(menu != "3") {
			
			System.out.println("\n[1] Area \n[2] Perimeter \n[3] Exit\n>> ");
			menu = console.next();
			
			if (menu.equals("1")) { //Area
				areaMenu = "";
				while(areaMenu != "4") {
				System.out.println("\n[1] Area of Square \n[2] Area of Rectangle \n[3] Area of circle\n[4] Reset\n>>  ");
				areaMenu = console.next();
					switch(areaMenu) {
					case "1":
						System.out.println("Input sides: ");
						float s = console.nextFloat();
						System.out.println("Sides= " + s);
						System.out.println("Area of Square= " + Square_Area(s) + "\n");
						break;
						
					case "2":
						System.out.println("Enter Length: ");
						float l = console.nextFloat();
						System.out.println("Enter width: ");
						float w = console.nextFloat();
						System.out.println("Length= " + l +"\nWidth= " + w);
						System.out.println("Area of Rectangle = " + Rectangle_Area(l, w));
						break;
						
					case "3":
						System.out.println("Enter Radius: ");
						float r = console.nextFloat();
						System.out.println("Radius= " + r);
						System.out.println("Area of Circle= " + String.format("%.2f",Cirle_Area(pi, r)) + "\n");
						break;
						
					case "4":
						areaMenu = "4";
						break;
							
					default:
						System.out.println("Error! Out of Bounds.");
					}
				} 
			}		
			else if(menu.equals("2")) { //Perimeter
				perimeterMenu = "";
				while(perimeterMenu != "4") {
				System.out.println("\n[1] Perimeter of Square \n[2] Perimeter of Rectangle \n[3] Circumference of circle\n[4] Reset\n>>  ");
				perimeterMenu = console.next();
					switch(perimeterMenu) {
					case "1":
						System.out.println("Input sides: ");
						float s = console.nextFloat();
						System.out.println("Sides= " + s);
						System.out.println("Perimeter of Square= " + Square_Perimeter(s) + "\n");
						break;
						
					case "2":
						System.out.println("Enter Length: ");
						float l = console.nextFloat();
						System.out.println("Enter width: ");
						float w = console.nextFloat();
						System.out.println("Length= " + l +"\nWidth= " + w);
						System.out.println("Perimeter of Rectangle = " + Rectangle_Perimeter(l, w));
						break;
						
					case "3":
						System.out.println("Enter Radius: ");
						float r = console.nextFloat();
						System.out.println("Radius= " + r);
						System.out.println("Circumference of Circle= " + String.format("%.2f",Circle_Perimeter(pi, r)) + "\n");
						break;
						
					case "4":
						areaMenu = "4";
						break;
							
					default:
						System.out.println("Error! Out of Bounds.");
					}
				} 
			}		
			else if(menu.equals("3")) { //Exit
				menu = "3";
				System.out.println("Thank you!");
				System.exit(0);
			}
			else {
				System.out.println("Error! Out of Bounds.");
			}
			
			
			
			
		}
		
	
	}
		public static float Square_Perimeter(float S) { return 4* S; }
		public static float Rectangle_Perimeter(float L, float W) { return 2*L + 2*W; }
		public static float Circle_Perimeter(float Pi, float R) { return 2*Pi*R; }
		public static float Square_Area(float S) { return S*S; }
		public static float Rectangle_Area(float L, float W) { return L*W; }
		public static float Cirle_Area(float Pi, float R) { return Pi*R*R; }
		public float reset() { return (float) 0.0; }


}
