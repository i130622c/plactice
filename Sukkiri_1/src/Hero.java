import java.util.*;

public class Hero extends Character {
	final static int MAX_HP = 1000;
	final static int MAX_MP = 1000;
	private static int money = 10000;

	Hero(String name) {
		super(name, MAX_HP, MAX_MP);
		System.out.println("—EÒ" + getName() + "y HPF" + MAX_HP + ", MPF" + MAX_MP + "z‚ª’a¶‚µ‚½I");
	}

	public void attack(Matango... m) {
		for (Matango i : m) {
			int damage = new Random().nextInt(10);
			i.setHp(i.getHp() - damage * 10);
			System.out.println("‚¨‰»‚¯ƒLƒmƒR" + i.getSuffix() + "‚É" + damage * 10 + "‚Ìƒ_ƒ[ƒWII");
			if (i.getHp() <= 0) {
				System.out.println("‚¨‰»‚¯ƒLƒmƒR" + i.getSuffix() + "‚Í“|‚ê‚½");
			} else
				System.out.println("‚¨‰»‚¯ƒLƒmƒR" + i.getSuffix() + "yHP:" + i.getHp() + "z");
		}

	}

	public void confirmMoney() {
		System.out.println("Œ»İ‚ÌŠ‹à‚Í" + Hero.money + "‰~‚Å‚·");
	}

	public int getMoney() {
		return Hero.money;
	}

	public void setMoney(int money) {
		Hero.money = money;
	}
}
