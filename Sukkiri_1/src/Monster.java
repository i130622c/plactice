
public abstract class Monster {
	private String suffix;
	
	public Monster(String suffix){
		this.suffix = suffix;
	}
	
	public abstract void attack(Character c);
	public abstract void run();
	
	public String getSuffix(){
		return this.suffix;
	}
}
