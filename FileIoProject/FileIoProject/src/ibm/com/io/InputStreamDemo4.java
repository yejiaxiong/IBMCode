package ibm.com.io;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
public class InputStreamDemo4 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\GBA\\IO" + File.separator+"test.txt");
        InputStream in=new FileInputStream(f);
        byte[] b=new byte[1024];
        int temp=0;
        int len=0;
        while((temp=in.read())!=-1){//-1为文件读完的标志
            b[len]=(byte) temp;
            len++;
        }
        in.close();
        System.out.println(new String(b,0,len));
    }
}
