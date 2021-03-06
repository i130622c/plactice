import java.util.*;

public class PoisonMatango extends Matango {
	private int poisonAttack = 5;

	public PoisonMatango(String suffix, int hp) {
		super(suffix, hp);
		System.out.println("お化け毒キノコ" + suffix + "【HP:" + this.hp + "】が現れた！");
	}

	@Override
	public void attack(Character c) {
		super.attack(c);
		int r = new Random().nextInt(5);
		if (r == 0) {
			System.out.println("お化け毒キノコ" + getSuffix() + "の攻撃は外れた！");
		} else
			System.out.println("勇者" + c.getName() + "に" + r * 10 + "のダメージを与えた！");
		c.setHp(c.getHp() - r * 10);
		System.out.println("勇者" + c.getName() + "【HP:" + c.getHp() + ", MP:" + c.getMp() + "】");

		if (poisonAttack > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int attackDamage = (int) (c.getHp() / 5 * 1);
			System.out.println("勇者は" + attackDamage + "のダメージ!");
			c.setHp(c.getHp() - attackDamage);
			System.out.println("勇者" + c.getName() + "【HP:" + c.getHp() + ", MP:" + c.getMp() + "】");
			this.poisonAttack--;
		}
	}
}
