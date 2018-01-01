import java.util.*;

public class PoisonMatango extends Matango {
	private int poisonAttack = 5;

	public PoisonMatango(String suffix, int hp) {
		super(suffix, hp);
		System.out.println("‚¨‰»‚¯“ÅƒLƒmƒR" + suffix + "yHP:" + this.hp + "z‚ªŒ»‚ê‚½I");
	}

	@Override
	public void attack(Character c) {
		super.attack(c);
		int r = new Random().nextInt(5);
		if (r == 0) {
			System.out.println("‚¨‰»‚¯“ÅƒLƒmƒR" + getSuffix() + "‚ÌUŒ‚‚ÍŠO‚ê‚½I");
		} else
			System.out.println("—EÒ" + c.getName() + "‚É" + r * 10 + "‚Ìƒ_ƒ[ƒW‚ğ—^‚¦‚½I");
		c.setHp(c.getHp() - r * 10);
		System.out.println("—EÒ" + c.getName() + "yHP:" + c.getHp() + ", MP:" + c.getMp() + "z");

		if (poisonAttack > 0) {
			System.out.println("‚³‚ç‚É“Å‚Ì–Eq‚ğ‚Î‚ç‚Ü‚¢‚½I");
			int attackDamage = (int) (c.getHp() / 5 * 1);
			System.out.println("—EÒ‚Í" + attackDamage + "‚Ìƒ_ƒ[ƒW!");
			c.setHp(c.getHp() - attackDamage);
			System.out.println("—EÒ" + c.getName() + "yHP:" + c.getHp() + ", MP:" + c.getMp() + "z");
			this.poisonAttack--;
		}
	}
}
