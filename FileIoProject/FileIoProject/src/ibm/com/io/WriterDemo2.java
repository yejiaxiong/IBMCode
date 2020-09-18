package ibm.com.io;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class WriterDemo2 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\GBA\\IO" + File.separator+"test.txt");
        Writer out=new FileWriter(f,true);//×·¼Ó
        String str="\r\nHello ×Ö·ûÁ÷";
        out.write(str);
        out.close();
    }
}
