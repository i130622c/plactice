
import java.io.IOException;
import java.net.*;
public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("�N������");
		
		/*
		 * �y�ڑ���҂��󂯂鑤�z�̃v���O����
		 * PC����̒ʐM��҂��󂯂�ɂ́Ajava.net�p�b�P�[�W�́yServerSocket�N���X�z�𗘗p����
		 */
		
		/*
		 * �@�u�҂��󂯃|�[�g�ԍ��v���w�肵�āAServerSocket�C���X�^���X��new����
		 */
		ServerSocket svSock = new ServerSocket(39648);
		
		Socket sock = svSock.accept();
		
		System.out.println(sock.getInetAddress() + "����ڑ�");
		
		sock.getOutputStream().write("WELCOME".getBytes());
		sock.getOutputStream().flush();
		sock.close();
	}
}
