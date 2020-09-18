package ibm.com.io;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class OutputStreamDemo3 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\GBA\\IO" + File.separator+"test.txt");
        OutputStream out = new FileOutputStream(f, true);//×·¼ÓÄÚÈÝ
        String str = "\r\nHello World";
        byte[] b = str.getBytes();
        for (int i = 0; i < b.length; i++) {
            out.write(b[i]);
        }
        out.close();
    }
}
