import org.apache.commons.lang3.builder.*;

public class Bank {

	String name;
	String address;
	
	//�u�N���X�ɑ��݂��邷�ׂẴt�B�[���h�������Ȃ�A2�̃I�u�W�F�N�g�𓯂��ƌ��Ȃ��v���\�b�h
	public boolean equals(Object o){
		return EqualsBuilder.reflectionEquals(this, o);
	}
	/*
	 * �y�{���̂����z
	 * public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Bank)) {
			return false;
		}
		Bank b = (Bank) o;
		//�u���O�ƏZ���v�������ł���� true
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
	 * �y�{���̂����z
	 * public int hashCode() {
		int results = 37;
		results = results * 31 + name.hashCode();
		results = results * 31 + address.hashCode();
		return results;
	}
	 */
	
	
	
	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.name = "�O�HUFJ";
		b1.address = "�����s";
		
		Bank b2 = new Bank();
		b2.name = "�O�HUFJ";
		b2.address = "�����s";
		
		System.out.println(b1.equals(b2));
	}
}
