
public class Main {

	/*
	 * �y�������Ɋւ�����̎擾�z 
	 * �@Runtime.getRuntime()���\�b�h���Ăяo���ARuntime�C���X�^���X�𐶐�
	 * �ARuntime�C���X�^���X�ɑ΂��āA�ȉ��̃��\�b�h���Ăяo���i�߂�l: long�^, �P��: �o�C�g�j
	 *  freeMemory() : �c�胁�����e�ʂ�Ԃ�
	 *  totalMemory() : ���݂̃��������e�ʂ�Ԃ�
	 *  maxMemory() : ���������e�ʂ̌��E�l��Ԃ�
	 *  
	 *  �q���p�l: �R���s���[�^�Ŏg�p�����l�r
	 *  1B  -(1024�{ : 2^10�{)->  1KB  -(1024�{)->  1MB  -(1024�{)->  1GB  -(1024�{)->  1TB
	 *  
	 *  �q���ےP�ʌn: �ʏ�̒P�ʁr
	 *  1B  -(1000�{ : 10^3�{)->  1KB  -(1000�{)->  1MB  -(1000�{)->  1GB  -(1000�{)->  1TB
	 */

	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();

		// �o�C�g�Ŏ擾
		long f1 = run.freeMemory();
		long f2 = run.totalMemory();
		long f3 = run.maxMemory();

		System.out.println("�c������: " + f1 + " B, �g�p������: " + f2 + " B, ���������e�ʌ��E�l: " + f3 + " B");

		// MB�Ŏ擾
		long f4 = run.freeMemory() / 1024 / 1024;
		long f5 = run.totalMemory() / 1024 / 1024;
		long f6 = run.maxMemory() / 1024 / 1024;

		System.out.println("�c������: " + f4 + " MB, �g�p������: " + f5 + " MB, ���������e�ʌ��E�l: " + f6 + " MB");
	}
}
