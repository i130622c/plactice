import java.util.*;

public class Hero extends Character {
	final static int MAX_HP = 1000;
	final static int MAX_MP = 1000;
	private static int money = 10000;

	Hero(String name) {
		super(name, MAX_HP, MAX_MP);
		System.out.println("勇者" + getName() + "【 HP：" + MAX_HP + ", MP：" + MAX_MP + "】が誕生した！");
	}

	public void attack(Matango... m) {
		for (Matango i : m) {
			int damage = new Random().nextInt(10);
			i.setHp(i.getHp() - damage * 10);
			System.out.println("お化けキノコ" + i.getSuffix() + "に" + damage * 10 + "のダメージ！！");
			if (i.getHp() <= 0) {
				System.out.println("お化けキノコ" + i.getSuffix() + "は倒れた");
			} else
				System.out.println("お化けキノコ" + i.getSuffix() + "【HP:" + i.getHp() + "】");
		}

	}

	public void confirmMoney() {
		System.out.println("現在の所持金は" + Hero.money + "円です");
	}

	public int getMoney() {
		return Hero.money;
	}

	public void setMoney(int money) {
		Hero.money = money;
	}
}
