package ibm.com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamDemo {
	 /**读文件
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
            buf=new byte[1024];//重新生成，避免和上次读取的数据重复
        }
        return sb.toString();
    }
	
	public static void main(String[] args) throws IOException {
	    String path="C:\\JMPX\\Copy\\reName.log";//测试之前先查看是否存在这个文件
		String str=fileInputStream(path);
		System.out.println("打印读出来的内容："+str);
    }
}
