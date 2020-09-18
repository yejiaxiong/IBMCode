package ibm.com.file;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
public class StringBufferDemo {
	public static void main(String[] args) throws IOException {
		String fileName="C:/JMPX/sms.log";//演示之前看是否存在这个文件，不存在就创建
		File file=new File(fileName);
        if(!file.exists())
            file.createNewFile();
        FileOutputStream out=new FileOutputStream(file,true);        
        for(int i=0;i<1000;i++){
            StringBuffer sb=new StringBuffer();
            sb.append("这是第"+i+"行:前面介绍的各种方法都不关用,为什么总是奇怪的问题 ");
            out.write(sb.toString().getBytes("utf-8"));
        }        
        out.close();
    }
}
