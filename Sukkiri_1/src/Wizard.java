
public class Wizard extends Character {
	private Wand wand;

	Wizard(String name, int hp, int mp, Wand wand) {
		super(name, hp, mp);
		this.wand = wand;
		System.out.println("魔法使い" + getName() + "【HP：" + getHp() + ", MP：" + getMp() + "】が仲間になった！");
		System.out.println("魔法使い" + getName() + "は" + this.getWand().getName() + "を保持している");
	}

	public void heal(Hero h) {
		System.out.println("魔法使い" + getName() + "は「回復の呪文」を唱えた！");
		int basePoint = 10;
		int recoverPoint = (int) (basePoint * this.getWand().getPower());
		int acctualRecoverPoint = Math.min(recoverPoint, Hero.MAX_HP - h.getHp());
		h.setHp(h.getHp() + acctualRecoverPoint);
		System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した！");
		System.out.println(h.getName() + "のHPは" + h.getHp() + "になった。");
		System.out.println("勇者" + h.getName() + "【HP:" + h.getHp() + ", MP:" + h.getMp() + "】");
	}

	public Wand getWand() {
		return this.wand;
	}

	public void setWand(Wand wand) {
		this.wand = wand;
	}
}
