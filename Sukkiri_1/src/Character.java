
public abstract class Character {
	private String name;
	private int hp;
	private int mp;
	
	public Character(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	public void run(){
		System.out.println("Ç§Ç‹Ç≠ì¶Ç∞ÇÁÇÍÇΩÅI");
	}

	public String getName() {
		return this.name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp){
		this.hp = hp;
	}
	
	public int getMp() {
		return this.mp;
	}
	
	public void setMp(int mp){
		this.mp = mp;
	}
}
