
public class Main {

	public static void main(String[] args) {
		/*
		 * �y�w�肵���N���X�Ɋւ�������擾������@�z
		 * 1) Class<?> cinfo = Class.forName(FQCN������);
		 * 2) Class<?> cinfo = �N���X��.class;
		 * 3) Class<?> cinfo = �ϐ���.getClass();
		 */
		
		Class<?> cinfo = String.class; //�N���X�̏����擾(2)
		
		/*
		 * �y�^�����擾���邽�߂̃��\�b�h�z
		 */
		System.out.println(cinfo.getName()); //FQCN���擾���� -> java.lang.String
		System.out.println(cinfo.getSimpleName()); //�N���X�������̂ݎ擾���� -> String
		
		//getPacage()���\�b�h: ��������p�b�P�[�W����Ԃ�
		//getName()�Ƒg�ݍ��킹�邱�ƂŁA�p�b�P�[�W�����擾�ł���
		System.out.println(cinfo.getPackage().getName()); //��������p�b�P�[�W�����擾���� -> java.lang
		
		System.out.println(cinfo.isArray()); //�z��ł��邩�ǂ������ׂ� -> false
		System.out.println(cinfo.isInterface()); //�C���^�[�t�F�[�X�ł��邩�ǂ������ׂ� -> false
		System.out.println(cinfo.isEnum()); //�񋓌^�ł��邩���ׂ� -> false
		
		Class<?> cinfo2 = cinfo.getSuperclass(); //�e�N���X�̏����擾����
		System.out.println(cinfo2.getName()); // -> java.lang.Object
		System.out.println(cinfo2.getSimpleName()); // -> Object
		
		
		
		Class<?> cinfo3 = args.getClass(); //�N���X�̏����擾(3)
		System.out.println(cinfo3.isArray()); //String[]�^�ł��邽�߁A-> true
	}
}
