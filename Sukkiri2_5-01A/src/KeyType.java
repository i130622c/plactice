
public enum KeyType {

	PADLOCK("�싞��"), BUTTON("���{�^��"), DIAL("�_�C����"), FINGER("�w��F��");
	
	private String name;
	
	KeyType(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}
