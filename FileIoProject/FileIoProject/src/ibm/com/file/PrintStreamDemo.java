package ibm.com.file;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
public class PrintStreamDemo {
	public static void main(String[] args) throws IOException {
		 try {
			    String fileName="C:/JMPX/HelloWorld.txt";//演示之前看是否存在这个文件，不存在就创建
	            FileOutputStream out=new FileOutputStream(fileName);
	            PrintStream p=new PrintStream(out);
	            for(int i=0;i<10;i++)
	                p.println("This is "+i+" line");
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
    }
}
