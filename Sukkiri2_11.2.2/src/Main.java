import java.io.*;
import java.net.*;

public class Main {

	public static void main(String[] args) throws IOException {

		/*
		 * �T�[�o�[��PC�Ԃ̒ʐM���s���ɂ́A�v���g�R���yTCP/IP�z��p����B
		 * 
		 * �y�ڑ����s�����z�̃v���O���� TCP/IP���g���Đڑ����s���ɂ́Ajava.net�p�b�P�[�W�́ySocket�N���X�z��p����B
		 */

		/*
		 * �@�uIP�A�h���X / �T�[�o�[���v�Ɓu�|�[�g�ԍ��v���w�肵�āASocket�C���X�^���X��new����
		 */
		Socket sock = new Socket("dokojava.jp", 80);

		/*
		 * �ASocket������̓X�g���[���iPC���T�[�o�[�j���擾����
		 */
		InputStream is = sock.getInputStream();

		/*
		 * �BSocket����o�̓X�g���[���i�T�[�o�[��PC�j���擾����
		 */
		OutputStream os = sock.getOutputStream();

		/*
		 * �v���g�R�� �|�[�g �p�r ********** ****** ****************** HTTP TCP 80
		 * Web�y�[�W�̎擾 SMTP TCP 25 ���[���̑��M FTP TCP20/21 �t�@�C���̓`�� SSH TCP 22 �����[�g���O�C��
		 * 
		 * �q�d�l��r "GET �t�@�C���� HTTP/1.0(���s)".getBytes() "(���s)".getBytes()
		 */
		os.write("GET /index.html HTTP/1.0\r\n".getBytes());
		os.write("\r\n".getBytes());
		os.flush();

		InputStreamReader isr = new InputStreamReader(is);
		int i = isr.read();
		while (i != -1) {
			System.out.println((char) i);
			i = isr.read();
		}

		/*
		 * �CSocket�����i���̂Ƃ��AInputStream �� OutputStream �͎����I��close�����j
		 */
		sock.close();

	}
}
