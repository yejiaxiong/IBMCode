package ibm.com.file;

import java.io.File;
import java.io.IOException;

public class NewFileDemo {
	public static void main(String[] args) throws IOException {

		File f = new File("C:/JMPX");
		f.mkdir();// �����ļ���
		File ff = new File(f, "HelloWorld.txt");
		boolean b = ff.createNewFile();// �����ļ�
		System.out.println(b);
		File f1 = new File("C:/JMPX/Copy");
		boolean bool = f1.mkdirs();// �����ļ��� �Ա����潲�ļ�������
		System.out.println(bool);
	}
}
