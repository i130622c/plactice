import java.util.*;

public class Cleric {

	private String name;
	private int hp;
	final int MAX_HP = 50;
	private int mp;
	final int MAX_MP = 10;

	Cleric() {
		this.hp = this.MAX_HP;
		this.mp = this.MAX_MP;

	}

	public void selfAid() {
		System.out.println("���E�҂̓Z���t�G�C�h���������I");
		this.mp -= 5;
		System.out.println("MP��5������I");
		this.hp = this.MAX_HP;
		System.out.println("HP���ő�܂ŉ񕜂����I");
		System.out.println("HP: " + this.hp + ",  MP: " + this.mp);
	}

	public int pray(int sec) {
		int recover = sec + new Random().nextInt(3);
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
		this.mp += recoverActual;
		System.out.println("MP��" + recoverActual + "�񕜂����I");
		System.out.println("HP: " + this.hp + ",  MP: " + this.mp);
		return recoverActual;
		
	}

	
}
