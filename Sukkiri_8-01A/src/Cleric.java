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
		System.out.println("聖職者はセルフエイドを唱えた！");
		this.mp -= 5;
		System.out.println("MPを5消費した！");
		this.hp = this.MAX_HP;
		System.out.println("HPが最大まで回復した！");
		System.out.println("HP: " + this.hp + ",  MP: " + this.mp);
	}

	public int pray(int sec) {
		int recover = sec + new Random().nextInt(3);
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した！");
		System.out.println("HP: " + this.hp + ",  MP: " + this.mp);
		return recoverActual;
		
	}

	
}
