package Exercise4;

public class PencilCase {
	
	private String brand, material;
	private double ratings;
	
	public PencilCase(String b, String m, double r) {
		brand=b;
		material=m;
		ratings=r;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public double  getRatings() {
		return ratings;
	}
	
	public String toString() {
		return "Brand\t\t\t\t: " + brand + "\nMaterial\t\t\t: " + material + "\nRatings\t\t\t\t: " + ratings + " ratings";
	}
}
