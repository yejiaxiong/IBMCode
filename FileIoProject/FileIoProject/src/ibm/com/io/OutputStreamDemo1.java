package ibm.com.io;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class OutputStreamDemo1 {
	 public static void main(String[] args) throws IOException {
		    File f = new File("C:\\GBA\\IO" + File.separator+"test.txt");
	        OutputStream out=new FileOutputStream(f);//如果文件不存在会自动创建
	        String str=" Beautiful";
	        byte[] b=str.getBytes();
	        out.write(b);//因为是字节流，所以要转化成字节数组进行输出
	        out.close();
	    }
}
