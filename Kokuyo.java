package Exercise4;
import java.util.Scanner;
public class Kokuyo extends PencilCase{ // Kokuyo sub class 
					// PencilCase super class
	
	private String color;
	private double price, dimensions;
	
	Scanner in = new Scanner(System.in);
	
	public Kokuyo(String b, String m, double r) {
		super(b, m, r);
		System.out.print("Please enter the color\t\t: ");
		color = in.nextLine();
		System.out.print("Please enter the price(dollars)\t: " );
		price = in.nextDouble();
		System.out.print("Enter the dimensions(inches)\t: ");
		dimensions = in.nextDouble();
	}
	
	public String getColor() {
		return color;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getDimensions() {
		return dimensions;
	}

		public String toString() {
			return super.toString() + "\nColor\t\t\t\t: " + color + "\nPrice\t\t\t\t: " + price + " dollars" + "\nDimensions\t\t\t: " + dimensions + "inches";
	}
}
