import java.lang.reflect.*;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * �y�w�肵���N���X�Ɋւ�������擾������@�z
		 * 1) Class<?> cinfo = Class.forName(FQCN������);
		 * 2) Class<?> cinfo = �N���X��.class;
		 * 3) Class<?> cinfo = �ϐ���.getClass();
		 */
		Class<?> clazz = RefSample.class; //(2)

		/*
		 * �y�����o���擾���邽�߂̃��\�b�h�z 
		 *  java.util.reflrct�p�b�P�[�W�ɑ�����uField�N���X�v�uMethod�N���X�v�uConstructor�N���X�v�𗘗p
		 *  ��{�I�ɁA�w�肵���N���X�ɐ錾���ꂽ�t�B�[���h�A���\�b�h�A�R���X�g���N�^�̂ݕԂ��B
		 *  ��)�e�N���X����p���������m�������Ď擾����ꍇ�A�uDeclared�v����菜���I
		 */
		
		//getDeclaredConstructor() : �R���X�g���N�^�̈ꗗ���擾����
		Constructor<?> cons = clazz.getConstructor(int.class); // -> �uint�^�v�̈������u1�v�w�肵�Ă���R���X�g���N�^���擾
		
		
		//newInstance() : �w�肳�ꂽ������p���ăC���X�^���X�𐶐�����
		RefSample rs = (RefSample) cons.newInstance(256); // -> �R���X�g���N�^ RefSample(int x) �Ɂu256�v��n���Anew����
		
		
		//getDeclaredField(String name) : �w�肵�����O�̃t�B�[���h���擾����
		//getDeclaredFields() : �t�B�[���h�̈ꗗ���擾����
		Field f = clazz.getField("times"); // -> int�^�t�B�[���h�utimes�v���擾
		
		
		//set(Object obj, Object value) * obj: �t�B�[���h��ύX����I�u�W�F�N�g, value: �V�����t�B�[���h�l 
		f.set(rs, 2); //�uRefSample�v�C���X�^���X�́utime�v�t�B�[���h�Ɂu2�v����
		
		
		//get(Object obj) *obj: �擾���悤�Ƃ��Ă���t�B�[���h�l���錾����Ă���I�u�W�F�N�g
		System.out.println(f.get(rs)); // -> �uRefSample�C���X�^���X�v�ɐ錾����Ă���utimes�v�t�B�[���h�̒l���擾
		
		
		//getDeclaredMethod(String name, Class<?>...parameterTyoes) : �w�肵�����O�ƈ����̌^�������\�b�h���擾
		//* name: ���\�b�h�̖��O, parameterTypes: �����̌^
		//getDeclaredMethods() : ���\�b�h�̈ꗗ���擾����
		Method m = clazz.getMethod("hello", String.class, int.class); // -> hello(String msg, int t)���擾
		
		
		//invoke(Object obj, Object...args) : ���\�b�h���A�w�肵���I�u�W�F�N�g�ɑ΂��Ďw�肵�������ŌĂяo��
		//* obj: ���\�b�h���錾����Ă���I�u�W�F�N�g, args: ���\�b�h�̌Ăяo���Ɏg�p�������
		m.invoke(rs, "reflection!", 128);
		
		
		//getModifiers() : �N���X�܂��̓C���^�[�t�F�[�X�̑������(static, final, public...)��Ԃ�
		// * �Ԃ�l: ���������uint�^�v�ɕ��������ĕԂ�
		
		//isPublic(int mod) : �����̈�����public�C���q���܂܂��ꍇ��true��Ԃ�
		boolean pubc = Modifier.isPublic(clazz.getModifiers());
		System.out.println(pubc);
		
		//isFinal(int mod) : �����̈�����final�C���q���܂܂��ꍇ��true��Ԃ�  
		boolean finm = Modifier.isFinal(m.getModifiers());
		System.out.println(finm);
	}
}
