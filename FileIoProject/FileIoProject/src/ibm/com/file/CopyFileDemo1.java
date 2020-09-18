package ibm.com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileDemo1 {
	public static void main(String[] args) throws IOException {
		String fileSrc = "C:/JMPX/HelloWorld.txt";
		String fileDes = "C:/JMPX/Copy/HelloWorld.txt";
		InputStream fis = null; // ��������������
		OutputStream fos = null; // �������������
		try {
			fis = new FileInputStream(fileSrc);
			fos = new FileOutputStream(fileDes);
			long num = 0; // ��ȡ�ֽڼ���
			int bt = 0; // ÿ�ζ����ֽ�����
			// �������ļ�ĩβʱ���������ݵ�ֵΪ-1��ÿ�ζ���һ���ֽڣ���ű���bt�У�ֱ�����������ļ�
			while ((bt = fis.read()) != -1) {
				// ����ĸ����ʽ�������ļ���ÿ���ֽ�
				fos.write(bt); // ���ֽ�д��������У�ʵ��copy����
				num++;
			}
			System.out.println("��ȡ���ֽ���Ϊ" + num + "\n �ļ����Ƴɹ�");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
