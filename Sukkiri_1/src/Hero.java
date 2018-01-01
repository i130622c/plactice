import java.util.*;

public class Hero extends Character {
	final static int MAX_HP = 1000;
	final static int MAX_MP = 1000;
	private static int money = 10000;

	Hero(String name) {
		super(name, MAX_HP, MAX_MP);
		System.out.println("�E��" + getName() + "�y HP�F" + MAX_HP + ", MP�F" + MAX_MP + "�z���a�������I");
	}

	public void attack(Matango... m) {
		for (Matango i : m) {
			int damage = new Random().nextInt(10);
			i.setHp(i.getHp() - damage * 10);
			System.out.println("�������L�m�R" + i.getSuffix() + "��" + damage * 10 + "�̃_���[�W�I�I");
			if (i.getHp() <= 0) {
				System.out.println("�������L�m�R" + i.getSuffix() + "�͓|�ꂽ");
			} else
				System.out.println("�������L�m�R" + i.getSuffix() + "�yHP:" + i.getHp() + "�z");
		}

	}

	public void confirmMoney() {
		System.out.println("���݂̏�������" + Hero.money + "�~�ł�");
	}

	public int getMoney() {
		return Hero.money;
	}

	public void setMoney(int money) {
		Hero.money = money;
	}
}
