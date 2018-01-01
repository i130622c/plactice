import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Cleric c1 = new Cleric();
		
		c1.selfAid();
		System.out.println("”š‚ğ“ü—Í");
		int sec = s.nextInt();
		c1.pray(sec);
		
	}
}
