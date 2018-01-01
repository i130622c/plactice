import org.apache.commons.lang3.builder.*;

public class Bank {

	String name;
	String address;
	
	//「クラスに存在するすべてのフィールドが等価なら、2つのオブジェクトを同じと見なす」メソッド
	public boolean equals(Object o){
		return EqualsBuilder.reflectionEquals(this, o);
	}
	/*
	 * 【本来のやり方】
	 * public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Bank)) {
			return false;
		}
		Bank b = (Bank) o;
		//「名前と住所」が同じであれば true
		if (! name.equals(b.name)) {
			return false;
		} 
		if (! address.equals(b.address)) {
			return false;
		} 
		
		return true;
	}
	 */
	
	
	public int hashCode(){
		return HashCodeBuilder.reflectionHashCode(this);
	}
	
	/*
	 * 【本来のやり方】
	 * public int hashCode() {
		int results = 37;
		results = results * 31 + name.hashCode();
		results = results * 31 + address.hashCode();
		return results;
	}
	 */
	
	
	
	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.name = "三菱UFJ";
		b1.address = "東京都";
		
		Bank b2 = new Bank();
		b2.name = "三菱UFJ";
		b2.address = "東京都";
		
		System.out.println(b1.equals(b2));
	}
}
