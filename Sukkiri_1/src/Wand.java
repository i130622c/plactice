
public class Wand extends Item {
	private double power;

	public Wand(String name, int price, double power) {
		super(name, price);
		this.power = power;
	}

	public double getPower() {
		return this.power;
	}

}
