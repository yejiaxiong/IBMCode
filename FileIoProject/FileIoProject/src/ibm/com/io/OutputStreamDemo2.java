package ibm.com.io;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class OutputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\GBA\\IO" + File.separator+"test.txt");
        OutputStream out = new FileOutputStream(f);//如果文件不存在会自动创建
        String str = "Hello World";
        byte[] b = str.getBytes();
        for (int i = 0; i < b.length; i++) {
            out.write(b[i]);
        }
        out.close();
    }
}
