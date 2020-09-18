package ibm.com.io;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
public class InputStreamDemo3 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\GBA\\IO" + File.separator+"test.txt");
        InputStream in=new FileInputStream(f);
        byte[] b=new byte[(int) f.length()];
        for(int i=0;i<b.length;i++){
            b[i]=(byte) in.read();
        }
        in.close();
        System.out.println(new String(b));
    }
}
