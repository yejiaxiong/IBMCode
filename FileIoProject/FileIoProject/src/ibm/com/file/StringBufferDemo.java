package ibm.com.file;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
public class StringBufferDemo {
	public static void main(String[] args) throws IOException {
		String fileName="C:/JMPX/sms.log";//��ʾ֮ǰ���Ƿ��������ļ��������ھʹ���
		File file=new File(fileName);
        if(!file.exists())
            file.createNewFile();
        FileOutputStream out=new FileOutputStream(file,true);        
        for(int i=0;i<1000;i++){
            StringBuffer sb=new StringBuffer();
            sb.append("���ǵ�"+i+"��:ǰ����ܵĸ��ַ�����������,Ϊʲô������ֵ����� ");
            out.write(sb.toString().getBytes("utf-8"));
        }        
        out.close();
    }
}
