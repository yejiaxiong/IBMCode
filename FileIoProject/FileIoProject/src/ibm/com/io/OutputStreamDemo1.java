package ibm.com.io;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class OutputStreamDemo1 {
	 public static void main(String[] args) throws IOException {
		    File f = new File("C:\\GBA\\IO" + File.separator+"test.txt");
	        OutputStream out=new FileOutputStream(f);//����ļ������ڻ��Զ�����
	        String str=" Beautiful";
	        byte[] b=str.getBytes();
	        out.write(b);//��Ϊ���ֽ���������Ҫת�����ֽ�����������
	        out.close();
	    }
}
