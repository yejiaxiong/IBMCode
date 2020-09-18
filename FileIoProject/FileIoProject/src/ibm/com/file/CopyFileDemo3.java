package ibm.com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
public class CopyFileDemo3 {
    public static void main(String[] args) throws IOException {
    	 String fileSrc="C:/JMPX/HelloWorld.txt";
	     String fileDes="C:/JMPX/Copy/HelloWorld.txt";
	     FileInputStream fi = null;
	     FileOutputStream fo = null;
	     FileChannel in = null;
	     FileChannel out = null;
	     try {
	      fi = new FileInputStream(fileSrc);
	      fo = new FileOutputStream(fileDes);
	      in = fi.getChannel();//得到对应的文件通道
	      out = fo.getChannel();//得到对应的文件通道
	      in.transferTo(0, in.size(), out);//连接两个通道，并且从in通道读取，然后写入out通道
	     } catch (IOException e) {
	      e.printStackTrace();
	     } finally {
	      try {
	       fi.close();
	       in.close();
	       fo.close();
	       out.close();
	      } catch (IOException e) {
	       e.printStackTrace();
	      }
	     }  
	     System.out.println("C:/JMPX/Copy文件夹文件复制成功");
    }
}
