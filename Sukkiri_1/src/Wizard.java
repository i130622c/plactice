
public class Wizard extends Character {
	private Wand wand;

	Wizard(String name, int hp, int mp, Wand wand) {
		super(name, hp, mp);
		this.wand = wand;
		System.out.println("���@�g��" + getName() + "�yHP�F" + getHp() + ", MP�F" + getMp() + "�z�����ԂɂȂ����I");
		System.out.println("���@�g��" + getName() + "��" + this.getWand().getName() + "��ێ����Ă���");
	}

	public void heal(Hero h) {
		System.out.println("���@�g��" + getName() + "�́u�񕜂̎����v���������I");
		int basePoint = 10;
		int recoverPoint = (int) (basePoint * this.getWand().getPower());
		int acctualRecoverPoint = Math.min(recoverPoint, Hero.MAX_HP - h.getHp());
		h.setHp(h.getHp() + acctualRecoverPoint);
		System.out.println(h.getName() + "��HP��" + recoverPoint + "�񕜂����I");
		System.out.println(h.getName() + "��HP��" + h.getHp() + "�ɂȂ����B");
		System.out.println("�E��" + h.getName() + "�yHP:" + h.getHp() + ", MP:" + h.getMp() + "�z");
	}

	public Wand getWand() {
		return this.wand;
	}

	public void setWand(Wand wand) {
		this.wand = wand;
	}
}
