import java.util.*;

public class PoisonMatango extends Matango {
	private int poisonAttack = 5;

	public PoisonMatango(String suffix, int hp) {
		super(suffix, hp);
		System.out.println("�������ŃL�m�R" + suffix + "�yHP:" + this.hp + "�z�����ꂽ�I");
	}

	@Override
	public void attack(Character c) {
		super.attack(c);
		int r = new Random().nextInt(5);
		if (r == 0) {
			System.out.println("�������ŃL�m�R" + getSuffix() + "�̍U���͊O�ꂽ�I");
		} else
			System.out.println("�E��" + c.getName() + "��" + r * 10 + "�̃_���[�W��^�����I");
		c.setHp(c.getHp() - r * 10);
		System.out.println("�E��" + c.getName() + "�yHP:" + c.getHp() + ", MP:" + c.getMp() + "�z");

		if (poisonAttack > 0) {
			System.out.println("����ɓł̖E�q���΂�܂����I");
			int attackDamage = (int) (c.getHp() / 5 * 1);
			System.out.println("�E�҂�" + attackDamage + "�̃_���[�W!");
			c.setHp(c.getHp() - attackDamage);
			System.out.println("�E��" + c.getName() + "�yHP:" + c.getHp() + ", MP:" + c.getMp() + "�z");
			this.poisonAttack--;
		}
	}
}
