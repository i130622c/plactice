
import java.util.*;
public class Main {

	public static void main(String[] args) {
		/*
		 * �y�L�[���w�肵�A�Ή�����v���p�e�B�l���擾�z
		 * System.getProperty(String key) : �w�肵���L�[�̒l�i������j���擾�B
		 * System.getProperty(String key, String def) : �w�肵���L�[�̒l�i������j���擾�B�v���p�e�B�l���Ȃ��ꍇ�A�f�t�H���g�l��Ԃ��B
		 * 
		 * System.getInteger(String key) : �w�肵���L�[�̒l�iInteger�j���擾�B
		 * System.getInteger(String key, int def) : �w�肵���L�[�̒l�iInteger�j���擾�B�v���p�e�B�l���Ȃ��ꍇ�A�f�t�H���g�l��Ԃ��B
		 * 
		 * System.getBoolean(String key) : �w�肵���L�[�̒l�iboolean�j���擾�B�v���p�e�B�l���Ȃ��ꍇ�Afalse��Ԃ��B
		 */
		System.out.println("�yJava�o�[�W�����z");
		System.out.println(System.getProperty("java.version"));
		
		
		/*
		 * �y�L�[ �� �l ���Z�b�g�Ŏ擾�i�v���p�e�B�|���X�g�̎擾�j�z
		 * System.getProperty() : Properties�^�Ŏ擾
		 * 
		 * management.RuntimeMXBean.getSystem.Properties() : Map<String, String>�Ŏ擾
		 */
		System.out.println("�y�V�X�e���v���p�e�B�ꗗ�z");
		Properties p = System.getProperties(); 
		
		//stringPropertyNames() : �v���p�e�B�|���X�g���́u�L�[ & �Ή�����l�i������j�v���Z�b�g�Ŏ擾
		/*���X�g�v�f�̎��o�����@�́A1)for��, 2)�g��for��, 3)iterator
		 * 
		 * Iterator<���X�g�v�f�̌^> it = ���X�g�ϐ�.iterator();
		 * while(it.hasNext()){���X�g�v�f�̌^ e = it.next();}
		 */
		Iterator<String> it = p.stringPropertyNames().iterator(); 
		while(it.hasNext()){
			String key = it.next();
			System.out.print(key + " = ");
			System.out.println(System.getProperty(key));
		}
		
		/*
		 * �y�w�肵���L�[�ɑΉ�����v���p�e�B�|�l��ύX�z
		 * System.setProperty(String key, String value) : �w�肵���L�[�ɑΉ�����l���u�ݒ�v
		 * System.clearProperty(String key) : �w�肵���L�[�ɑΉ�����l���u�폜�v
		 */
	}
}
