
public class StrongBox<E> {

	private E item;
	private KeyType keyType;
	private int count;

	public StrongBox(KeyType key) {
		this.keyType = key;
		System.out.println("���ɂ𐶐��i���^�C�v�F " + key.getName() + "�j");
	}

	// ���ɓ��ɃA�C�e��������
	public void put(E item) {
		this.item = item;
		System.out.println("���ɂ̒��� " + item + " �����܂���");
	}

	// ���ɂ���A�C�e�������o��
	public E get() {
		count++;
		switch (this.keyType) {
		case PADLOCK:
			if (count < 2)
				return null;
		case BUTTON:
			if (count < 3)
				return null;
		case DIAL:
			if (count < 4)
				return null;
		case FINGER:
			if (count < 5)
				return null;
		}
		count = 0;
		return this.item;
	}
}
