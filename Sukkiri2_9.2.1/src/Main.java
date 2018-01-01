import java.io.*;

import javax.crypto.Cipher;
public class Main {

	/*
	 * �y3�̃G���[�̎�ށz
	 * �@Syntax Error(���@�G���[) -> �R���p�C�����w�E�����R�[�h�̉ӏ����C������΂悢�B
	 * �ARuntime Error�i���s���G���[�j -> �u�\�߃G���[�������������̑Ή���v���L�q���Ă����K�v������ �i= ��O�����j
	 * �BLogic Error�i�_���G���[�j -> �����ӏ������͂ŒT���o���ďC���B
	 * 
	 * �y3�̗�O�N���X�z
	 * �@Error�n��O: try-catch �ŃL���b�`����K�v�́u�Ȃ��v�B
	 * �AException�n��O: try-catch �ŃL���b�`�u�K�{�v�B�L���b�`���Ȃ��ƃR���p�C���G���[�B
	 * �BRuntimeException: try-catch �ŃL���b�`���邩�́u�C�Ӂv�B
	 */
	public static void main(String[] args)  {
		
		/*
		 * ******************************
		 * *�e�L�X�g�t�@�C���ւ̏�������*
		 * ******************************
		 */
		
		/*�y�t�@�C�����J���z
		 * 1) FileWriter(String fileName, boolean append) throws IOException (�t�@�C���̐V�K�쐬 or �������݃��Z�b�g)
		 * 2) FileWriter(String fileName) throws IOException (true: �㏑��, false: �������݃��Z�b�g/�t�@�C���̐V�K�쐬)
		 * 
		 * -fileName: �V�X�e���ɑ��݂���t�@�C���ւ̃p�X
		 * -append: true�̏ꍇ�A�o�C�g���u�t�@�C���̐擪�ł͂Ȃ��Ō�v�ɏ������܂�� 
		 * [��O] IOException - �w�肳�ꂽ�t�@�C�������݂��邪�ʏ�t�@�C���ł͂Ȃ��f�B���N�g���ł���ꍇ�A
		 * ���݂����쐬���ł��Ȃ��ꍇ�A�܂��͉��炩�̗��R�ŊJ�����Ƃ��ł��Ȃ��ꍇ
		 */
		try(FileWriter fw = new FileWriter("c:\\Users\\tmiya\\workspace\\Sukkiri2_9.2.1\\data.dat", false);){
			
			
			/*�yJVM�Ƀt�@�C���ɏ������ނ悤�w���𑗂�z
			 * write(String str) throws IOException
			 * 
			 * -str: �������܂�镶����
			 * [��O] IOException - ���o�̓G���[�����������ꍇ
			 */
			fw.write(" Minato");
			
			
			/*�yJVM�ɑ΂��ăt�@�C���ւ̏������݂������I�ɍs�킹��z
			 * flush() throws IOException
			 * 
			 * [��O] IOException - ���o�̓G���[�����������ꍇ
			 */
			fw.flush();
			
		} catch(IOException e) {
			System.out.println("�t�@�C���������݃G���[�ł�");
		}
		
		/*
		 * �y�V�@�\�zfinally�u���b�N�̒��� close() ���L�q�����ɍςނ悤��
		 * try(FileWriter fw = new FileWriter("c:\\~", true);){
		 * 		�i���폈���j
		 * } catch(IOException e) {
		 *  	�i��O�����j
		 * }
		 * 
		 * 
		 * �y�]���z
		 * FileWriter fw = null; //try�u���b�N�̊O�ŏ��������Ȃ��ƁAfinally�u���b�N��close()���ĂׂȂ�
		 * try{
		 * 		fw = new FileWriter("c:\\~", true);
		 * 		�i���폈���j
		 * } catch(IOException) {
		 * 		�i��O�����j
		 * } finally { //�K���t�@�C����������邽�߂�finally�u���b�N
		 * 		if(fw != null){
		 * 			try{ //close()��IOException�𑗏o����\�����l����
		 * 				if(fw != null)
		 * 					fw.close();
		 * 				}
		 * 			} catch (IOException e2){
		 * 			}
		 * }
		 */
		
		
		/*
		 * ***************************
		 * �e�L�X�g�t�@�C���̓ǂݍ���*
		 * ***************************
		 */
		
		/*�y�t�@�C�����J���z
		 * FileReader(String fileName) throws FileNotFoundException
		 * 
		 * -fileName: �ǂݍ��ރt�@�C���ւ̃p�X
		 * 
		 * [��O] FileNotFoundException - �w�肳�ꂽ�t�@�C�������݂��Ȃ����A
		 * �ʏ�t�@�C���łȂ��f�B���N�g���ł��邩�A�܂��͂Ȃ�炩�̗��R�ŊJ�����Ƃ��ł��Ȃ��ꍇ
		 */
		try(FileReader fr = new FileReader("c:\\Users\\tmiya\\workspace\\Sukkiri2_9.2.1\\data.dat");){
		
			System.out.println("�t�@�C���ǂݍ��݊J�n");
			
			/*�y�P��̕�����ǂݍ��ށz
			 * read() throws IOException
			 * 
			 * �ǂݍ��񂾕����́A�uint�^�v�ŕԂ����i�X�g���[���̏I���ɒB�����ꍇ�A�u-1�v���Ԃ�j
			 * [��O] IOException - ���o�̓G���[�����������ꍇ
			 */
			int i = fr.read();
			
			while(i != -1){  //�X�g���[���̏I���ɒB����܂ł̊�
				char c = (char) i; //�ǂݍ��񂾕�����int�^�ŕԂ����̂ŁAchar�^�ɃL���X�g����
				System.out.println("�t�@�C���ǂݍ��݌���: " + c);
				i = fr.read();
			}
			System.out.println("�t�@�C�������ɓ��B");
		} catch(IOException e2){
			System.out.println(e2.getMessage()); //getMessage() -> �G���[���b�Z�[�W��String�^�Ŏ擾����
			e2.printStackTrace(); // printStackTrace() -> �X�^�b�N�g���[�X�̓��e����ʂɏo�͂���
		}
		
	}
}
