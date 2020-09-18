package ibm.com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
public class InputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\GBA\\IO" + File.separator+"test.txt");
        InputStream in=new FileInputStream(f);
        System.out.println("文件大小："+f.length());
        byte[] b=new byte[(int) f.length()];
        in.read(b);
        in.close();
        System.out.println(new String(b));
    }

}
