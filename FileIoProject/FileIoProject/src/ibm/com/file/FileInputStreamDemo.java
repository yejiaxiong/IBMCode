package ibm.com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamDemo {
	 /**���ļ�
     * @param path
     * @return
     * @throws IOException
     */
	public static String fileInputStream(String path) throws IOException{
        File file=new File(path);
        if(!file.exists()||file.isDirectory())
            throw new FileNotFoundException();
        FileInputStream fis=new FileInputStream(file);
        byte[] buf = new byte[1024];
        StringBuffer sb=new StringBuffer();
        while((fis.read(buf))!=-1){
            sb.append(new String(buf));    
            buf=new byte[1024];//�������ɣ�������ϴζ�ȡ�������ظ�
        }
        return sb.toString();
    }
	
	public static void main(String[] args) throws IOException {
	    String path="C:\\JMPX\\Copy\\reName.log";//����֮ǰ�Ȳ鿴�Ƿ��������ļ�
		String str=fileInputStream(path);
		System.out.println("��ӡ�����������ݣ�"+str);
    }
}
