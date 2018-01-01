import java.util.*;

public class Cleric extends Character {
	final static int MAX_HP = 1000;
	final static int MAX_MP = 100;

	Cleric(String name, int hp, int mp) {
		super(name, hp, mp);
		System.out.println("�y���O�F" + getName() + ", HP�F" + getHp() + ", MP�F" + getMp() + "�z�̐��E�҂��a�������I");
	}

	public void selfAid(Character... c) {
		System.out.println("���E��" + getName() + "�́u�Z���t�G�C�h�v���������I");
		setMp(getMp() - 10);
		System.out.println("���E��" + getName() + "��MP��10����ꂽ�I(���݂�MP�́u" + getMp() + "�v)");
		for (Character i : c) {
			i.setHp(i.getHp() + 50);
			System.out.println(i.getName() + "��HP��50�񕜂����I");
		}
	}

	public int pray(int sec) {
		System.out.println("���E��" + getName() + "��" + sec + "�b�ԋF�����I");
		int recover = new Random().nextInt(3) + sec;
		setMp(Math.min(MAX_MP, getMp() + recover));
		System.out.println("���E�҂�mp��" + getMp() + "�܂ŉ񕜂���");
		return recover;
	}

}
