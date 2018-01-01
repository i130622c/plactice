
public class Sword extends Item {
	private int power;

	public Sword(String name, int price, int power) {
		super(name, power);
		this.power = power;
	}

	public int getPower() {
		return this.power;
	}
}
