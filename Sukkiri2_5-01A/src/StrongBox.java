
public class StrongBox<E> {

	private E item;
	private KeyType keyType;
	private int count;

	public StrongBox(KeyType key) {
		this.keyType = key;
		System.out.println("金庫を生成（鍵タイプ： " + key.getName() + "）");
	}

	// 金庫内にアイテムを入れる
	public void put(E item) {
		this.item = item;
		System.out.println("金庫の中に " + item + " を入れました");
	}

	// 金庫からアイテムを取り出す
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
