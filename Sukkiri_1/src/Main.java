import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scan = new Scanner(System.in);

		System.out.println("�E�҂̖��O����͂��ĉ�����");
		String heroName = scan.nextLine();
		Hero h1 = new Hero(heroName);

		System.out.println("�ꏏ�ɖ`�������閂�@�g���̖��O����͂��Ă�������");
		String wizardName = scan.nextLine();
		Wand w1 = new Wand("���@�̏�", 1000, 500);
		Wizard wizard = new Wizard(wizardName, 700, 700, w1);

		System.out.println("�ꏏ�ɖ`�������鐹�E�҂̖��O����͂��Ă�������");
		String clericName = scan.nextLine();
		Cleric c1 = new Cleric(clericName, 1000, 100);

		System.out.println("���̃����o�[�Ńp�[�e�B�[��g��ł���낵���ł����H");
		String stop1 = scan.nextLine();

		Matango[] monsters = new Matango[3];
		monsters[0] = new PoisonMatango("A", 200);
		monsters[1] = new PoisonMatango("B", 190);
		monsters[2] = new PoisonMatango("C", 180);
		String stop2 = scan.nextLine();
		h1.attack(monsters[0], monsters[1], monsters[2]);

		String stop3 = scan.nextLine();
		for (Matango i : monsters) {
			i.attack(h1);
		}
		h1.attack(monsters[0], monsters[1], monsters[2]);
		String stop4 = scan.nextLine();
		h1.attack(monsters[0], monsters[1], monsters[2]);
		String stop5 = scan.nextLine();
		h1.attack(monsters[0], monsters[1], monsters[2]);
		String stop6 = scan.nextLine();
		h1.attack(monsters[0], monsters[1], monsters[2]);
		String stop7 = scan.nextLine();
		h1.attack(monsters[0], monsters[1], monsters[2]);
	}

}
