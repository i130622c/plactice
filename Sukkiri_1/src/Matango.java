
public class Matango extends Monster {
	int hp;

	public Matango(String suffix, int hp) {
		super(suffix);
		this.hp = hp;
	}

	// �U��
	@Override
	public void attack(Character c) {
		StackTraceElement e = new Exception().getStackTrace()[1]; // getStackTrace()���\�b�h
		// ������ĂԂ��Ƃŗ�O�X�^�b�N�g���[�X�̓��e���擾�ł���
		String className = e.getClassName(); // ���\�b�h�̌Ăяo�����N���X�̖��O���擾
		if (className == "PoisonMatango") {
			System.out.println("�������ŃL�m�R" + getSuffix() + "�̍U���I");
		} else {
			System.out.println("�������L�m�R" + getSuffix() + "�̍U���I");
		}

	}

	// ������
	@Override
	public void run() {
		StackTraceElement e = new Exception().getStackTrace()[1]; // getStackTrace()���\�b�h
		// ������ĂԂ��Ƃŗ�O�X�^�b�N�g���[�X�̓��e���擾�ł���
		String className = e.getClassName(); // ���\�b�h�̌Ăяo�����N���X�̖��O���擾
		if (className == "PoisonMatango") {
			System.out.println("�������ŃL�m�R" + getSuffix() + "�͓����o�����I");
		} else {
			System.out.println("�������L�m�R" + getSuffix() + "�͓����o�����I");
		}
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
}
